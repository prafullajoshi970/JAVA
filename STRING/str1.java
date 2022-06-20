import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int freq[] = new int[256];
        for(int i=0;i<str.length();i++){
            freq[str.charAt(i)]++;
        }
        for(int i=1;i<str.length();i++){
            if(freq[str.charAt(i)]!=freq[str.charAt(0)]){
                System.out.print("False");
                return;
            }
        }
        System.out.print("True");
    }
}