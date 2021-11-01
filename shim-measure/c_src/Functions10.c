#define N 25

int fn4_i(int a1,int a2){
  if(a2 < 0 || a2 == 0)
  return 1;
  else
  return a1+(fn4_i(a1,a2-1)/a2);
}

int main(){
  int result_i[N];
  int start_i = 3;
  int tmp_i = 0;
  int i,a1,a2;

  for(i=0; i<N; i++){
    if(i==0){
      tmp_i = fn4_i(start_i,N);
      result_i[i] = tmp_i;
    }
    else if(i==1){
      a1 = result_i[0] % 1000;
      tmp_i = fn4_i(a1%100,a1);
      result_i[i] = tmp_i;
    }
    else if(i%2!=0){
      a1 = result_i[i-1] % 1000;
      a2 = result_i[i-2] % 1000;
      if(a1 > a2){
        tmp_i = fn4_i(a2,a1);
      }
      else{
        tmp_i = fn4_i(a1,a2);
      }
      result_i[i] = tmp_i;
    }
    else{
      a1 = result_i[i-1] % 1500;
      a2 = result_i[i-2] % 1500;
      if(a1 > a2){
        tmp_i = fn4_i(a2,a1);
      }
      else{
        tmp_i = fn4_i(a1,a2);
      }
      result_i[i] = tmp_i;
    }
  }

  return 0;
}
