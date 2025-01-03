class Computer
{
    public int add(int n1, int n2, int n3)
    {
        return n1+n2+n3;

    }

    public double add(double n1, int n2)
    {
        return n1+n2;
    }
}


public class Method_overloading
{
    public static void main(String a[])
        {
            Computer obj = new Computer();
            double r = obj.add(3.0,4);
            System.out.println(r);
        }
}
