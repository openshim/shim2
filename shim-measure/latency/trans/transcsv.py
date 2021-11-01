#coding: UTF-8

import re
import sys
import glob
import os
import csv


tmpdir = "./inst/"
groupfile = tmpdir + "group.txt"
performancefile = tmpdir + "input.csv"
resultfile = "./output.csv"
grouptmp = []
performancetmp = []

f = open(groupfile,'r')
for line in f:
    grouptmp.append(line)
f.close()

f = open(performancefile,'r')
reader = csv.reader(f)
performance = [row for row in reader]
f.close()

newlines = []
newlines.append('# grouping\n')

for line in grouptmp:
    newlines.append(line)

newlines.append('\n# performance\n')

for i in range(len(performance)):
    newlines.append(performance[i][0] + "," + performance[i][1] +"," + performance[i][2] + "," + performance[i][3] + "\n")

result = open(resultfile,mode = 'w')
for line in newlines:
     result.write(line)
result.close()
