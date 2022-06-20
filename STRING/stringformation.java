import java.util.Scanner;
public class stringformation{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        String str=scn.nextLine();
            int t=scn.nextInt();
            if(t==1){
                String ans = "";
        for (int i = str.length() - 1; i >= 0; i--) {// O(n)
            char ch = str.charAt(i);
            ans = ans + ch;// O(n)
            
        }
        System.out.print(ans);
        return;
}}}






else if(t==2){
    int f=scn.nextInt();
    
    if(f==1){
        String ans="";
        for (int i=0;i <=str.length() - 1; i++) {// O(
    char cha= str.charAt(i);
    ans = ('C'+cha+" ");// O(n)
        }

    }
    else if(f==2){
        ans= (cha+'C'+" ");
    }
}
        }
    }
    
