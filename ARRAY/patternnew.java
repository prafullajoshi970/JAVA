import java.io.*;
import java.util.*;

public class  patternnew{
     public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        int n=scn.nextInt();
             for(int i=0;i<n;i++){
             for(int k=i+1;k<=n;k++){
                 System.out.print("* ");
             }
             System.out.println();
         }
         for(int i=0;i<n;i++){
    for(int j=0;j<=i;j++){
        System.out.print("* ");
    }
    System.out.println();}
    }
}