import java.io.*;
import java.util.*;

public class str {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1 = (int)Math.sqrt(n);
        for(int i=0;i<=n1;i++){
            for(int j=0;j<=n1;j++){
                int sum = i*i + j*j;
                if(sum==n){
                    System.out.print("True");
                    return;
                }
            }
        }
        System.out.print("False");
    }
}