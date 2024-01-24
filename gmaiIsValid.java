import java.lang.*;
import java.util.*;
class gmaiIsValid
{
     public static void main(String[] args)
     {
         Scanner sc=new Scanner(System.in);

         System.out.println("Enter the your mail address\n(address should not contain special char before @gamil.com\nexample:-> 'Ashf21@gmail.com'");
         String str= sc.nextLine();
         boolean b=str.matches("\\w*@gmail.com");
         if(b){
             System.out.println("Valid email id");
                      }
         else {
             System.out.println("Invalid email id");
         }

     }
}
