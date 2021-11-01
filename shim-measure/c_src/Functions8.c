#define N 40

int fn3_i(int a1,int a2){
  int rtn= 0;
  int tmp = 0;
  int i = 1;
  while (rtn < 28 && i < 50) {
    tmp = a1 + i;
    rtn += a2 / tmp;
    i++;
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
      tmp_i = fn3_i(start_i,N);
      result_i[i] = tmp_i;
    }
    else if(i==1){
      a1 = result_i[0];
      tmp_i = fn3_i(a1,a1);
      result_i[i] = tmp_i;
    }
    else{
      a1 = result_i[i-1] + 1;
      a2 = result_i[i-2] + 2;
      if(a1 > a2){
        tmp_i = fn3_i(a2,a1);
      }
      else{
        tmp_i = fn3_i(a1,a2);
      }
      result_i[i] = tmp_i;
    }
  }

  return 0;
}
