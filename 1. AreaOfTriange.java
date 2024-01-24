import java.util.*;
import java.lang.Math;
public class Main
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int b = sc.nextInt();
		int l = sc.nextInt();
		float s = 0.5f*(h+b+l);
		float a = Math.sqrt(s*(s-h)*(s-b)*(s-l));
		System.out.println(a);
		
		
	}
}
