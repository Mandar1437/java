public class Sum_digit 
{
    public static void main(String[] args)  
    {
        int num = 126;
        //int dig = 0;
        int sum = 0;
        int l = 0;

        /*while(num>0)
        {
            dig = num %10;
            sum = sum + dig;
            num = num /10;

        }
        */
        for(int dig = num; dig>0; dig=dig/10)
        {
            l = dig % 10;
            sum = sum + l;
        }
        System.out.println(sum);
    }

    
}
