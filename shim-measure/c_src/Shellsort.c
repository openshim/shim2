// inokawa
#define dim 100

void swap (int *x, int *y) {
  int temp;

  temp = *x;
  *x = *y;
  *y = temp;
}

void shell_sort (int array[], int array_size) {
  int i, j, h;

  for (h = 1; h <= array_size/9; h = 3*h + 1);
  for ( ; h > 0; h /= 3) {
    for (i = h; i < array_size; i++) {
      j = i;
      while ((j > h - 1) && (array[j-h] > array[j])) {
        swap(&array[j-h], &array[j]);
        j -= h;
      }
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

  shell_sort(target, dim);

  return 0;
}
