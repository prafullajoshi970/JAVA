import java.util.Scanner;
public class test1 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        

        if ((v1 - v2) <= 0) {
            System.out.println("NO");
            return;
        }

        if((x1 - x2) %(v1 - v2) == 0 ){
            System.out.print("YES");
        }
        else
        {
            System.out.print("NO");
        }
    }
}