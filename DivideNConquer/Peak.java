import java.util.*;
class Peak
{
    static int findPeak(int arr[],int l,int r,int n)
    {
     int mid=l+(r-l)/2;
     if((mid==0||arr[mid-1]<arr[mid])&&(mid==n-1||arr[mid+1]<arr[mid]))   
     {
         return mid;
     }
     else if(mid>0 && arr[mid-1]>arr[mid])
     {
         return findPeak(arr,l,mid-1,n);
     }
     else
        return findPeak(arr,mid+1,r,n);
    }
    public static void main(String[] args) 
    { 
        int arr[] = { 10, 20, 15, 2, 23, 90, 67}; 
        int n = arr.length; 
        System.out.println( 
            "Index of a peak point is " + findPeak(arr, 0,n-1,n)); 
    } 
}