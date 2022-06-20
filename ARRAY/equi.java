import java.util.Scanner;

public class equi{
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        int n=scn.nextInt();
        int[] arr=new int[n];
        int[] arr1=new int[4];
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
         }
         int sum=0;
         for(int i=0;i<=3;i++){
         sum+=arr[i];

         }
            System.out.print(sum);
         
    }
}