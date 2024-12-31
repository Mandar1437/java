public class Exception_Handling 
{
    public static void main(String[] args) 
    {
        System.out.println("Program Started");

        String s = null ;
        try
        {
            System.out.println(s.length());
        }

        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }

        System.out.println("Excecuted");
        
    }
    
}
