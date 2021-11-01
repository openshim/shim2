#define N 100
#define X 10

void exchange(float *a,float *b){
  float tmp;
  tmp = *a;
  *a = *b;
  *b = tmp;
}


int main(){
  float a,b;
  int i,j;

  //inokawa
  for(j=0; j<X; j++){
    a = 0.0;
    b = 1.0;
    for(i = 0;i < N;i++){
      exchange(&a,&b);
      a = j + i + 0.1 * b;
    }
  }
  return 0;
}
