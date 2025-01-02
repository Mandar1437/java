import java.util.Arrays;
import java.util.Scanner;

public class Array_Input 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n = sc.nextInt();
        int a[] = new int[n];

        for(int i =0; i<n;i++)
        {
            System.out.println("Enter the number at " +i+" th Index");
            a[i] = sc.nextInt();
        }

        System.out.println("The array elements are.... ");
        System.out.println(Arrays.toString(a));

        sc.close();

        
    }
    
}
