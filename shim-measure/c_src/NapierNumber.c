#include <math.h>
#define X 10

int main(){
  int i,j;
  int kaijou;
  int iterator;

  double napier;

  //inokawa
  for(j=0; j<X; j++){
    kaijou = 1;
    iterator = 30;
    napier = 1.0;

    for(i=0;i<iterator;i++){
      kaijou *= i;
      napier += 1.0/kaijou;
    }

    if(napier == M_E){
      napier = 1;
    }
  }

  return 0;
}
