import java.io.*;
import java.util.*;
class NumeroUno
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
                    int arr[]={0,1,1,1,0,1,0,0,1,0,0,1,0,1};
                    Scanner sc=new Scanner(System.in);
                    int i=arr.length;
                    sort(arr);
                    int x=1;
                    int f=first(arr, 0, i - 1, x, i); 
                    int l=last(arr, 0, i - 1, x, i); 
                    int c=0;
                    for(int j=f;j<=l;j++)
                    {
                        if(arr[j]==x)
                        {
                            c++;
                        }
                    }
                    System.out.println("Number of occurences= "+c);
                //}
            }
             catch (Exception e) 
            {
                System.out.println("Exception encountered");
            }
    }
}