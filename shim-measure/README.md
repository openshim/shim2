# SHIM Latency Measurement and Insertion

  - [Description](#description)
  - [Latency Measurement](#latency-measurement)
  - [Latency Insertion](#latency-insertion)

## Description

This directory provides functions to handle *SHIM (Software-Hardware Interface for Multi-many-core)* latency.
It is assumed that you already have a SHIM XML without latency.  If you do not yet, please create a *SHIM XML* with the [*SHIM 2.0 Editor*](https://github.com/openshim/shim2).

Follow the steps below to complete the process.[(Demonstration Video)](https://www.youtube.com/watch?v=3Hy9hvi9S0s)

 1. [Latency Measurement](#latency-measurement)
 2. [Latency Insertion](#latency-insertion)

## Latency Measurement

Execute the measurement programs on the target device and output the execution cycles and memory access counts.

This function is available in the [*measure*](./measure) directory.

## Latency Insertion

Calculate the latency using the execution cycles obtained in the previous step, and insert the latency in SHIM XML.

This function is available in the [*latency*](./latency) directory.