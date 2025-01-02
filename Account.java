public class Account 
{
    private int accno;
    private String name;
    private double balance;


    void setaccdetails(int acno)
    {
        accno = acno;
    }
    
    int getaccdetails()
    {
        return accno;
    }

    void setaccname(String Name)
    {
        name=Name;
    }

    String getaccname()
    {
        return name;
    }

    void setaccbalance(int bal)
    {
        balance= bal;
    
    }

    double getaccbalance()
    {
        return balance;
    }

    void setaccdetails(int accno , String Name , int bal)
    {
        this.accno = accno;
        name = Name;
        this.balance = bal;
    }

    void getdetails()
    {
        System.out.println(accno); 
        System.out.println(name);
        System.out.println(balance);

    }
    
}
