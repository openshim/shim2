#define X 10
int count;

int test(int a1,int a2,double a3){
  return a1+a2+a3;
}

int fn1(int a1,int a2){
  if(a2 != 0)
    return a1+fn1(a1,a2-1);
  else
    return 1;
}

double fn2(double a1,double a2){
  int i;
  double rtn = 0;
  for(i = 0;i < 10;i++)
    rtn += a1*i/a2;
  return rtn;
}

void fn3(){
  if(count != 0)
    {
      count--;
      fn3();
    }
  return ;
}

int main(){
  int j;
  int fn1_result;
  double fn2_result;

  //inokawa
  for (j=0; j<X; j++) {
    test((1+j),3,4.66);
    fn1_result = fn1(25,(4+j));
    fn2_result = fn2(2.0,4.0);
    count = 5+j;
    fn3();
  }
	//  printf("fn1 = %d,fn2 = %lf\n",fn1_result,fn2_result);
  return 0;
}
