
import java.util.Scanner;

public class hsal
{
    public static void main(String[] args)
    {
        System.out.println("Hello World");
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int t=sc.nextInt();
        int nn=n;
        for(int i=1;i<t+1;i++,n=n*nn)
        {
            if(t==i) System.out.print(n);
        }
    }
}
