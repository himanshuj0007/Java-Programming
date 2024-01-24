import java.util.Scanner;
public class TypeOfWebsite
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        boolean b=str.startsWith("https://");
        if(b)  System.out.println("website is secured");
        else  System.out.println("website is not secured");
        if(str.endsWith(".com")) System.out.println("protocol used: commercial");
        else if(str.endsWith(".gov")) System.out.println("protocol used: government");

    }
}
