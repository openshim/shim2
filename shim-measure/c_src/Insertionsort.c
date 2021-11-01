// inokawa
#define dim 100

void swap (int *x, int *y) {
  int temp;

  temp = *x;
  *x = *y;
  *y = temp;
}

void insertion_sort (int array[], int array_size) {
  int i, j;

  for (i = 1; i < array_size; i++) {
    j = i;
    while ((j > 0) && (array[j-1] > array[j])) {
      swap(&array[j-1], &array[j]);
      j--;
    }
  }
}

int data(double x){
  return (x*x*((int)x%13))/(x*x+1000)*100+x;
}

int main(void) {
  int target[dim];
  int i;

  for(i=0; i<dim; i++){
    target[i] = data(i);
  }

  insertion_sort(target, dim);

  return 0;
}
