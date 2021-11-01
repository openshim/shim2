int fn1(int a1,int a2){
if(a2 > 0){
  if(a2%2 != 0)
    return fn1(a1,a2-1)+1;
  else
    return a1+fn1(a1,a2-1);
  }else
    return 1;
}

double fn2(double a1,double a2){
  int i;
  double rtn = 0;
  for(i = 1;i < 11;i++)
    rtn += a1*a2/i;
  return rtn;
}

int main(){

  int fn1_result_1;
  int fn1_result_2;
  int fn1_result_3;
  double fn2_result_1;
  double fn2_result_2;
  double fn2_result_3;

  fn1_result_1 = fn1(19,179);
  fn1_result_2 = fn1(23,157);
  fn2_result_1 = fn2(7.0,2.5);
  fn2_result_2 = fn2(13.5,3.7);

  if(fn1_result_1 < fn1_result_2){
    fn1_result_3 = fn2(fn1_result_1,fn1_result_2);
    fn2_result_3 = fn2(fn2_result_1,fn2_result_2);
  }
  else{
    fn1_result_3 = fn2(fn1_result_2,fn1_result_1);
    fn2_result_3 = fn2(fn2_result_2,fn2_result_1);
  }

  return 0;
}
