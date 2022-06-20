import java.util.Scanner;

public class serachelem {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {

        int l = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[l][m];
        int target=scn.nextInt();
         
        //   array input
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                  arr[i][j] = scn.nextInt();
            }
        }

       for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[0].length;j++){
            if(arr[j][i]==target){
                System.out.print("Yes");
               break;
            }
            
            
            }
               
        }
        
         System.out.print("No");
       }
               
       
       
    }