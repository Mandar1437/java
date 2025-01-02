import java.util.Arrays;
public class Array_Problem5_Decend 
{
    public static void main(String[] args) 
    {
        int a[] = {100,200,300,27,7,14,143,36,39};
        Arrays.sort(a);
        
        for(int i=a.length-1;i>=0; i--)
        {
            System.err.print(a[i] +" ");
        }

        
        
    }
    
}
