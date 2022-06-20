import java.util.Scanner;

public class test4 {
     public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int n=scn.nextInt();
        for(int i=0;i<n;i++){
             int m=scn.nextInt();
             int s=scn.nextInt();
             int ans=scn.nextInt()-1;
           
           while(lop!=0){
            s--;
            ans++;
            if(ans>m)
            ans=1;
           }
           System.out.println(ans);
        }

    }
}
