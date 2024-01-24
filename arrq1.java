public class arrq1
{
    public static void main(String[] args)
    {
        int [] arr=new int []{34,665,1,8,452,7,3,0,6,5,999,34,643};
        int max=0,maxx=0;
        for(int i=0; i<arr.length;i++)
        {
            int temp=0;
            arr[i-1]=temp;
            temp=arr[i];

        }
        System.out.println("max"+maxx+"\nlast max"+max);
    }
}
