#!/bin/bash


while [ $# -gt 0 ]
do
    python insert.py "$1"
    echo "$1"
    shift
done
