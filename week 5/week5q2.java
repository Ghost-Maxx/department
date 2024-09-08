public class week5q2 {
    public static void main(String[] args) {
        int matrix[][]= {{2,4,5,},{5,7,4},{3,6,1}};
        int trans[][]= new int [3][3];
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                trans[i][j]= matrix[j][i];
            }
             
        }



       System.out.println("The transpose matrix is ");

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(" "+ trans[i][j]);
            }
            System.out.println("\n");
    }
    }
}
