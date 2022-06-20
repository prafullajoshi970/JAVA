import java.util.Scanner;

public class time{
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        int a=scn.nextInt();
        if(a<=12){
            System.out.println("Good Morning");
        }
        else if(a<=16){
            System.out.println("Good Afternoon");
        }
        else{System.out.println("Good Night");}
    }
}