import java.util.Scanner;

public class factorialsum{
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
     int size=scn.nextInt();
     int sum=0; int f=1;
     for(int i=1;i<=size;i++){
        f=f*i;
        sum=sum+f;
       
        
     }
      System.out.print(sum);
     
     return;
    }
}