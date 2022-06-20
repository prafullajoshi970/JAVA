import java.util.Scanner;

public class powercalc {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {

      int A=scn.nextInt();
      int B=scn.nextInt();
      double c=Math.pow(A,B);
      int d=(int)c;
      System.out.print(d);

    }
}