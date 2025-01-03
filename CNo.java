class Calculator
{
    public int add(int n1, int n2)
    {
       
        int r = n1+n2;
        return r;
    }
}
public class CNo 
{ 
    public static void main(String a[]) 
    {
        Calculator calc = new Calculator();
        int num1 =5;
        int num2 = 10;
        int result = calc.add(num1,num2);
        System.out.println(result);
        
    }
    
}
