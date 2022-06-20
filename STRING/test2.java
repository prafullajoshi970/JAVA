import java.util.Scanner;

public class test2{
     public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
         int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        }
        int low = arr[0];
        int high = arr[0];
        int ans1 = 0, ans2 =0;
        for (int i = 1; i < n; i++) {
            if (arr[i] > high) {
                ans1++;
                high = arr[i];
            }
            if (arr[i] < low) {
                ans2++;
                low = arr[i];
            }
        }
        System.out.println(ans1 + " "+ ans2);
    }

}
    