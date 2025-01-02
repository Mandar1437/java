public class Box 
{
    double width, height, length;

    Box()                               // default constructor
    {
        width = height=length =0;
    }

    Box(double w, double h, double l)   // constructor with parameters
    {
        width = w;
        height= h;
        length = l;
    }

    Box(double len)
    {
        width = height=length= len;
    }

    double volume()
    {
        return(width*length*height);
    }
    

    public static void main(String[] args) 
    {
        // Box b = new Box();
        // System.out.println(b.volume());
        Box b = new Box(10.5, 5.0, 7.5);
        System.out.println(b.volume());

        Box z = new Box(10);
        System.out.println(z.volume());
        
    }
}
