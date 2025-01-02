import java.util.Arrays;
public class Array_Problem3_sort
{
    public static void main(String[] args) 
    {
        int a[] = {100,500,7,143,14,22,39,1000};
        System.out.println("Before sorting" + Arrays.toString(a));

        Arrays.sort(a);
        System.out.println("After Sorting" + Arrays.toString(a));
        
    }
    
}
