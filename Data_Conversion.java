public class Data_Conversion 
{
    public static void main(String[] args) 
    {
        String s1 = "19";
        String s2 = "31";

        int sum = Integer.parseInt(s1) + Integer.parseInt(s2);
        System.out.println(sum);
        
        String s3 = "12.5";
        String s4 = "12.5";
        double add = Double.parseDouble(s3) + Double.parseDouble(s4);
        System.out.println(add);

        String s5 = "true" ;
        System.out.println(Boolean.parseBoolean(s5));


        int x =10;
        Double y =35.5;
        char z ='a';
        boolean b = true;

        System.out.println(String.valueOf(x));
        System.out.println(String.valueOf(y));
        System.out.println(String.valueOf(z));
        System.out.println(String.valueOf(b));





    }
    
}
