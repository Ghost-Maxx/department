
import java.util.Scanner;

public class deciTObin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a decimal number:");
        int d = sc.nextInt();
        
        String binary = "";  //taking empty string for bianry to store
        
        if (d == 0) {
            binary = "0";
        } else {
            while (d > 0) {  //--> main logic of decimanl to binary
                int rem = d % 2;
                binary = rem + binary;
                d = d / 2;
            }
        }
        
        System.out.println("Binary equivalent is: " + binary);
    }
}
