#include <stdio.h>
#include <stdlib.h>
#include <omp.h>
int main(int argc, char *argv[]) {
  int arr[1000],max_val=0;
  for(int i=0;i<1000;i++){
    arr[i]=rand() % 1000;
}
#pragma omp parallel for reduction(max:max_val)
for(int i=0;i<1000;i++){
if(max_val<arr[i]){
  max_val=arr[i];
}
}
printf("The maximum value is %d",max_val);
	return 0;
} 
