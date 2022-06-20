import java.util.Scanner;

public class array4{
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        int size=scn.nextInt();
        int[] arr=new int[size];
       input(arr);
       oddvalues(arr);
       
       
        }
       public static void input(int[]arr){
           for(int i=0;i<arr.length;i++){
           arr[i]=scn.nextInt();
           }
       }
       public static void oddvalues(int[]arr){
           for(int i=0;i<arr.length;i++){
               if(arr[i]%2==0){

               
               System.out.print(arr[i]+" ");
               }

           }
           System.out.println();
       }
}