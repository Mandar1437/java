import java.util.Arrays;

public class Array_Problem6 
{
    public static void main(String[] args) 
    {
        int a[] = {50,20,40,10,100};
        System.out.println("The array elements before sorting is ....");
        System.out.println(Arrays.toString(a));
        int temp = 0;
        int n =a.length;

        for(int i=0; i<n-1; i++)
        {
            for (int j=0; j<n-1-i;j++)
        
            {
                if(a[j]>a[j+1])
                {
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1]= temp;

                }
            }
        }
        System.out.println("The numbers after sorting is .....");
        System.out.println(Arrays.toString(a));
    }
    
}
