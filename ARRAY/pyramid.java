import java.util.Scanner;

public class pyramid{
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        for (int i=1;i<=5;i++){
            for(int space=0;space<=(9-i);space++){
                System.out.print(" ");
            }
            for(int j=1;j<=(i*2-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=4;i<=1;i++){
            for(int s=(7-i);s<=0;s++){
                System.out.print(" ");
            }
            
                System.out.print("*");
            }

        }
    
    }
