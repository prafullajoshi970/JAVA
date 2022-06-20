1
import java.io.*;
2
import java.util.*;
3
import java.text.*;
4
import java.math.*;
5
import java.util.regex.*;
6
​
7
public class Solution {
8
​
9
    public static void main(String[] args) {
10
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
11
        Scanner sc = new Scanner(System.in);
12
         String str = sc.next();
13
        
14
​
15
    int[] freq = new int[26];
16
​
17
    for(int i = 0; i < str.length(); i++){
18
     int q = str.charAt(i) - 'a';
19
      freq[q] += 1;
20
    }
21
​
22
    int max = Integer.MIN_VALUE;
23
​
24
    for(int i = 0; i < 26; i++){
25
    if(freq[i] > max){
26
    max = freq[i];
27
        }
28
}
29
​
30
    char ans = 'a';
31
​
32
   for(int i = 0; i < 26; i++){
33
    if(max == freq[i]){
34
    ans += i;
35
        break;
36
    }
37
        }
38
​
39
    for(int i = 0; i < str.length(); i++){
40
    if(ans == str.charAt(i)){
41
    System.out.print(i+1 + " ");
42
        }
43
    }
44
​
45
         
46
    }
47
}
Contest Calendar | Interview Prep | Blog | Scoring | Environment | FAQ | About Us | Support | Careers | Terms Of Service | Privacy Policy | Request a Feature


