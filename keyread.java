import java.lang.*;
import java.util.*;

class keyread
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		float a=sc.nextFloat();
		System.out.println("Enter the second number");
		float b=sc.nextFloat();
		System.out.println("the sum of given two numbers is : "+(a+b));
		System.out.println("the sum of given two numbers is : "+(a-b));
		System.out.println("the sum of given two numbers is : "+(a*b));
		System.out.println("the sum of given two numbers is : "+(a/b));
	}
}	