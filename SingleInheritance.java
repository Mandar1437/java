
class A
{
    int a= 100;

    void display()
    {
        System.out.println(a);
    }
}

class B extends A
{
        int b =200;

        void show()
        {
            System.out.println(b);
        }
}

class C extends B
{
    int c = 300;

    void print()
    {
        System.out.println(c);
    }
}

public class SingleInheritance
{
public static void main(String[] args) 
{
    C obj = new C();
    System.out.println(obj.a);
    System.out.println(obj.b);
    System.out.println(obj.c);

    obj.display();
    obj.show();
    obj.print();
}

}