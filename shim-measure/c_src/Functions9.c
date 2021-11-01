#define N 10

double fn3_d(double a1,double a2){
  double rtn= 0;
  double tmp = 0;
  double i = 1.0;
  while (rtn < 20.0 && i < 50.0) {
    tmp = a1 + i;
    rtn += a2 / tmp;
    i += 1.0;
  }
}

int main(){
  double result_d[N];
  double start_d = 3.0;
  double tmp_d = 0;
  double a1,a2;
  int i;


  for(i=0; i<N; i++){
    if(i==0){
      tmp_d = fn3_d(start_d,10.0);
      result_d[i] = tmp_d;
    }
    else if(i==1){
      a1 = result_d[0];
      tmp_d = fn3_d(a1,a1);
      result_d[i] = tmp_d;
    }
    else{
      a1 = result_d[i-1] - 0.344;
      a2 = result_d[i-2] - 0.72;
      if(a1 > a2){
        tmp_d = fn3_d(a2,a1);
      }
      else{
        tmp_d = fn3_d(a1,a2);
      }
      result_d[i] = tmp_d;
    }
  }

  return 0;
}
