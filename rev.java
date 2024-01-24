class rev
{
    static void print(int []a)
    {
        for(int x:a)
            System.out.print(x+" ");
        System.out.println();
    }

    static int[] r(int []a)
    {
        byte l= (byte) a.length;
        int []b=new int[l];
        for(int i=l-1,j=0;i>=0; i--,j++)
        {
            b[j]=a[i];
        }
        return b;
    }
    public static void main(String[] args)
    {
        int []a=new int[]{14,65,33,8,5,2,46};
        print(a);
        print(r(a));


    }
}