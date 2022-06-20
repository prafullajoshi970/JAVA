import java.util.Scanner;

public class largesmall {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        // row
        System.out.print("number of rows");

        int r = scn.nextInt();
        // column
        System.out.print("number of coloumns");
        int c = scn.nextInt();
        // Array initialize
        System.out.print("type input values");
        int[][] arr = new int[r][c];
        // input
          for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
          int sum=0;
           for (int i=0; i<arr.length;i++){
           for (int j=0;j<arr[i].length;j++){
            sum=sum+arr[i][j];

      }
      
    }
    System.out.print(sum);
    
    }
}
