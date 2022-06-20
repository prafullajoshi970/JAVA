import java.util.Scanner;

public class p2{
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
     int size=Integer.parseInt(scn.next());
     int[] arr=new int[size];
     int a;
     for(int i=0;i<arr.length;i++){
      arr[i]=scn.nextInt();  
     }
       int count=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if((arr[i]+arr[j])%2==0){
                    count++;
                }

                 
                }
             
            }
               System.out.print(count);
        }
    }
     


    