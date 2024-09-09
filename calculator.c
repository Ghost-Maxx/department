#include <stdio.h>
int main()
{
    float a, b;
    float result;
    char op, qw;
    printf("Enter the two number: \n");
    scanf("%f%f", &a, &b);
    printf("Enter the operation ");
    scanf("%c", &qw);
    scanf("%c", &op);
    switch (op)
    {
    case '+':
        result = a + b;
        printf("THe sum of %2.f and %2.f --> %2.f ", a, b, result);
        break;
    case '-':
        result = (a - b);
        printf("The substraction of %2.f and %2.f -->%2.f", a, b, result);
        break;
    case '*':
        result = (a * b);
        printf("The multiplication of %2.f and %2.f -->%2.f", a, b, result);
        break;
    case '/':
    if (b != 0) {
                result = a / b;
                printf("Result: %.2lf\n", result);
            } else {
                printf("Error: Division by zero is not allowed.\n");
            }
            break;

    default: printf("The invalid operation!! \n");
    break;
    }
    return 0;
}