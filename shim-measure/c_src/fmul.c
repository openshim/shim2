#define N 1000

int main(){
  float a = 1.0;
  float b = 1.0;
  int i;

  for(i = 0;i < N;i++){
    a = a * b;
    b = b + i/1000.0;
  }
  if(a == 0.0){
    a = 1.0;
  }

  return 0;
}
