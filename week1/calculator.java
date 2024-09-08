import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char op;
    double n1, n2, result;
    
    opyt = sc.nextLine();  // tackle from buffer error 
    System.out.println("Enter an operator (+, -, *, /): ");
    op = sc.nextLine();  
    
    // Prompt the user to enter two numbers
    System.out.println("Enter the first number: ");
    n1=sc.nextInt();
    
    System.out.println("Enter the second number: ");
    n2 = sc.nextInt();
    
    // Perform the operation based on the operator
    switch (op) {
        case '+':
            result = n1 + n2;
            printf("Result--> %.2lf\n", result);
            break;
        case '-':
            result = n1 - n2;
            printf("Result--> %.2lf\n", result);
            break;
        case '*':
            result = n1 * n2;
            printf("Result:-->%.2lf\n", result);
            break;
        case '/':
            
            if (n2 != 0) {
                result = n1 / n2;
                System.out.println("Result--> %.2lf\n", result);
            } else {
                System.out.println("Error !!! Division by zero is not Define\n");
            }
            break;
        default:
        System.out.println("Error!!! Invalid operator.\n");
            break;
    }

    

    }
}
