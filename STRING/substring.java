import java.io.*;
import java.util.*;

public class substring {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
    String str1 =sc.nextLine();
    String str2=sc.nextLine();
    boolean result=issubsequence(str1,str2);
    System.out.print(result);
        }
        public static boolean issubsequence(String str1,String str2){
            int i=0;
            int j=0;
            while(i<str1.length()&& j<str1.length()){
                if(str1.charAt(i)==str2.charAt(j)){
                    i++;
                }
                if(str1.length()==i){
                    return true;
                }
                j++;
            }
            return false;
        }
}


