#define N 100

double fn5_d(double a1, double a2){
  double tmp_a1,tmp_a2;
  double rtn = 0;
  if(a1 > 1000.0 && a2 > 1000.0){
    tmp_a1 = a1 / 1000.0;
    tmp_a2 = a2 / 1000.0;
  }else if(a1 > 1000.0 || a2 > 1000.0){
    if(a1 > a2){
      tmp_a1 = a1 / 1000.0;
    }else{
      tmp_a2 = a2 / 1000.0;
    }
  }else{
    tmp_a1 = a1;
    tmp_a2 = a2;
  }

  if(tmp_a1 < 0)
  tmp_a1 = (-1.0) * tmp_a1;
  if(tmp_a2 < 0)
  tmp_a2 = (-1.0) * tmp_a2;

  tmp_a1 += 1.0;

  while(tmp_a1 > 100.0){
    rtn += tmp_a2 / tmp_a1;
    tmp_a2 += 0.25;
  }
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
      tmp_d = fn5_d(start_d,10.0);
      result_d[i] = tmp_d;
    }
    else if(i==1){
      a1 = result_d[0];
      tmp_d = fn5_d(a1,a1);
      result_d[i] = tmp_d;
    }
    else{
      a1 = result_d[i-1] - 0.334;
      a2 = result_d[i-2] - 0.72;
      if(a1 > a2){
        tmp_d = fn5_d(a2,a1);
      }
      else{
        tmp_d = fn5_d(a1,a2);
      }
      result_d[i] = tmp_d;
    }
  }

  return 0;
}
