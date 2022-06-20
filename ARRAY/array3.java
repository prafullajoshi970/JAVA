import java.util.Scanner;

public class array3{
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        int size=scn.nextInt();
        int[] arr=new int[size];
       input(arr);
       oddIndex(arr);
       
       
        }
       public static void input(int[]arr){
           for(int i=0;i<arr.length;i++){
           arr[i]=scn.nextInt();
           }
       }
       public static void oddIndex(int[]arr){
           for(int i=0;i<arr.length;i+= 1){
               System.out.print(arr[i]+" ");
           }
           System.out.println();
       }
}