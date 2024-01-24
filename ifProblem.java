import java.util.*;
public class ifProblem
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        int gr=sc.nextInt();
        if(gr>90) System.out.println("A");
        else if(gr>75) System.out.println("B");
        else if(gr>60) System.out.println("C");
        else if(gr>40) System.out.println("D");
        else System.out.println("F");
    }
}
