import java.util.Scanner;

public class palindrome{
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {

      String a, b = "";
      Scanner sc = new Scanner(System.in);
      a = sc.nextLine();
 
      int length = a.length();
 
      for ( int i = length - 1; i >= 0; i-- )
         b = b + a.charAt(i);
 
      if (a.equals(b))
         System.out.println("Palindrome");
      else
         System.out.println("Not a Palindrome");
    }
}