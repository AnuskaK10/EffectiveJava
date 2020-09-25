import java.util.*;
class SRoot
{
    static int root(int x)
    {
        if(x<=1)
        {
            return x;
        }
        else
        {
            int start=0,end=x,ans=0;
            while(end>=start)
            {
                int mid=start+(end-start)/2;
                if(mid*mid==x)
                {
                    return mid;
                }
                else if(mid*mid<x)
                {
                    start=mid+1;
                    ans=mid;
                }
                else
                {
                    end=mid-1;
                }
            }
            return ans;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int r=root(x);
        System.out.println(r);
    }
}