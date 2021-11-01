# レイテンシ算出

  - [はじめに](#はじめに)
  - [レイテンシ算出への準備](#レイテンシ算出への準備)
    - [準備](#準備)
    - [外れ値を除外する](#外れ値を除外する)
      - [*csv*ファイルを配置する](#csv-ファイルを配置する)
      - [**ExcludeValues.xlsm**に取り込む](#excludevaluesxlsm-に取り込む)
      - [外れ値の除外](#外れ値の除外)
        - [外れ値が極端に多い場合](#外れ値が極端に多い場合)
  - [レイテンシ算出の手順](#レイテンシ算出の手順) 
      - [必要事項をsummaryシートに埋める](#必要事項をsummaryシートに埋める)
      - [回帰分析でレイテンシ算出](#回帰分析でレイテンシ算出)
  - [csvに変換](#csvに変換)
      - [マクロを実行して*csv*ファイルを生成](#マクロを実行してcsvファイルを生成)
      - [そのファイルを*csv*形式で保存](#そのファイルをcsv形式で保存)
      - [レイテンシ挿入ツールの規則に沿うように変換](#レイテンシ挿入ツールの規則に沿うように変換)
  - [SHIMへの挿入](#shimへの挿入)

## はじめに

本ディレクトリ *latency* では実機計測で得たファイルをもとにしたレイテンシの算出およびSHIM XMLへの挿入ツールを提供します。

## レイテンシ算出への準備
### 準備

実行には以下のツールが必要です。

+ *xlsx*，*xlsm* ファイルでマクロが実行できる環境
  + *EXCEL 2019* での実行を確認

準備するファイルは以下の通りです。

+ [measure](../measure)で得た *csv* ファイル

### 外れ値を除外する

実機計測で得た結果から外れ値を除外します。手順は以下の通りです。

#### *csv* ファイルを配置する

実機計測で得たすべてのファイルを [*ExcludeValues*](./ExcludeValues) 内に配置してください。

#### **ExcludeValues.xlsm** に取り込む

1. [**ExcludeValues.xlsm**](./ExcludeValues/ExcludeValues.xlsm) を開く
2. 「表示」→「マクロ」の「Reading_CSV」を実行する
3. すべての *csv* ファイルが新しいシートとして追加されたのを確認する

![csvファイルを取り込んだときの画面](../images/csv.bmp)

#### 外れ値の除外

1. 同じくマクロの「Run_median_macro」を実行する
2. 許容範囲の設定を行う
   + 0.2や0.1など0以上1以下の割合を設定する
   + 特に範囲にこだわりがなければ2項目とも0.1に設定する
3. *sheet1* に除外された結果が出力されたのを確認する

##### 外れ値が極端に多い場合

一律に許容範囲を設定するために極端に外れ値が多くなる場合がある。
そのときは取り込んだ各 *csv* ファイルのシート内の *L1Access/Refill* 回数の「Upper」、「Lower」を手動で書き換えれば計算し直して反映してくれる。

### レイテンシ算出の手順

[**calc.xlsm**](./calc.xlsm) を用いてレイテンシの算出を行います。手順は以下の通りです。

1. [必要事項を*summary*シートに埋める](#必要事項をsummaryシートに埋める)
2. [回帰分析でレイテンシ算出](#回帰分析でレイテンシ算出)

#### 必要事項を*summary*シートに埋める

[**calc.xlsm**](/calc.xlsm)の*summary*シートに必要事項を入力します。入力する事項は以下の通りです。

+ **ExcludeValues.xlsm** の *sheet1* の値
  + *TotalCycle* を [**calc.xlsm**](./calc.xlsm) の*summary*シートと*regression*シートの *TotalCycle* に入力
  + *NewMissRate*を*summary*シートの *L1 missRate*に入力
  + *L1-D-Access* の*New Average*を *L1 Access*に入力

※ 2シートともオレンジ色のセルが埋まり切ればよい。

#### 回帰分析でレイテンシ算出

*regression*シートにて、ソルバー機能を用いて各変数のレイテンシを求めます。
本ファイルでは実機実行サイクルと見積りサイクルの差の最小二乗法でレイテンシを算出します。

回帰分析は「データ」→「ソルバー」を選択し、各パラメータを以下のように設定して行います。

```bash
・目的セルの設定：AE2 (灰色のセル)
・目標値：最小値
・変数セル：C2～AB2 (緑、赤のセル)
・制約条件：
  - 2行目(緑、赤のセル)が非負
  - AF列(実機実行サイクルと見積りサイクルの差の2乗)が±0.2以内
・制約のない変数を非負数にする：☑
・解決方法の選択：GRG 非線形
```

2行目の緑色のセルに計算されたレイテンシが出力されます。
制約条件を満たす解が見つからなくても、最適なレイテンシが得られます。

### csvに変換

レイテンシをSHIMに挿入するツールで使えるcsvファイルに変換します。手順は以下の通りです。

1. [マクロを実行して *csv* ファイルを生成](#マクロを実行してcsvファイルを生成)
2. [そのファイルを *csv* 形式で保存](#そのファイルをcsv形式で保存)
3. [レイテンシ挿入ツールの規則に沿うように変換](#レイテンシ挿入ツールの規則に沿うように変換)

#### マクロを実行して*csv*ファイルを生成

先の工程で使った [**calc.xlsm**](./calc.xlsm) から命令名とレイテンシのセルのみを抜き出します。
「表示」→「マクロ」の「*outputCSV*」を実行してください。緑色と青色のセルのみの新しいファイルが生成されれば成功です。

#### そのファイルを*csv*形式で保存

そのファイルを「名前を付けて保存」で保存します。以下の3点に注意してください。

+ ファイルの種類をCSVにする
+ ファイル名を「**input.csv**」にする
+ [latency/*trans*/*inst*](./trans/inst) 内に保存

![csvファイルとして保存](../images/save.bmp)

#### レイテンシ挿入ツールの規則に沿うように変換

**transcsv.py**を動かして先ほど作成した *csv* ファイルをレイテンシ挿入ツールに対応した形に変換します。
*trans* ディレクトリ内で以下のコマンドを実行することで、「**output.csv**」が出力されます。

`python transcsv.py`

出力されるファイル(**output.csv**)の例は[**sample.csv**](./trans/sample.csv)をご確認ください。

### *SHIM*への挿入

**output.csv**を*SHIM*に挿入します。
*Java*の環境はバージョン8以降を想定しています。

#### 準備

以下のファイルを準備してください。すべて[*trans*](./trans)内に配置してください。

+ [**AmaltheaTools.jar**](./trans/AmaltheaTools.jar)
+ **output.csv**(先ほど [./trans/](./trans) に生成したもの)
+ **SHIM.xml**

#### *SHIM*に挿入

以下のコマンドで*SHIM*にレイテンシが挿入できます。

```console
java -classpath ./AmaltheaTools.jar Performance2SHIM [options...] [ShimFile]
```

|オプション                                            |説明                                                                  |
|---                                                   |---                                                                   |
|\-F,\-func\[tionalunitset\],\-\-func\[tionalunitset\] |処理対象を _FunctionalUnitSet_ のみを含む _SHIM2\.0_ のファイルにする |
|\-N,\-new,\-\-new                                     |新たに _FunctionalUnitSet_ のみを含む _SHIM2\.0_ のファイルを出力     |
|\-o,\-out\[put\],\-\-out\[put\]                       |出力する _SHIM2\.0_ ファイルの指定                                    |
|\-d,\-dir\[ectory\],\-\-dir\[ectory\]                 |出力ディレクトリの指定                                                |
|\-s,\-suffix,\-\-suffix                               |出力ファイルのサフィックスの指定                                      |
|\-B,\-bit\[width\],\-\-bit\[width\]                   |_inputBitWidth_, _outputBitWidth_ のデフォルト値の指定                |
|\-I,\-inbit\[width\],\-\-inbit\[width\]               |_inputBitWidth_ のデフォルト値の指定                                  |
|\-O,\-outbit\[width\],\-\-outbit\[width\]             |_outputBitWidth_ のデフォルト値の指定                                 |
|\-c,\-csv\[file\],\-\-csv\[file\]                     |性能情報の _CSV_ ファイルの指定                                       |
|\-i,\-in\[put\],\-\-in\[put\]                         |入力する _SHIM2\.0_ ファイルの指定                                    |
|\-m,\-master\[component\],\-\-master\[component\]     |_MasterComponent_ の _ID_ の指定                                      |
|\-Y,\-yaml,\-\-yaml                                   |処理記述した _YAML_ ファイルの指定                                    |

【例】

**shim20.xml**内の*Master Component ID*が(*MD~*)のMaster Componentに生成した**output.csv**のレイテンシを挿入し、そのファイル名を*shim20_output.xml*としたい場合：

```console
java -classpath ./AmaltheaTools.jar Performance2SHIM -o shim20_output.xml -c output.csv -m (MD~) shim20.xml
```

**output.csv**のレイテンシを基に新たな*SHIM*、shim20をshim20_new.xmlとして生成したい場合：

```console
java -classpath ././AmaltheaTools.jar Performance2SHIM -N shim20 -o shim20_new.xml -c output.csv
```