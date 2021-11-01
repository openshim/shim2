#define N 1000

int main(){
  int i,j;

  float celsius,fahrenheit;

  for(i = 0;i<N;i++){
    for(j = 0;j < N;j++){
      celsius = 0.1*i + 0.01*j;
      fahrenheit = (1.8*celsius) + 32;
      if(fahrenheit == 0)
	fahrenheit = 1;
    }
  }
  return 0;
}
  
