import java.util.Scanner;
public class tableOfAnyNo
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter the no which you want the table and no of times:");
        int n=sc.nextInt();
        int j=sc.nextInt();
        for(int i=1;i<j+1;i++)
        {
            System.out.printf("%d * %d = %d\n",n,i,n*i);
        }
    }
}
