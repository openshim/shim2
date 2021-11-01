#include <stdio.h>
#define X 100
int N = 3;
int step = 0;

void hanoi(int n,char from,char via,char to){
  if(n == 0)return;

  hanoi(n-1,from,to,via);
  step++;
  hanoi(n-1,via,from,to);
}

int main(){
  int j;
  //inokawa
  for(j=0; j<X; j++){
    hanoi(N,'A','B','C');
  }
  return 0;
}
