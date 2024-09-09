import java.util.Scanner;
class binaryTOdeci {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a binary number:");
            int n = sc.nextInt();
            
            int decimal = 0;
            int base = 1;  
            while (n > 0) {
                int rem = n % 10;  
                decimal += rem * base;   
                base = base * 2; 
                n = n/ 10;  
            }
            System.out.println("Decimal equivalent is: " + decimal);
            
            
        }
    }
