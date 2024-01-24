public class maxEle
{
     static int max(int []a)
    {
        int m=a[0];
        for (int j : a) {
            if (j > m) m = j;
        }
        return m;
    }

    public static void  main(String[] args)
    {
        int []a=new int[]{10,8,45,35,85,4};
        System.out.println(max(a));
    }
}