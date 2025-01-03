class Parent
{
    void display(int a)
    {
        System.out.println(a);
    }
}

class Child1 extends Parent
{
    void print(int b)
    {
        System.out.println(b);
    }
}

class Child2  extends Parent
{
    void show(int c)
    {
        System.out.println(c);
    }
}


public class Herarchial 
{
    public static void main(String[] args) 
    {
        Child1 obj1 = new Child1();
        obj1.display(10);
        obj1.print(20);

        Child2 obj2 = new Child2();
        obj2.display(50);
        obj2.show(30);
        
    }
}
