#define dim 100

int data(double x);
void MergeSort(int x[], int left, int right);

int main(){
  int target[dim];
  int i;
  
  for(i = 0;i < dim;i++)
    target[i] = data(i);
  
  MergeSort(target,0,dim-1);

  return 0;
}

int data(double x){
  return (x*x*((int)x%13))/(x*x+1000)*100+x;
}

void MergeSort(int x[],int left,int right){
  int mid;
  int i,j,k;
  int buf[dim];

  if(left >= right)
    return ;
  
  mid = (left+right)/2;
  MergeSort(x,left,mid);
  MergeSort(x,mid+1,right);

  for(i = left;i <= mid;i++)
    buf[i] = x[i];
  for(i = mid+1;i <= right;i++)
    buf[i] = x[i];
  
  i = left;
  j = mid+1;

  for(k = left;k <= right;k++)
    {
      if(i > mid)
	x[k] = buf[j++];
      else if(j > right)
	x[k] = buf[i++];
      else
	{
	  if(buf[i] <= buf[j])
	    x[k] = buf[i++];
	  else
	    x[k] = buf[j++];
	}
    }
  return;
}
