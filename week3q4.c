#include<stdio.h>
void main(){
    int num, sum=0, rem;
    printf("Enter the number for digit sum: \n");
    scanf("%d", &num);
    while (num>0)
    {
        rem = num%10;
        sum = sum + rem;
        num = num/10;
    }
    
    printf("Sum is = %d", sum);

}