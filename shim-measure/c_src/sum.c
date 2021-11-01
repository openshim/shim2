#define N 1000

int main(){
  float sum = 0;
  int i;

  for(i = 0;i < N;i++){
    sum = sum + i;
  }
  
  if(sum == 0){
    sum = 1;
  }

  return 0;
}
