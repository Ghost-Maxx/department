import java.util.Scanner;

public class primeINrange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range");
        int l = sc.nextInt();
        int u = sc.nextInt();


        System.out.println("The prime in a given range is \n");
        for (int i = l; i <= u; i++) {
            if (i <= 1) {
                continue; 
            }
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break; 
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}
