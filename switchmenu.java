import java.util.Scanner;
public class switchmenu
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("add\nsub\nmul\ndiv\nenter the word to perform operation:\n");
        String str=sc.nextLine();
        System.out.println("enter two no: ");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        switch(str)
        {
            case "add": System.out.println(n1+n2);
                break;
            case "sub": System.out.println(n1-n2);
                break;
            case "mul": System.out.println(n1*n2);
                break;
            case "div": System.out.println(n1/n2);
                break;
            default: System.out.println("invalid");
        }
    }
}