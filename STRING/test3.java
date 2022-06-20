import java.util.Scanner;

public class test3 {
     public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int n=scn.nextInt();
        int k=scn.nextInt();
        int[] arr = new int[n];
        
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        int count=0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
               if((arr[i]+arr[j])%k==0){
                count++;
               } 
            }
          
        }
          System.out.print(count);

    }
}