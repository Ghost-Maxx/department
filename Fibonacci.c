#include <stdio.h>
int main() {

  int n, t1=0, t2=1;
  int t3 = t1 + t2;

  // get number from user
  printf("Enter the number of terms: \n");
  scanf("%d", &n);

  // print the first two terms t1 and t2
  printf("Fibonacci Series: %d, %d, ", t1, t2);

  // print 3rd to nth terms
  for (int i = 3; i <= n; ++i) {
    printf("%d, ", t3);
    t1 = t2;
    t2 = t3;
    t3 = t1 + t2;
  }

  return 0;
}
