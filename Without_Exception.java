public class Without_Exception 
{
    
        public static void main(String[] args) {
            System.out.println("Program Started");
    
            // ArithmeticException: Division by zero
            int result = 10 / 0; // This will cause an exception
    
            // NullPointerException
            String s = null;
            System.out.println(s.length()); // This will cause an exception
    
            // ArrayIndexOutOfBoundsException
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]); // This will cause an exception
    
            System.out.println("Program Ended");
        }
    
    
    
}
