import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long n1=n,r,rn=0;
        while(n>0)
        {
            r=n%10;
            rn=rn*10+r;
            n=n/10;
        }
        System.out.println(rn);
        if(n1==rn) System.out.println("yes");
    }
}
