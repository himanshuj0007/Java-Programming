import java.util.Scanner;

public class swotchTypeOfWeb
{
        public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            String str=sc.nextLine();
            boolean b=str.startsWith("https://");
            int val = (b) ? 1 : 0;

            switch(val)
            {
                case 1: System.out.println("secured");
                    break;
                case 0: System.out.println("not secured");
                    break;
                default:

            }

        }

    private static int intValue(boolean b) {
        return 0;
    }
}

