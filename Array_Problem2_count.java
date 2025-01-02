public class Array_Problem2_count 
{
    public static void main(String[] args) 
    {
        int count =0 ;
        int a[] = {100,200,300,400,500,600,200,500,100};
        int repeated_num = 100;
        for(int x:a)
        {
            if(x==repeated_num)
            {
                count = count+1;
            }
        }
        System.out.println(count);
    }
    
}
