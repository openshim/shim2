int main(){
  int i,j,amari;

  int sum;
  int pernum[10];
  int percount = 0;
  for(i=1;i<1000;i++){
    sum = 0;
    for(j=1;j<i;j++){
      if((i%j)==0)
	sum += j;
    }

    if(i == sum){
      pernum[percount] = i;
      percount++;
    }
  }

  return 0;
}
