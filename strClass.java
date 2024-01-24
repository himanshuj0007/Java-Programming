public class strClass
{
    public static void main(String[] args)
    {
        String s1="java";
        String s2="    java   ";

        char[] cH ={'J','A','I',' ','S','H','R','E','E',' ','R','A','M'};
        String s3=new String(cH);

        byte[] b ={65,66,68,69,70,75};
        String s4=new String (b);

        s4=s4.toLowerCase();
        int l=s1.length();

        s2=s2.trim();
       // s3=s2.substring(1,3);



        System.out.println(s3.startsWith("JAI"));


    }
}
