import java.util.Scanner;

public class test1 {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {

        int a=scn.nextInt();
        int b=scn.nextInt();
        int n=scn.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int count=0;

        for(int i=0;i<n;i++){
            if((a+b)<arr[i]){
               count++; 
            }
            else if(a<arr[i]){
                count++;
            }
        }
            if(count>=1){
                System.out.print("yes");

            }
            else{
                System.out.print("No");
            }
        }

    }


