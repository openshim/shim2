#define N 50

double fn1_d(double a1,double a2){
  if(a2 >= 0)
    return a1+fn1_d(a1,a2-1.0);
  else
    return 1.0;
}

int main(){
  double result_d[N];
  double start_d = 3.0;
  double tmp_d = 0;
  double a1,a2;
  int i;


  for(i=0; i<N; i++){
    if(i==0){
      tmp_d = fn1_d(start_d,10.0);
      result_d[i] = tmp_d;
    }
    else if(i==1){
      a1 = result_d[0] / 10000.0;
      tmp_d = fn1_d(a1/100.0,a1);
      result_d[i] = tmp_d;
    }
    else if(i%2!=0){
      a1 = result_d[i-1] / 933.4;
      a2 = result_d[i-2] / 933.4;
      if(a1 > a2){
        tmp_d = fn1_d(a2,a1);
      }
      else{
        tmp_d = fn1_d(a1,a2);
      }
      result_d[i] = tmp_d;
    }
    else{
      a1 = result_d[i-1] / 1001.3;
      a2 = result_d[i-2] / 1001.3;
      if(a1 > a2){
        tmp_d = fn1_d(a2,a1);
      }
      else{
        tmp_d = fn1_d(a1,a2);
      }
      result_d[i] = tmp_d;
    }
  }

  return 0;
}
