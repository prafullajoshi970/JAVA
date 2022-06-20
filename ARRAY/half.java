import java.io.*;
import java.util.*;

public class half {

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
           
       Arrays.sort(arr);
        
             for (int i = 0; i < n / 2; i++){
                System.out.print(arr[i]+" ");
             }
        
            for (int j = n - 1; j >= n / 2; j--){
                
            
          System.out.print(arr[j]+" ");
            }
  
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}