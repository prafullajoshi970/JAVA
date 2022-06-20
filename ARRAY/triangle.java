import java.util.Scanner;
import java.util.Arrays;

public class triangle{
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args){
        int n=scn.nextInt();
        for(int i=0;i<n;i++){
            for(int j=n-1;j>=i+1;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i+1;k++){
                System.out.print("*");
            }
            System.out.println();

        }//row
        for(int i=n-1;i>=1;i--){
            for(int k=n;k>=i+1;k--){
                System.out.print(" ");
            }
            //coloumn
            for(int j=1;j<=i;j++){
            System.out.print("*");
        }
         System.out.println();
        }
       

    }
}
