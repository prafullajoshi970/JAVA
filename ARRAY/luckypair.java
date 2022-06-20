import java.util.Scanner;

public class luckypair{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[] args){
     
     int n=scn.nextInt();
     int[]arr=new int[n];
     for(int i=0;i<=arr.length-1;i++){
         arr[i]=scn.nextInt();
     }
     int count=0;
     for(int i=1;i<n;i++){
         for(int j=i+1;j<n;j++){
          if((arr[i]==arr[j])||i<j){
                count++;
            }
        }
             System.out.print(count);
         return;
     }
    }
}

    

