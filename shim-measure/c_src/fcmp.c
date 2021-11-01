#define X 1000
int main(){

  double A = 0.1,B = 2.5,C = -6.005,D = -1.0e-10;
  float E = 476.434324,F = -445678.34553,G = 2345.3345;
  volatile int x0,x1,x2,x3,x4,x5,x6,x7;
  int j;

  //inokawa
  for(j=0; j<X; j++){
    x0 = A <= B;
    x1 = C == D;
    x2 = E != F;
    x3 = G > 0;
    x4 = B >= C;
    x5 = D < 0.345673445435;
    x6 = E == F;
    x7 = G >= D;
  }


  return 0;
}
