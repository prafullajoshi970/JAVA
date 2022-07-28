import java.util.*;
public class binary{
    public static Scanner scn=new Scanner (System.in);
    public static void main (String[]args){

        int n=scn.nextInt();
        System.out.print(retrieveDecimal(n));

    }
    public static int retrieveDecimal(int binarynumber){
        int decimalnumber = 0;
        int power = 0;
        while(true)
        {
        if (binarynumber == 0)
        {
        break;
        }
        else
        {
        int temp = binarynumber%10;
        decimalnumber += temp*Math.pow(2, power);
        binarynumber = binarynumber/10;
        power++;
        }
    }
    return decimalnumber;
}

}
