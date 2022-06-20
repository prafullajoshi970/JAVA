import java.util.Scanner;

public class test4 {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        int a=scn.nextInt();
        int n=10;
        for(int i=1;i<=n;i++){
            System.out.println(a + " * " + i + " = " + a * i);
        }

    }
}