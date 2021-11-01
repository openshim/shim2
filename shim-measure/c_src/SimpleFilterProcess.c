//#include<stdio.h>

#define dim 1000

int Data[dim];

int data(double x){
  return (x*x*((int)x%13))/(x*x+1000)*100+x;
}

#define Threshold 100
#define ceiling 1023

int SimpleFilter(int x){
  int temp;
  if(x < Threshold)
    {
      temp = x/5+SimpleFilter(x+100);
    }
  else
    temp = x/4;

  if(temp > ceiling)
    return ceiling;
  else
    return temp;
}

int main(){

  int i;

  for(i = 0;i < dim;i++)
    {
      Data[i] = data(i);
      //printf("Data[%d] = %d\n",i,Data[i]);
    }

  //printf("\n");
  
  for(i = 0;i < dim;i++)
    {
      Data[i] = SimpleFilter(Data[i]);
      if(Data[i] == 1){
	Data[i] = 0;
      }
      //printf("Data[%d] = %d\n",i,Data[i]);
    }
  
  return 0;
}
