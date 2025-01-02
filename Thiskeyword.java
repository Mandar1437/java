public class Thiskeyword 
{
    int x,y;
    /*Thiskeyword(int x, int y)       //using constructour
    {
        this.x=x;
        this.y =y;
    }
    */

    void setdata(int x, int y)  //using methods
    {
        this.x=x;
        this.y=y;
    }
    void display()
    {
        System.out.println(x);
        System.out.println(y);
    }
    public static void main(String[] args) 
    {
        // Thiskeyword th = new Thiskeyword(100, 200);
        Thiskeyword th = new Thiskeyword();
        th.setdata(100, 200);
        th.display();
        
    }    
}
