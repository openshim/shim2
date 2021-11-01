#ifndef SETAFFI_H
#define SETAFFI_H

#define _GNU_SOURCE
#include <sched.h>
#include <stdio.h>

static inline int setaffinity(int cpunum){
  pid_t pid;
  cpu_set_t cpu_set;
  int result;

  pid = getpid();
  CPU_ZERO(&cpu_set);
  CPU_SET(cpunum,&cpu_set);

  result = sched_setaffinity(pid,sizeof(cpu_set_t),&cpu_set);
  if(result != 0){
    return -1;
  }

  return sched_getcpu();
}
  
#endif
