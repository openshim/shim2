#define N 1000

int judge(int n){
  int i;
  for(i = 2;i < n;i++){
    if(n%i == 0){
      return 1;
    }
  }
  return 0;
}

int main(){
  int i;
  int Prime = 0;
  for(i = 2;i < N;i++){
    if(judge(i) == 1){
      Prime++;
    }
  }
  if(Prime == 0)
    Prime = 1;

  return 0;
}

  
