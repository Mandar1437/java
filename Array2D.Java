public class Array2D
{
    public static void main(String a[])
    {
        int n[][]= new int [2][3];
        n[0][0] = 1;
        n[0][1] = 2;
        n[0][2] = 3;

        n[1][0] = 4;
        n[1][1] = 5;
        n[1][2] =6;

        for(int i=0; i<2; i++)
        {
            for(int j=0; j<2; j++)
            {
                System.out.print(n[i][j]+" ");
            }
            System.out.println();
        }
    }
}