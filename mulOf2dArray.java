public class mulOf2dArray
{
    public static void main (String[] args)
    {
        int[][] a ={{23,5,4},{4,26,8}};
        int[][] b ={{23,5,4},{4,26,8}};
        int[][] c =new int[2][3];

        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[0].length;j++)
                c[i][j]=((a[i][j])*b[i][j]);
            System.out.println(" ");
        }

        for (int i[]:c)
        {
            for (int y:i)
                System.out.print(y+" ");
            System.out.println(" ");

        }

    }
}
