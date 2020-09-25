import java.io.*;
class Hoare
{
    static int partition(int arr[],int lo,int hi)
    {
        int pivot = arr[lo];
        int i=lo-1,j=hi+1;
        while(true)
        {
            do
            {
                i++;
            }while(arr[i]<pivot);
            
            do{
                j--;
            }while(arr[j]>pivot);
            
            if (i >= j) 
            return j; 
            int temp = arr[i]; 
            arr[i] = arr[j]; 
            arr[j] = temp;
        }
    }
    static void quicksort(int []arr, int low,  
                                 int high) 
    { 
        if (low < high) 
        { 
            int pi = partition(arr, low, high); 
            quicksort(arr, low, pi); 
            quicksort(arr, pi + 1, high); 
        } 
    } 
    public static void main(String[] args)throws Exception
    { 
        String arr[] = new String[100]; 
        File f=new File("num.txt");
        BufferedReader br = new BufferedReader(new FileReader(f));
        String st; 
        String s2="";
        int num[]=new int[100];
        while ((st = br.readLine()) != null) 
           {
               s2=s2.concat(st);
           }
        String words[]=s2.split(",");
        int n=words.length;
        for(int i1=0;i1<n;i1++)
        {
            num[i1]=Integer.parseInt(words[i1]);
        }
        quicksort(num,0,n-1);
        System.out.println("Sorted array");
        for(int j1=0;j1<n;j1++)
        {
            System.out.print(num[j1]+",");
        }    
        
    }
}