#define N 30

int fn5_i(int a1, int a2){
  int tmp_a1,tmp_a2;
  int rtn = 0;
  if(a1 > 1000 && a2 > 1000){
    tmp_a1 = a1 % 1000;
    tmp_a2 = a2 % 1000;
  }else if(a1 > 1000 || a2 > 1000){
    if(a1 > a2){
      tmp_a1 = a1 % 1000;
    }else{
      tmp_a2 = a2 % 1000;
    }
  }else{
    tmp_a1 = a1;
    tmp_a2 = a2;
  }

  if(tmp_a1 < 0)
  tmp_a1 = (-1) * tmp_a1;
  if(tmp_a2 < 0)
  tmp_a2 = (-1) * tmp_a2;

  tmp_a1++;

  while(rtn < 30){
    rtn += tmp_a2 / tmp_a1;
    tmp_a2++;
  }
  return rtn;
}

int main(){
  int result_i[N];
  int start_i = 3;
  int tmp_i = 0;
  int i,a1,a2;

  for(i=0; i<N; i++){
    if(i==0){
      tmp_i = fn5_i(start_i,N);
      result_i[i] = tmp_i;
    }
    else if(i==1){
      a1 = result_i[0];
      tmp_i = fn5_i(a1,a1);
      result_i[i] = tmp_i;
    }
    else{
      a1 = result_i[i-1] - 1;
      a2 = result_i[i-2] - 2;
      if(a1 > a2){
        tmp_i = fn5_i(a2,a1);
      }
      else{
        tmp_i = fn5_i(a1,a2);
      }
      result_i[i] = tmp_i;
    }
  }

  return 0;
}
