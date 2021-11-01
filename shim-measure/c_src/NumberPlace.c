//#include <stdio.h>
 
#define N 9
#define B 3 //square root of N

int board[]={
  1,2,0,0,0,7,0,9,0,
  0,3,0,0,1,0,0,0,8,
  0,0,9,6,0,0,5,0,0,
  0,0,5,0,0,0,9,0,0,
  0,1,0,0,8,0,0,0,2,
  6,0,0,0,0,4,0,0,0,
  3,0,0,8,0,0,1,0,0,
  0,4,0,0,0,0,0,0,7,
  0,0,7,0,0,0,3,0,0};

int AnsCount = 0;

int canBePlaced(int pos, int x)
{
  int row=pos/N;
  int col=pos%N;
  int i, j, topLeft;
  for (i=0; i<N; ++i) {
    if (board[row*N+i]==x) return 0;
    if (board[col+i*N]==x) return 0;
  }
  topLeft=N*(row/B)*B+(col/B)*B;
  for (i=0; i<B; ++i) {
    for (j=0; j<B; ++j) {
      if (board[topLeft+i*N+j]==x) return 0;
    }
  }
  return 1;
}
 
void check(int pos){
  int i, x, newPos;
 
  //Solution is found.
  if (pos==N*N)
    {
    	/*
      for (i=0; i<N*N; ++i) {
	printf("%d ", board[i]);
	if (i%N==N-1) printf("\n");
      }
      printf("\n");
    	*/
    	AnsCount++;
      return;
    }
  
  //Find a blank.
  for (newPos=pos; newPos<N*N; ++newPos) {
    if (board[newPos]==0) break;
  }
 
  //Check recursively.
  for (x=1; x<=N; ++x) {
    if (canBePlaced(newPos, x)) {
      board[newPos]=x;
      check(newPos+1);
      board[newPos]=0;//backtracking
    }
  }
}
 
int main()
{
  check(0);
  return 0;
}
