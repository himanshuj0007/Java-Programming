import java.lang.*;
import java.util.Scanner;
class storeInOneByte
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        byte a;

        a=(byte)(sc.nextByte()<<4);
        a=(byte)(a|sc.nextByte());

        System.out.println((a&0b11110000)>>4);
        System.out.println(a&0b00001111);
    }
}
