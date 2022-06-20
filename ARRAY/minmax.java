import java.util.Scanner;

public class minmax{
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        int min = Integer.MAX_VALUE;
         int[] arr=scn.nextInt();
         for(int i=0;i<=arr.length;i++){
         if(arr [i] < min){
             min=arr[i];
         }
          System.out.println(min);
    }
   
}
}