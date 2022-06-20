import java.util.Scanner;
import java.util.Arrays;

public class cocarray{
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        //input two arrays
     int size=Integer.parseInt(scn.next());
     int[] arr=new int[size];
     int size1=Integer.parseInt(scn.next());
     int[]arr1=new int[size1];

     for(int i=0;i<arr.length;i++){
      arr[i]=scn.nextInt();}
      for(int j=0;j<arr1.length;j++)  {
      arr1[j]=scn.nextInt();
     }
    int arrlength=arr.length;
    int arr1length=arr1.length;
    int[] result= new int[arrlength+arr1length];

    System.arraycopy(arr,0,result,0,arrlength);
    System.arraycopy(arr1,0,result,arrlength,arr1length);

    System.out.println(Arrays.toString(result));

     }
           
         }

         
         
    

     


    