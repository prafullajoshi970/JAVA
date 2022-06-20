import java.util.Scanner;

public class array1{
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        int size=scn.nextInt();
        int[] arr=new int[size];
       input(arr);
       reverse(arr);
       
       
        }
       public static void input(int[]arr){
           for(int i=0;i<arr.length;i++){
           arr[i]=scn.nextInt();
           }
       }

       public static void reverse(int[]arr){
           for(int i=arr.length-1;i>=0;i--){
              System.out.print(arr[i]+" ");
           }
           System.out.println();
       }
}