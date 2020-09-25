import java.io.*;
import java.util.*;
class Occurence
{
    static void sort(int arr[])
    {
        int n=arr.length;
        for(int i=1;i<n;i++)
        {
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key)
            {
                //move elements greater than key to one space ahead to make space for key
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }
    public static int first(int arr[], int low, int high, int x, int n) 
    { 
        if (high >= low) { 
            int mid = low + (high - low) / 2; 
            if ((mid == 0 || x > arr[mid - 1]) && arr[mid] == x) 
                return mid; 
            else if (x > arr[mid]) 
                return first(arr, (mid + 1), high, x, n); 
            else
                return first(arr, low, (mid - 1), x, n); 
        } 
        return -1; 
    } 
    public static int last(int arr[],int low,int high,int x,int n)
    {
        if(high>=low)
        {
            int mid=low+(high-low)/2;
            if((mid==n-1||x<arr[mid+1])&&(arr[mid]==x))
            {
                return mid;
            }
            else if(arr[mid]>x)
            {
                return last(arr,low,mid-1,x,n);
            }
            else
            {
                return last(arr,mid+1,high,x,n);
            }
            
        }
        return -1;
    }
    public static void main(String args[])
    {
            try 
            {
                /*FileReader fr=new FileReader("input.txt");
                int ch;
                int arr[]=new int[100];
                int i=0;
                int d=0;int num;
                while((ch=fr.read())!=-1)
                {
                    num=0;
                    while((char)ch!=',')
                    {
                        d=Character.getNumericValue((char)ch);
                        num=(num*10)+d;
                        ch=fr.read();
                        
                    }
                    arr[i]=num;
                    i++;
                }
                if(ch==-1)
                {
                    fr.close();*/
                    int arr[]={1,1,2,3,4,5,6,7,8,9,9,9,9,9,9,9,10,11,20,23,23,23,23,67,67,67,67,89,101,105,106,106,106,106,106,203,245,245,245,367,8,8,8,8,34,34,52,1067,2345,435,567,567,890,780,657,123};
                    Scanner sc=new Scanner(System.in);
                    int i=arr.length;
                    sort(arr);
                    int x=sc.nextInt();
                    System.out.println("First Occurrence = " + first(arr, 0, i - 1, x, i)); 
                    System.out.println("Last Occurrence = " + last(arr, 0, i - 1, x, i)); 
                //}
            }
             catch (Exception e) 
            {
                System.out.println("Exception encountered");
            }
    }
}