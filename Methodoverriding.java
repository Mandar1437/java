class Bank
{
    double ROI( )
    {
        return 0; 
    }
}

class SBI extends Bank
{
    double ROI()
    {
        return 12.5;
    }
}
class ICCI extends Bank
{
    double ROI()
    {
        return 10;
    }
}

public class Methodoverriding 
{
    public static void main(String[] args) 
    {
        SBI obj1Sbi = new SBI();
        System.out.println(obj1Sbi.ROI());

        ICCI obIcci = new ICCI();
        System.out.println(obIcci.ROI());
        
    }
    
}
