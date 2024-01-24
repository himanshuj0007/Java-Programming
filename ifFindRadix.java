import java.util.Scanner;
public class ifFindRadix
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner (System.in);
        System.out.println("enter any no: ");
        String str=sc.nextLine();

        if(str.matches("[01]*")) System.out.println("binary");
        else if(str.matches("[0-7]*")) System.out.println("octal");
        else if(str.matches("[0-9]*")) System.out.println("decimal");
        else if(str.matches("[0-9A-F]||[0-9][A-F]||[A-F][A-F]")) System.out.println("HEXA-decimal");
        else System.out.println("enter valid number");
    }
}
