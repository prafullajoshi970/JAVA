import java.util.Scanner;

public class array2{
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        int size=scn.nextInt();
        int[] arr=new int[size];
       input(arr);
       evenIndex(arr);
       
       
        }
       public static void input(int[]arr){
           for(int i=0;i<arr.length;i++){
           arr[i]=scn.nextInt();
           }
       }
       public static void evenIndex(int[]arr){
           for(int i=0;i<arr.length;i+=2){
               System.out.print(arr[i]+" ");
           }
           System.out.println();
       }
}