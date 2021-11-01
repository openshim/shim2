//#include<stdio.h>

#define ITERATION 2000

unsigned A = 48271;
unsigned B = 0;
//unsigned M = 4294967295;	/* 2^32 - 1 */
unsigned M = 2147482647;	/* 2^31 - 1 */

int X = 0;			/*random seed*/

//Linear congruential generators
int PseudoRandom(){
  X = (A*X+B)%M;
  return (X != 0)? X:1;//return value is not 0
}

unsigned gcd(unsigned a,unsigned b){
  unsigned remainder = a%b;
  while(1)
    {
      if(remainder == 0)
	return b;
      a = b;
      b = remainder;
      remainder = a%b;
    }
}

int main(){
  int test = 0;
  int i = 0;
  for(;i < ITERATION;i++)
    {
      test = gcd(PseudoRandom(),PseudoRandom());
      if(test == 1)
	test = test + 1;
      /*
      if(test != 1)
	printf("i = %d %d\n",i,test);
      */
    }
  return 0;
}
