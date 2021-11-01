#define N 10

int fn2_i(int a1,int a2){
  int i;
  int rtn = 0;

  for(i=1;i<50;i++){
    rtn += (a1*a2)/(i+a2);
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
      tmp_i = fn2_i(start_i,N);
      result_i[i] = tmp_i;
    }
    else if(i==1){
      a1 = result_i[0] % 1000;
      tmp_i = fn2_i(a1%100,a1);
      result_i[i] = tmp_i;
    }
    else{
      a1 = result_i[i-1] % 1000 - 1;
      a2 = result_i[i-2] % 1000 - 2;
      if(a1 < a2){
        tmp_i = fn2_i(a2,a1);
      }
      else{
        tmp_i = fn2_i(a1,a2);
      }
      result_i[i] = tmp_i;
    }
  }

  return 0;
}
