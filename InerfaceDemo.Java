interface Shape
{
    int l =20;  //variables in interface are static and final
    int b =10;   //variables in interface are static and final

    void Square();  //Abstract method which does not have body by default abstract will be public

    static void circle()
    {
        System.out.println("This is static method");
    }

    default void rectangle()
    {
        System.out.println("This is default method");
    }


}

public class InerfaceDemo implements Shape
{
    public void Square()     // This abstaract method in which the body part is decelared  in class
    {
        System.out.println("Thsi abstract method");
    }

    public static void main(String[] args)
    {
        // Method 1
        // Creating a object from class and storing it ina class
        /*InerfaceDemo obj = new InerfaceDemo();
        obj.Square();
        obj.rectangle();

        Shape.circle();  // static methods are directly acessed from interface
        */

        //Method 2
        // Creating a object from class and storing in an Interface

        Shape obj = new InerfaceDemo();
        obj.rectangle();
        obj.Square();

        Shape.circle();

    }
}