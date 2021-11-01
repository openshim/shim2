# SHIMの遅延値計測、挿入

  - [はじめに](#はじめに)
  - [遅延値計測](#遅延値計測)
  - [遅延値挿入](#遅延値挿入)

## はじめに

本ディレクトリでは、ハードウェア抽象化記述である *SHIM (Software-Hardware Interface for Multi-many-core)* の遅延値(*latency*)を取り扱うための機能を提供します。
ここでは遅延値が挿入されていないSHIMの存在を仮定しています。まだ作成していない場合は[*SHIM 2.0 Editor*](https://github.com/openshim/shim2)で*SHIM XML*を作成してください。

遅延値の計測、SHIM XMLへの遅延値の挿入は以下の手順で行ってください。[(デモ動画)](https://www.youtube.com/watch?v=rqpZ-3VtBH4&t=18s)

 1. [遅延値計測](#遅延値計測)
 2. [遅延値挿入](#遅延値挿入)

## 遅延値計測

実機で計測プログラムを実行して実行サイクル等を出力します。

[*measure*](./measure) ディレクトリにて提供しています。

## 遅延値挿入

先の工程で得たサイクル数を用いて遅延値を計算し、*SHIM XML*に挿入します。

[*latency*](./latency)ディレクトリにて提供しています。