public class Multiple_catch_Blocks 
{
    public static void main(String[] args) 
    {
        System.out.println("Program Started");

        String s = null ;
        try
        {
        System.out.println(s.length());
        }

        catch(ArithmeticException e)
        {
            System.out.println("Exception Handeled");
            System.out.println(e.getMessage());
        }

        catch(NullPointerException e)
        {
            System.out.println("Exception Handeled");
            System.out.println(e.getMessage());
        }

        catch(NumberFormatException e)
        {
            System.out.println("Exception Handeled");
            System.out.println(e.getMessage());

        }

        System.out.println("Program Executed Successfully ");
    }
    
}
