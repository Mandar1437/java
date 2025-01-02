public class Method_types
{
    void func1()            // Method with no args and no return value
    {
        System.out.println("Hello");
    }

     String func2()   // Method with no args and  return value
     
     {
        return("Hello how are you");   //whenever we are using return func we have add datatype befrore func name   
     }

     void func3(String name)        // Method with  args and  no return value
     {
        System.out.println("Hello" + name);
     }
     String func4(String name)        // Method with  args and  no return value
     {
        return("Hello " + name);
     }
    public static void main(String[] args) 
    {
        Method_types val = new Method_types();
        val.func1();

        String s= val.func2();      // store that func in other variable of same datatype
        System.out.println(s);

        val.func3("Prashant");

        String s1= val.func4("David");
        System.out.println(s1);

    }
}
