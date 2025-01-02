
    class MathUtility {
        
        static int counter = 0;
    
        
        public static int add(int a, int b) {
            counter++; 
            return a + b;
        }
    
        
        public void displayCounter() {
            System.out.println("The add method was called " + counter + " times.");
        }
    }
    
    public class Static {
        public static void main(String[] args) {
           
            int sum1 = MathUtility.add(5, 10);
            int sum2 = MathUtility.add(20, 30);
    
            System.out.println("Sum 1: " + sum1);
            System.out.println("Sum 2: " + sum2);
    
            
            MathUtility util = new MathUtility();
            util.displayCounter(); 
        }
    }
    


    

