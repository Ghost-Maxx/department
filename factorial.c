#include<stdio.h>
int main(){
    int fact=1, n;
    printf("Enter the Number\n");
    scanf("%d", &n);
    if (n<0)
    {
        printf("factorial for negative is not possible\n");
    }else{
        for (int i = 1; i <= n; i++) {
            fact = fact*i;
        }
        printf("Factorial of %d ", fact);
    
    }
    return 0;
    
}

