import java.util.*;

public class same{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        String str1=scn.nextLine();
        String str2=scn.nextLine();
        samestr(str1,str2);
    }
    public static void samestr(String str1,String str2){
        int[]fmap1 =fmap(str1);
        int[]fmap2 =fmap(str2);
        boolean ans=true;
        for(int i=0;i<256;i++){
            if(fmap1[i]!=fmap2[i]){
                ans=false;
            }
        }
        if(ans){
            System.out.print("same");
        }
        else{
            System.out.print("different");
        }

    }
    public static int[] fmap(String str){
        int len=str.length();
        int[]fm=new int[256];
        for(int i=0;i<len;i++){
         char ch=str.charAt(i);
         fm[ch]++;
        }
        return fm;


    }
}
