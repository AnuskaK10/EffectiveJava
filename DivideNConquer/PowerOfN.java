import java.util.*;
class PowerOfN
{
    int powpow(int x,int y)
    {
        if(y==0)
        {
            return 1;
        }
        else if(y%2==0)
        {
            return powpow(x,y/2)*powpow(x,y/2);
        }
        else
        {
            return x*powpow(x,y/2)*powpow(x,y/2);
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        PowerOfN p=new PowerOfN();
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println("Power of n="+p.powpow(x,y));
    }
}