 interface I1 
{
    int x=100;
    void m1();
}

interface I2 
{
    int y=100;
    default void m2()
    {
        System.out.println(y);
    }
}

class Demo
{
    int z = 200;
    void m()
    {
        System.out.println(z);
    }
}

public class Interface extends Demo implements I1, I2 
{
    public void m1()
    {
        System.out.println(x);
    }
    public static void main(String[] args) 
    {
        Interface obj = new Interface();
        obj.m1();
        obj.m2();
        obj.m();
        
        
    }
    
}
