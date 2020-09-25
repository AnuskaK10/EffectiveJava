//Considering the index is the x coordinate
import java.io.*;
class Closest
{
    static int calcdist(int arr[],int l,int r)
    {
        int min = 9999;  
        int dist=0;
        for (int i = l; i < r; ++i)  
            for (int j = i+1; j < r; ++j)  
            dist=(int)Math.sqrt(((j-i)*(j-i))+((arr[i]-arr[j])*(arr[i]-arr[j])));
            if (dist < min)  
                min = dist;  
        return min;  
    }
    static int closest(int arr[])
    {
        int l=0;
        int r=arr.length;
        int mid=(l+r)/2;
        int dl=calcdist(arr,0,mid+1);
        int dr=calcdist(arr,mid+1,r);
        int d3=0;//for calculating distance of split array containing 7 mid points
        if(r>=7)
        {
            d3=calcdist(arr,mid-2,mid+5);
        }
        int d=Math.min(dl,dr);
        int val=Math.min(d,d3);
        return val;
    }
    public static void main(String args[])
    {
     
     int arr[]={13,15,12,7,14,16,1,10,17,9,2,11,23,18,24,5,0,6};
     int c=closest(arr);
     System.out.println("Distance between closest pair of points="+c);
    }
}