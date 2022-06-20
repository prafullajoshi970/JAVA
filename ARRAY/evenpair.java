import java.util.Scanner;

public class evenpair{
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
     int size=Integer.parseInt(scn.next());
     int[] arr=new int[size];
     int count=0;
     input(arr);
     printarray(arr);
    }

     public static void input(int[] arr){
     for(int i=0;i<arr.length;i++){
      arr[i]=scn.nextInt();  
     }
     }
     public static void printarray(int[] arr){
        int sum=0;
         for(int i=0;i<arr.length;i++){
           if(arr[i]%2==0){
               sum=sum+arr[i];
           }
                
            }
           System.out.print(sum);
           
         }
         
         
     }

     


    