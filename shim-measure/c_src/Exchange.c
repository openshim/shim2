#define N 100
#define X 10

void exchange(int *a,int *b){
  int tmp;
  tmp = *a;
  *a = *b;
  *b = tmp;
}


int main(){
  int a,b,i,j;

  //inokawa
  for(j=0; j<X; j++){
    a = j;
    b = j+1;
    for(i = 0;i < N;i++){
      exchange(&a,&b);
      a = i + b;
    }
  }
  return 0;
}
