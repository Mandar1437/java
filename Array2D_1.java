public class Array2D_1 
{
    public static void main(String[] args) 
    {
        int a[][] = new int[2][2];
        a[0][0] = 10;
        a[0][1] = 20;
        a[1][0] = 30;
        a[1][1] = 40;

        int x = a.length;
        int y = a[0].length;
        int len = x*y;
        System.out.println("The number of rows in a are: " + x);
        System.out.println("The number of columns in a are: " + y);
        System.out.println("Total number of elements in a are:" + len);

        // To read all array elements

        for(int i=0; i<a.length; i++)
        {
            for( int j=0; j<a[i].length;j++) 
            {
                System.out.print(a[i][j] + "   ");

            }
            System.out.println();
        }
        
    }
    
}
