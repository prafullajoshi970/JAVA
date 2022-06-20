import java.util.Scanner;

public class rotate_matrix {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {

        int l = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[l][m];
         
        //   array input
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                  arr[i][j] = scn.nextInt();
            }
        }
          int [][] arr1=new int [l][m];
        for(int i=0;i<=arr1.length-1;i++){
            for(int j=0;j<arr1[0].length;j++)
            {
               arr1[i][j]=arr[j][i];
            }
        
           
        }
        for(int i=0; i<arr1.length;i++){
            for(int j=arr1[0].length-1;j>=0;j--){
                System.out.print(arr1[i][j]+" ");
            }
        
            System.out.println();
        }
        return;
    }
}