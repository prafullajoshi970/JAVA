import java.util.Scanner;
public class function{
    public static Scanner scn= new Scanner(System.in);
    public static void main ( String[]args){
          int c=sum(5,10);
          System.out.println("sum is"+ c);
    }
      public static int sum(int a,int b){
          int c=a +b;
          return c;
      }
    }