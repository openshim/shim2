#ifndef CACHE_UTIL_H
#define CACHE_UTIL_H

#include <stdio.h>
#include <stdlib.h>
#include <fcntl.h>
#include <unistd.h>
#include <errno.h>

int cache_invalidate(){
  int fd0_A;

  if((fd0_A = open("/dev/mydevice0",O_RDWR)) < 0){
    perror("open");
    return -1;
  }

  if(write(fd0_A, "0_A",4) < 0){
    perror("write");
    return -1;
  }
  
  if(close(fd0_A) != 0){
    perror("close");
    return -1;
  }

  return 1;
}

#endif
