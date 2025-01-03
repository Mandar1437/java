import java.util.Arrays;
public class Array_Problem7 
{
    public static void main(String[] args) 
    {
        int a[] = {2,3,1,4,5,6,8};
        int num = 0;
        Arrays.sort(a);
        for(int i=0;i<a.length;i++)
        {
            if(a[i]+1 !=a[i+1])
            {
                num = a[i]+1;
                System.out.println("The missing number is: " + num );
                break;
            }
        }
        
    }
    
}
