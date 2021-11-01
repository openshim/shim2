#define N 10

double fn2_d(double a1,double a2){
  int i;
  double rtn = 0;
  for(i = 1;i < 51;i++)
    rtn += a1*a2/(i+a2);
  return rtn;
}

int main(){
  double result_d[N];
  double start_d = 3.0;
  double tmp_d = 0;
  double a1,a2;
  int i;


  for(i=0; i<N; i++){
    if(i==0){
      tmp_d = fn2_d(start_d,10.0);
      result_d[i] = tmp_d;
    }
    else if(i==1){
      a1 = result_d[0] / 10000.0;
      tmp_d = fn2_d(a1/1000.0,a1);
      result_d[i] = tmp_d;
    }
    else{
      a1 = result_d[i-1] / 10000.0 - 0.334;
      a2 = result_d[i-2] / 10000.0 - 0.72;
      if(a1 > a2){
        tmp_d = fn2_d(a2,a1);
      }
      else{
        tmp_d = fn2_d(a1,a2);
      }
      result_d[i] = tmp_d;
    }
  }

  return 0;
}
