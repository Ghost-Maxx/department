import java.util.Scanner;
public class week5q1 {
    public static void main(String[] args) {
        int arr1[] = {1,4,7,19,21};
        int arr2[] = {4,6,8,9,11};
        int merge[]= new int [10];
        int n1= arr1.length;
        int n2= arr2.length;
        int i=0, j=0, k=0;
        while (i < n1 && j < n2){
            if(arr1[i]<=arr2[j]){
                merge[k++]=arr1[i++];

            }else{
                merge[k++]=arr2[j++];
            }
        }
        while(i<n1){
            merge[k++] = arr1[i++];
        }
        while(j<n2){
            merge[k++] = arr2[j];
        }

        for( i=0; i<merge.length; i++){
            System.out.print(" "+ merge[i]);
        }
        
    


    }
}

