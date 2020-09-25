import java.util.*;
class Histo
{
    static int area(int arr[])
    {
        int maxarea=0,minht=0;
        for(int i=0;i<arr.length;i++)
        {
            maxarea=Math.max(arr[i],maxarea);
            minht=arr[i];
            for(int j=i-1;j>=0;j--)
            {
                minht=Math.min(arr[j],minht);
                int width=(j-i+1);
                maxarea=Math.max(maxarea,(minht*width));
            }
        }
        return maxarea;
    }
    public static void main(String args[])
    {
        int arr[]={1,2,3,3,4,5,6,5,4};
        int a=area(arr);
        System.out.println("Area"+a);
        
    }
}