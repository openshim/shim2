#define dim 100

//int __attribute__((section(".global")))target[dim];


int* bubbleSort(int* N, int len){
  int i,j;
  int temp;
  for(i=0; i<len; i++){
    for(j=len-1; j>i; j--){
      if(N[j] < N[j-1]){
        temp = N[j];
        N[j] = N[j-1];
        N[j-1] = temp;
      }
    }
  }
  return N;
}

int data(double x)
{
  return (x*x*((int)x%13))/(x*x+1000)*100+x;
}

int main()
{
  int target[dim];
  int i;
  for(i = 0;i < dim;i++)
    {
      target[i] = data(i);
    }
  bubbleSort(target,dim);
  return 0;
}
