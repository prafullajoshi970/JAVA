import java.util.Scanner;

public class p3 {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
         int size=Integer.parseInt(scn.next());
 int[] arr=new int[size];
 boolean is=true;
 for(int i=0;i<arr.length;i++){
  arr[i]=scn.nextInt();  
        printArray(arr);
        sortArrayOptimized(arr);
        printArray(arr);
    }
    }
 public static void sortArrayOptimized(int[] arr) {
        int i = 0;
        int j = 0;
        while (j < arr.length) {
            if (arr[j] == 0) {
                swap(arr, i, j);
                i++;
                j++;
            } else {
                j++;
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        arr[j] = ((arr[i] + arr[j]) - (arr[i] = arr[j]));
    }

    public static void printArray(int[] arr) {
        for (int ele : arr) {

            System.out.print(ele + " ");
        }
        System.out.println();
    }
}