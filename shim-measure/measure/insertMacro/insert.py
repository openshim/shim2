#coding: UTF-8

import re
import sys
import glob
import os


argvs = sys.argv
argc = len(argvs)

tooldir = "./"
tmpdir = tooldir + "tmp/"
headerfile = tmpdir + "header.txt"
startfile = tmpdir + "start.txt"
endfile = tmpdir + "end.txt"
headertmp = []
starttmp = []
endtmp = []

f = open(headerfile)
for line in f:
    headertmp.append(line)
f.close()
f = open(startfile)
for line in f:
    starttmp.append(line)
f.close()
f = open(endfile)
for line in f:
    endtmp.append(line)
f.close()

inputfile = argvs[1]
f = open(inputfile, encoding="utf-8")

filename = os.path.basename(inputfile)
filepath = os.path.dirname(inputfile)
if filepath == '':
    filepath = '.'
resultDir = filepath + "/c_src_Macro/"
resultfile = resultDir + filename

print(resultfile)

if not os.path.isdir(resultDir):
    os.mkdir(resultDir)

newlines = []
state = 'OUTMAIN'
bracket = 0

for line in headertmp:
    newlines.append(line)

def lineparse(line,state):
    global bracket
    if state == 'OUTMAIN':
        if('main(' in line):
            buf = line.split('main')
            if('{' in buf[1]):
               bracket += 1
               return 'INMAIN'
            else:
               return 'FINDMAIN'
        else:
            return 'OUTMAIN'
    elif state == 'FINDMAIN':
        if('{' in line):
            bracket += line.count('{')
            bracket -= line.count('}')
            return 'INMAIN'
        else:
            return 'FINDMAIN'
    elif state == 'INMAIN':
        bracket += line.count('{')
        bracket -= line.count('}')
        if bracket == 0:
            return 'OUTMAIN'
        if('return 0' in line):
            if bracket == 0:
                return 'OUTMAIN'
            else:
                return 'RETURN'
        return 'INMAIN'
    elif state == 'RETURN':
        bracket += line.count('{')
        bracket -= line.count('}')
        if bracket == 0:
            return 'OUTMAIN'
        else:
            return 'INMAIN'
    else:
        print(state)
        print("error")

def insertline(state,newstate,curline):
    global newlines
    if state == 'OUTMAIN' or state == 'FINDMAIN':
        if newstate == 'INMAIN':
            newlines.append(curline)
            for line in starttmp:
               newlines.append(line)
            return
    if state == 'INMAIN':
        if newstate == 'RETURN' or newstate == 'OUTMAIN':
            for line in endtmp:
               newlines.append(line)
            newlines.append(curline)
            return
    newlines.append(curline)
    return

for line in f:
    newstate = lineparse(line,state)
    print (bracket,state)
    insertline(state,newstate,line)
    state = newstate

result = open(resultfile,mode = 'w')
for line in newlines:
    result.write(line)

f.close()
result.close()

    
        
