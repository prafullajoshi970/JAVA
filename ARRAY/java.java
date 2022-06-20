 import java.util.Scanner;

public class java{

    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {

        int time= scn.nextInt();
        if(time < 12){
            System.out.println("goodmorning");
        }
        else if(time <=16){
            System.out.println("good afternoon");

        }
        else if(time<=20){
            System.out.println("good evening");
        }
        else{
            System.out.println("good night");
        }

        // int n=scn.nextInt();
        // boolean prime=true;
        // for(int i=2;i<=n-1;i++){
            // if(n%i==0){
                // prime=false;
                // break;

            // }
            // else if(prime==true){
                // System.out.println("prime number");
                // break;
            // }
        // }



    }
}
