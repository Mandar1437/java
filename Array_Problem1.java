public class Array_Problem1 
{
    public static void main(String[] args) 
    {
        int a[] = {100,200,300,400,500,600};
        boolean status = false;
        for(int i=0; i<a.length; i++)
        {
            if(a[i]==100)
            {
               System.out.println("The number "+a[i] + " is present");
               status = true; 
               break;
            }
            
        }
        if(status== false)
        {
            System.out.println("The number is not Present");
        }
            
           
        
        
    }
    
}
