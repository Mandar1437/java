class Computer
{
    public void play_music()
    {
        System.out.println("Music Playing...");
    }

    public String get_me_pen(int cost)
    {
        return "Pen";
    }
}
public class Method 
{
    public static void main(String a[] ) 
    {
        Computer obj = new Computer();
        obj.play_music();
        String str = obj.get_me_pen(10);
        System.out.println(str);
        
    }
    
}
