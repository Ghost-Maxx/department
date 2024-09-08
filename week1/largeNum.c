#include <stdio.h>

void main() {
    int n1, n2, n3;
    
    // user to enter three numbers
    printf("Enter the three number for comparing: \n");
    scanf("%d%d%d", &n1, &n2, &n3);
    
    // Determine the largest number
    if (n1 >= n2 && n1 >= n3) {
        printf("%d is the largest number:\n", n1);
    } else if (n2 >= n1 && n2 >= n3) {
        printf("%d is the largest number:\n", n2);
    } else {
        printf("%d is the largest number:\n", n3);
    }
    
    
}
