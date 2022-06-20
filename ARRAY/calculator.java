import java.util.Scanner;

public class calculator {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {

      int A=scn.nextInt();
      int B=scn.nextInt();
      int c=scn.nextInt();
      if(c==1){
          System.out.print(A+B);
      }
      else if(c==2){
         System.out.print(A-B);  
      }
      else if(c==3){
           System.out.print(A*B);
      }else if(c==4){
          System.out.print(A/B);
      }

    }
}