import java.util.Scanner;

public class Input 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num1 = sc.nextInt();

        System.out.println("Enter the number2 ");
        int num2 = sc.nextInt();

        int res = num1 + num2;
        System.out.println(res);

        sc.close();
        
    }
    
}
