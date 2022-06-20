import java.util.Scanner;

public class array{
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        int size=scn.nextInt();
        int[] arr=new int[size];
       input(arr);
       printArray(arr);
       
        }
        public static void input(int[]arr){
            for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
            }
        }



    
        public static void printArray(int[]arr){
            for(int i=0; i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
}
        
        
    

