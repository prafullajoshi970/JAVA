import java.util.Scanner;

public class test2 {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        boolean asmile=scn.nextBoolean();
        boolean bsmile=scn.nextBoolean();

        if(asmile==true && bsmile==true){
            System.out.print("TROUBLE");

        }
        else if(asmile==false && bsmile==false){
            System.out.print("TROUBLE");
        }
        else{
            System.out.print("NO TROUBLE");

        }
    }
}