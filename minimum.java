import java.util.Scanner;
import java.util.Arrays;

public class minimum {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        // size input
        int size = scn.nextInt();
        // array initialize
        int[] arr = new int[size];
        // input
        input(arr);
        Arrays.sort(arr);// increasing order sort
        printArray(arr);
    }

    public static void input(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
    }

    public static void printArray(int[] arr) {
        for(int i=0;i<arr.length;i++){
           
                System.out.print(arr[0]);
              return;
            }
    }

}


