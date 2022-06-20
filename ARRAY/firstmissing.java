import java.util.Scanner;

public class addmatrices {
     public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int[] arr = new int[10];
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        int ans = missing(arr);
        System.out.print(ans);
    }

    public static int missing(int[] arr) {
        int n = arr.length;
        for (int i = 1; i <= n; i++) {
            boolean res = search(arr, i);
            if (res == false) {
                return i;
            }
        }
        return n + 1;
    }

    public static boolean search(int[] arr, int val) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == val) {
                return true;
            }
        }
        return false;
    
    }

}


