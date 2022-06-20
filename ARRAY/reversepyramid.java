import java.io.*;
import java.util.*;

public class reversepyramid{
     public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        int n=scn.nextInt();
        
        for ( int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(" ");

            }
            for(int k=0;k<=(n-1)-i;k++){
                System.out.print("* ");

            }
            System.out.println();
        }
    }
}