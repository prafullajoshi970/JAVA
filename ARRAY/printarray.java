import java.util.Scanner;
import java.util.Arrays;

public class printarray{
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
     int size=Integer.parseInt(scn.next());
     int[] arr=new int[size];
     
     for(int i=0;i<arr.length;i++){
      arr[i]=scn.nextInt();
       
      }
      int n=arr.length;
              for (int j = n-1; j >= 0; j--)
    {
        if (j % 2 == 0)
        {
         
                  System.out.println(arr[j] + " ");   
              }    
        }
    }
          }  
      


