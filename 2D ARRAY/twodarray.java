import java.util.Scanner;

public class twodarray {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        // row
        System.out.print("number of rows");

        int r = scn.nextInt();
        // column
        System.out.print("number of coloumns");
        int c = scn.nextInt();
        // Array initialize
        System.out.print("type input values");
        int[][] arr = new int[r][c];
        // input
        inputValues(arr);
        // print
        printArray(arr);

        printReverseArray(arr);
    }

    public static void inputValues(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
    }

    public static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void printReverseArray(int[][] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = arr[0].length - 1; j >= 0; j--) {
             
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

}