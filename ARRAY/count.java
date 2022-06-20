import java.util.Scanner;

public class count{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[] args){
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length-1;i++){
        arr[i]=scn.nextInt();
        }
         int count=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<=arr[i+1]){
            System.out.print("sorted");
            }
            else{
            System.out.print("Not sorted");

            }
            return;
        }

    }
}