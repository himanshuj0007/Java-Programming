import java.util.*;
class check
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter any binary number");
        String i=sc.nextLine();
        System.out.println(i.matches("[01]*"));

        System.out.println("enter any hexadecimal number");
        String ii=sc.nextLine();
        System.out.println(ii.matches("[A-F0-9]|[0-9][A-F]|[A-F][A-F]"));

        System.out.println("enter any date");
        String iiI=sc.nextLine();
        System.out.println(iiI.matches("([0-2][0-9]|[0-3][01])/(0[0-9]|1[012])/([0-9]{4})"));

    }
}