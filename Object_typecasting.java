public class Object_typecasting 
{
    class Parent
    {
        String name = "John";
        void m1()
        {
            System.out.println("This method m1");
        }
    }


    class Child extends Parent
    {
        int x =100;

        void m2()
        {
            System.out.println("This is m2 method from child class");
        }
    }

    public static void main(String[] args) 
    {
        Child obj =new Child();
        obj.m1();
        System.out.println(obj.name);

        obj.m2();
        System.out.println(obj.x);
        
    }


    
}
