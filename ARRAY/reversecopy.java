import java.util.Scanner;

public class reversecopy{
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        int size=scn.nextInt();
        int[] arr=new int[size];
       input(arr);
       reverse(arr);
       printrev(arr);
    
       
       
        }
       public static void input(int[]arr){
           for(int i=0;i<arr.length;i++){
           arr[i]=scn.nextInt(); 
           }
       }
             public static void reverse(int[]arr){
                 int[] copy=new int[arr.length];
                 int j=0;
                 for(inti=arr.length-1;i>0;i--){
                     copy[j]=arr[i];
                     j++;
                 }
                 for(int i=0;i<arr.length;i++){
                     arr[i]=copy[i];
                 }
             
                 public static void printrev(int[]arr){
                     for(int i=0;i<arr.length;i++){
                         System.out.print(arr[i]+" ");
                     }
                     System.out.println();
                 }


    
}

 


