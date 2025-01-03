import java.util.concurrent.ForkJoinPool.ManagedBlocker;

public class Accountmain 
{
    public static void main(String[] args) 
    {
        Account acc = new Account();
        /*acc.setaccdetails(101);
        System.out.println(acc.getaccdetails());

        acc.setaccname("Mandar");
        System.out.println(acc.getaccname());

        acc.setaccbalance(15000);
        System.out.println(acc.getaccbalance());
        */

        acc.setaccdetails(101, "Mandar", 100);

        acc.getdetails();
        
    }
    
}
