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
    public class Object_typecasting 
    {
    public static void main(String[] args) 
    {
        /*Child obj =new Child();
        obj.m1();
        System.out.println(obj.name);

        obj.m2();
        System.out.println(obj.x);
        */

        // Upcasting 

        /*Parent P = new Child();        // Here the class is parent class we cannot access the methods and variables of Child
        P.m1();
        System.out.println(P.name);
        */
        /*P.m2();                       // we cannot access the methods and variables of Child class
         System.out.println(P.x);     // we cannot acess the methods and variables of Child class
        */
    
        // Downcastig             During Excecution it will throw an typecasting excetion
        /*Parent p = new Parent();
        Child c = (Child) p;       // There is a mismatch in class

        System.out.println(c.name);
        c.m1();

        System.out.println(c.x);
        c.m2();
        */
    }

}
