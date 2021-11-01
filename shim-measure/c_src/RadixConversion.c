#define X 100

int main(){
  int decimal;
  int binary;
  int base;
  int j;

  //inokawa
  for(j=0; j<X; j++){
    binary = 0;
    base = 1;
    decimal = 835;

    while(decimal > 0){
      binary = binary + (decimal % 2) * base;
      decimal = decimal / 2;
      base = base * 10;
    }

    if(binary != 1101000011){
      binary = -1;
    }
  }



  return 0;
}
