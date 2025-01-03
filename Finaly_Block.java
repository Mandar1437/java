public class Finaly_Block 
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
            System.out.println("Exception Handeled by catch block");
            System.out.println(e.getMessage());
        }

        finally
        {
            System.out.println("Finaly Blocks Statements");
        }

        System.out.println("Excecuted");
        
        
    }
    
}
