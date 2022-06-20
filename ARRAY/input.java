import java.util.Scanner;

public class input{

    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
 
        System.out.println("Enter number a:");
        int a = scn.nextInt();
        System.out.println("Enter number b:");
        int b = scn.nextInt();
        int c = a * b;  
        System.out.println("sum of " + a + " and " + b + " is " + c);



        String firstname=("mayuresh");
        String lastname=("kulkarni ");
        String fullname = firstname+""+lastname;
        System.out.println(fullname);


        int length=scn.nextInt();
        int breadth=scn.nextInt();
        if (length==breadth){
            System.out.println("it is a square");
        }
        else{
            System.out.println("it is rectangle");
        }
        
 
 
        int a=scn.nextInt();
        int b=scn.nextInt();
 
        if(a>b){
            System.out.println("a is greater");
        }
        else{
            System.out.println("b is greater");
        }

        

   int a=scn.nextInt();
 
   if(a%2==0){    
          System.out.println("number is even");
   } 
     else{       
         System.out.println("number is odd");   
          }






       int grade=scn.nextInt();

       if(grade>90){
           System.out.println("student passed with A grade");}
       
          else if(grade>70){
            System.out.println("student passed with B grade");}

       
        else if(grade>50){
         System.out.println("student passed with C grade");}
 
 
         else if(grade>30){
     System.out.println("student passed with D grade");}



         int numb=scn.nextInt();
         int a=numb--;
         System.out.println("numb is = "+numb);
         System.out.println("value of a is ="+a);




           
       }
       }
