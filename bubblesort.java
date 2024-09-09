
import java.util.Scanner;
public class bubblesort { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of an array");  //--> determine the size of an array
        int n = sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the elements of an array");
        for(int i =0 ; i < n ; i ++){
            arr[i]=sc.nextInt();
        }
        System.out.println("elements of an array are");
        for(int i = 0 ; i < n;i++){ 
        System.out.println(arr[i]);
    }

    //code for bubblesort
    for(int i = 0 ;i < n-1;i++){
        for(int j = 0; j <n-i-1;j++){
             if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j]= arr[j+1];
                arr[j+1]=temp;
                
         }   
        }
    } //code for display sorted array
    System.out.println("the sorted array is ");
    for( int i = 0 ; i <n;i++){
        System.out.println(arr[i]);
    }

    }
}