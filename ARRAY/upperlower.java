import java.util.Scanner;

public class upperlower{
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
         char a = scn.next().charAt(0);   
         if(a>=65 && a<=96){
             System.out.print("Char is Uppercase");
         }
         else if(a>=97 && a<=123){
             System.out.print("Char is Lowercase");
         }


    }
}
       