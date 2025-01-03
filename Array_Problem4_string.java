import java.util.Arrays;
public class Array_Problem4_string
{
    public static void main(String[] args) 
    {
        String s[] = {"MSD","Sachin","Mandar","Java","Abhishek"};
        System.out.println("Before sorting" + Arrays.toString(s));

        Arrays.sort(s);
        System.out.println("After Sorting" + Arrays.toString(s));
        
    }
    
}

