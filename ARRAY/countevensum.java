import java.util.Scanner;
import java.util.Arrays;

public class countevensum{
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args){
        int n=scn.nextInt();
        int[] arr=new int[n];
       
        for(int i=1;i<=arr.length-1;i++){
            for(int j=arr.length;j<=i;j++){
                    int count=1;
                if((arr[i]+arr[j])%2==0){
                    count++;
                      System.out.print(count);
                }
                 System.out.print(count);
                }
            }
        }
    }

    