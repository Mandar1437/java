public class Addermain 
{
    public static void main(String[] args) 
    {
        Adder addobj = new Adder();

        addobj.sum();
        addobj.sum(100, 200.0);
        addobj.sum(100.0, 200);
        addobj.sum(100,200);
        addobj.sum(100, 50, 50);
        
    }
    
}
