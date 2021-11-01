#define iteration 17

float fib(float i){
  if(i <= 1)
    return 1;
  else
    return fib(i-1)+fib(i-2);
}

int main(){
  float fib17;
  fib17 = fib(iteration);
  if(fib17 == 1){
    fib17 = 0;
  }
  return 0;
}
