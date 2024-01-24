import java.lang.*;
public class arr2D
{
    public static void main (String[] args)
    {
        int[][] a ={{23,5,4},{4,26,8}};

        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[0].length;j++)
                System.out.print(a[i] [j]+" ");
            System.out.println(" ");
        }

        for (int i[]:a)
        {
            for (int y:i)
                System.out.print(y+" ");
            System.out.println(" ");

        }

    }
}
