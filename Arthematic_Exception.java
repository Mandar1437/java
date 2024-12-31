import java.util.Scanner;

public class Arthematic_Exception 
{
    public static void main(String[] args) 
    {
         System.out.println("Program Started");

         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the number");
         int num = sc.nextInt();

         try
         {
            System.out.println(100/num);
         }

         catch(ArithmeticException e)
         {
            System.out.println("Invalid Input Can't divide by Zero ");
         }


         System.out.println("Excecuted");
        
    }
    
}
