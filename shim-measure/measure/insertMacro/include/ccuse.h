#ifndef CCUSE_H
#define CCUSE_H

static inline unsigned ccnt_read(void){
  unsigned cc = 0;
  asm volatile("mrs %0,pmccntr_el0" : "=r" (cc));
  return cc;
}

#endif
