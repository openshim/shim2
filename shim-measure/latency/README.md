# Latency calculation


  - [Description](#description)
  - [Preparation for latency calculation](#preparation-for-latency-calculation)
    - [Preparation](#preparation)
    - [Exclude outliers](#exclude-outliers)
      - [Place *csv* files](#place-csv-files)
      - [Import into **ExcludeValues.xlsm**](#import-into-excludevaluesxlsm)
      - [Exclusion of outliers](#exclusion-of-outliers)
        - [In the case of extremely high outliers](#in-the-case-of-extremely-high-outliers)
  - [Procedure for latency calculation](#procedure-for-latency-calculation)
      - [Fill out *summary* sheet with the required information](#fill-out-summary-sheet-with-the-required-information)
      - [Latency calculation by regression analysis](#latency-calculation-by-regression-analysis)
  - [Convert to *csv*](#convert-to-csv)
      - [Run the macro to generate a *csv* file](#run-the-macro-to-generate-a-csv-file)
      - [Save the file in *csv* format](#save-the-file-in-csv-format)
      - [Convert to follow the rules of the Latency Insertion Tool](#convert-to-follow-the-rules-of-the-latency-insertion-tool)
  - [Insert into  *SHIM*.](#insert-into--shim)

## Description

This directory provides latency calculation based on the files obtained from the target device measurement.

## Preparation for latency calculation
### Preparation

The following tool is required to run the programs.

+ Environment for macro execution in *xlsx*，*xlsm* file
  + Confirm execution in *EXCEL 2019*

The files to prepare are as follows:

+ *csv* files obtained by [measure](../measure).

### Exclude outliers

Exclude outliers from the results obtained from the target measurement. 
The procedure is as follows:

#### Place *csv* files

Place all the files obtained from the target measurement in [*ExcludeValues*](./ExcludeValues).

#### Import into **ExcludeValues.xlsm** 

1. Open [**ExcludeValues.xlsm**](./ExcludeValues/ExcludeValues.xlsm) 
2. Excute "Repeating_CSV" by "View"->"Macro"
3. Make sure all csv files have been added as new sheets

![csvファイルを取り込んだときの画面](../images/csv.bmp)

#### Exclusion of outliers

1. Run the macro "Run_median_macro".
2. Set tolerances.
   + Set a ratio between 0 and 1, such as 0.2 or 0.1
   + If you are not particular about the range, set both items to 0.1
3. Comfirm that the excluded results are printed on *sheet1*.

##### In the case of extremely high outliers

There may be many extreme outliers due to uniformly setting of tolerances.
In that case, by manually rewriting the "Upper" and "Lower" limits of the *L1Access/Refill* count in the sheet of each imported *csv* file, the calculation will be recalculated and reflected.

### Procedure for latency calculation

[**calc.xlsm**](./calc.xlsm) is used to calculate the latency. 
The procedure is as follows:

1. [Fill out *summary* sheet with the required information](#fill-out-summary-sheet-with-the-required-information)
2. [Latency calculation by regression analysis](#latency-calculation-by-regression-analysis)

#### Fill out *summary* sheet with the required information

Enter the necessary information on the *summary* sheet in [**calc.xlsm**](./calc.xlsm) .
The items to be entered are as follows:

+ Value of *sheet1* of **ExcludeValues.xlsm**
  + Enter *TotalCycle* into *TotalCycle* on [**calc.xlsm**](./calc.xlsm) *summary* sheet
  + Enter the *NewMissRate* into the *L1 missRate* on the *summary* sheet.
  + Enter the *New Average* of *L1-D-Access* into *L1 Access*

※ The orange cells on both sheets should be fully filled.

#### Latency calculation by regression analysis

In the *regression* sheet, the latency of each variable is calculated using the solver function of the least-square method with the difference between the actual execution cycles and the estimation cycles.

Regression analysis is performed by selecting "Data"->"Solver" and setting parameters as follows:

```bash
・Set Objective：AE2 (cell of gray)
・To：Min
・By Changing Variable Cells：C2 to AB2 (cell of green and red)
・Subject to the Constraints：
  - Row 2(cell of green and red) is Non-Negative
  - Column AF(The square of the difference between the actual execution cycle and the estimation cycle) is within ±0.2
・Make Unconstrained Variables Non-Negative：☑
・Select a Solving Method：GRG Nonlinear
```

The calculated latency will be output in the green cell of the second row.
Even if no solution is found that satisfies the constraints, the optimal latency will be obtained.

### Convert to *csv*

Convert the latency to a csv file that can be used by the tool to insert the latency into SHIM. 
The procedure is as follows:

1. [Run the macro to generate a *csv* file](#run-the-macro-to-generate-a-csv-file)
2. [Save the file in *csv* format](#save-the-file-in-csv-format)
3. [Convert to follow the rules of the Latency Insertion Tool](#convert-to-follow-the-rules-of-the-latency-insertion-tool)

#### Run the macro to generate a *csv* file

This macro extracts only the instruction names and latency cells from [**calc.xlsm**](./calc.xlsm) used in the previous step.
Click "View"->"Macro"->"*outputCSV*". 
When a new file with only green and blue cells is generated, you have succeeded.

#### Save the file in *csv* format

Save the file with "Save As". Please note the following three points.

+ Set the file type to CSV
+ Change the file name to "**input.csv**"
+ Save it in [latency/*trans*/*inst*](./trans/inst)

#### Convert to follow the rules of the Latency Insertion Tool

Run **transcsv.py** to convert the *csv* file you just created into a form compatible with the Latency Insertion Tool.
By executing the following command in the *trans* directory, "**output.csv**" will be output.

`python transcsv.py`

For an example of the output file(**output.csv**), see [**sample.csv**](./trans/sample.csv).

### Insert into *SHIM*

Insert **output.csv** into *SHIM*.
*Java* environment is assumed to be version 8 or later.

#### Preparation

Prepare the following files. Place them all in [*trans*](./trans).

+ [**AmaltheaTools.jar**](./trans/AmaltheaTools.jar)
+ **output.csv** (which you just placed in [./trans/](./trans))
+ **SHIM.xml**

#### Insertiton

We can insert latency into *SHIM* with the following command.

```console
java -classpath ./AmaltheaTools.jar Performance2SHIM [options...] [ShimFile]
```

|Option　　                                            |Description                                                                             |
|---                                                   |---                                                                                     |
|\-F,\-func\[tionalunitset\],\-\-func\[tionalunitset\] |Set the processing target to the _SHIM2\.0_ file that contains only _FunctionalUnitSet_ |
|\-N,\-new,\-\-new                                     |Output a new _SHIM2\.0_ file that contains only _FunctionalUnitSet_                     |
|\-o,\-out\[put\],\-\-out\[put\]                       |Specify the _SHIM2\.0_ file for output                                                  |
|\-d,\-dir\[ectory\],\-\-dir\[ectory\]                 |Specify the output directory                                                            |
|\-s,\-suffix,\-\-suffix                               |Specify the suffix for output files                                                     |
|\-B,\-bit\[width\],\-\-bit\[width\]                   |Specify default values for _inputBitWidth_ and _outputBitWidth_                         |
|\-I,\-inbit\[width\],\-\-inbit\[width\]               |Specify the default value for _inputBitWidth_                                           |
|\-O,\-outbit\[width\],\-\-outbit\[width\]             |Specify the default value for _outputBitWidth_.                                         |
|\-c,\-csv\[file\],\-\-csv\[file\]                     |Specify the _CSV_ file for performance information                                      |
|\-i,\-in\[put\],\-\-in\[put\]                         |Specify the _SHIM2\.0_ file to input                                                    |
|\-m,\-master\[component\],\-\-master\[component\]     |Specify the _ID_ of _MasterComponent_                                                   |
|\-Y,\-yaml,\-\-yaml                                   |Specify the _YAML_ file that describes the process                                      |


【Example】

Case 1：

If you want to insert the latency of the **output.csv** generated for the Master Component whose *Master Component ID* is (*MDx*) in **shim20.xml** and name the file as **shim20_output.xml**

```console
java -classpath ./AmaltheaTools.jar Performance2SHIM -o shim20_output.xml -c output.csv -m (MDx) shim20.xml
```

Case 2：

If you want to generate a new *SHIM* and *NewShim20* as **shim20_new.xml** based on the latency of **output.csv**

```console
java -classpath ./AmaltheaTools.jar Performance2SHIM -N NewShim20 -o shim20_new.xml -c output.csv
```