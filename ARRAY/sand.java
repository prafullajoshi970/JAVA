import java.util.Scanner;

public class sand{
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        		
int rows = 5;
int i = 0, j, k;
		
while (i <= rows - 1) 
{
	j = 0 ;
	while(j < i ) 
	{
		System.out.print(" ");
		j++;
	}
	
	k = i;
	while( k <= rows - 1) 
	{
		System.out.print("* ");
		k++;
	}
	System.out.println();
	i++;
}
		
i = rows - 1;
while ( i >= 0 ) 
{
	j = 0 ;
	while ( j < i) 
	{
		System.out.print(" ");
		j++;
	}
	
	k = i;
	while(k <= rows - 1) 
	{
		System.out.print("* ");
		k++;
	}
	System.out.println();
	i--;
}
        // 
        // for (int i=1;i<=5;i++){
            // for(int space=0;space<=(5-i);space++){
                // System.out.print(" ");
            // }
            // for(int j=1;j<=(i*1);j++){
                // System.out.print("* ");
            // }
            // System.out.println();
            // }

        }
    
    }

