import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Checked_Exception 
{
    public static void main(String[] args) throws InterruptedException, FileNotFoundException 
    {
        System.out.println("Pragram Started ");
        System.out.println("Program in progress");

        Thread.sleep(5000);

        FileInputStream file = new FileInputStream("C:\\Text.txt");

        System.out.println("Program Finished");
        System.out.println("Program Excecuted");
        

        
        
    }
    
}
