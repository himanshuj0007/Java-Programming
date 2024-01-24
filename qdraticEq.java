import java.lang.*;
import java.util.Scanner;
class qdraticEq
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        float a,b,c;
        double r,r1,r2;

        System.out.println("Enter value of a, b and c: ");
        a=sc.nextFloat();
        b=sc.nextFloat();
        c=sc.nextFloat();

        r=Math.sqrt((b*b)-(4*a*c));
        r1=(-b+(r))/(2*a);
        r2=(-b-(r))/(2*a);

        System.out.println("roots are : "+r1+" "+r2);
        //System.out.println("r2 : "+r2);
    }
}

