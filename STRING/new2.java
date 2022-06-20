import java.util.Scanner;
public class new2 {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
	{int N=scn.nextInt();
	    int count=1;
		int arr[]=new int[N];
        for(int j=0;j<arr.length-1;j++){
        arr[j]=scn.nextInt();
        }

         for(int i=0;i<arr.length-1;i++){
			 for (int j=i+1;j<arr.length-1;j++)
            if(arr[i]==arr[j]){
              count++;
            }
                
              
            }
             System.out.print(count); 
         
         }
            

    }
}