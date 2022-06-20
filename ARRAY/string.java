import java.io.*;
import java.util.*;

public class string{
   public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
       int n=5;
       for (int i=1;i<=n;i++){
          for(int j=1;j<=n;j++){
             if(i==j){
                System.out.print("*");
             }
             else{
                System.out.print(" ");
             }
             System.out.println();
          }
       }
      
      
    }
}