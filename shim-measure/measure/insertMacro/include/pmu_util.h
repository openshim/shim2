#ifndef PMU_UTIL_H
#define PMU_UTIL_H

#include <stdio.h>
#include <stdlib.h>
#include <fcntl.h>
#include <unistd.h>
#include <errno.h>

int fd0_A;

int pmu_open(){
  if((fd0_A = open("/dev/set_pmu",O_RDWR)) < 0){
    perror("open");
    return -1;
  }
  return 1;
}

int pmu_close(){
  if(close(fd0_A) != 0){
    perror("close");
    return -1;
  }
  return 1;
}

int pmu_reset(){
  if(write(fd0_A,"A",4) < 0){
    perror("write");
    return -1;
  }
  return 1;
}

int pmu_read(unsigned int *buff){
  if(read(fd0_A,buff,sizeof(unsigned int)*6) < 0)perror("read");
  return 1;
}

/*
unsigned int get_L1access(unsigned int *buff){
  return buff[2];
}

double get_L1missrate(unsigned int *buff){
  return (1.0*buff[1]) / (1.0*buff[2]);
}
*/

//inokawa
unsigned int get_L1access(unsigned int *buff){
  return (buff[2]-20000);
}

double get_L1missrate(unsigned int *buff){
  return (1.0*(buff[1]-200)) / (1.0*(buff[2]-20000));
}

double get_L2missrate(unsigned int *buff){
  return (1.0*buff[5]) / (1.0*buff[4]);
}

//inokawa
unsigned int get_L1refill(unsigned int *buff){
  return (buff[1]-200);
}

/***************konositahagomi******************/
unsigned int get_cachemiss(){
  unsigned int buff[10];
  if(read(fd0_A,buff,sizeof(unsigned int)*6) < 0)perror("read");
  unsigned int cmiss = buff[0] + buff[1] + buff[5];
  return cmiss;
}

unsigned int get_cacheaccess(){
  unsigned int buff[10];
  if(read(fd0_A,buff,sizeof(unsigned int)*6) < 0)perror("read");
  unsigned int caccess = buff[2] + buff[3] + buff[4];
  return caccess;
}

unsigned int get_Dcacheaccess(){
  unsigned int buff[10];
  if(read(fd0_A,buff,sizeof(unsigned int)*6) < 0)perror("read");
  unsigned int Dcaccess = buff[2] + buff[4];
  return Dcaccess;
}

double get_cachemissrate(){
  unsigned int buff[10];
  if(read(fd0_A,buff,sizeof(unsigned int)*6) < 0)perror("read");
  unsigned int cmiss = buff[0] + buff[1] + buff[5];
  unsigned int caccess = buff[2] + buff[3] + buff[4];
  double cmissrate = (1.0 * cmiss) / (1.0 * caccess);
  return cmissrate;
}

double get_Icachemissrate(){
  unsigned int buff[10];
  if(read(fd0_A,buff,sizeof(unsigned int)*6) < 0)perror("read");
  unsigned int Icmiss = buff[0];
  unsigned int Icaccess = buff[3];
  double Icmissrate = (1.0 * Icmiss) / (1.0 * Icaccess);
  return Icmissrate;
}

double get_Dcachemissrate(){
  unsigned int buff[10];
  if(read(fd0_A,buff,sizeof(unsigned int)*6) < 0)perror("read");
  unsigned int Dcmiss = buff[1] + buff[5];
  unsigned int Dcaccess = buff[2] + buff[4];
  double Dcmissrate = (1.0 * Dcmiss) / (1.0 * Dcaccess);
  return Dcmissrate;
}

#endif
