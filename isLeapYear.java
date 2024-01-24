import java.util.Scanner;
public class isLeapYear
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int y=sc.nextInt();

        if(y%400==0) System.out.println("leap year");
        else if (y%100==0) System.out.println("not a leap year");
        else if(y%4==0) System.out.println("leap year");
        else System.out.println("not a leap year");


    }
}
