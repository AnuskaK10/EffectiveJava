import java.io.*;

class Pair {
	private int x;
	private int y;

	Pair(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() { return x; }
	public int getY() { return y; }
}

class Dutch
{
    public static void swap (int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	// Partition routine using Dutch National Flag Algorithm
	public static Pair Partition(int[] arr, int start, int end)
	{
		int mid = start;
		int pivot = arr[end];

		while (mid <= end) {
			if (arr[mid] < pivot) {
				swap(arr, start, mid);
				++start;
				++mid;
			}
			else if (arr[mid] > pivot) {
				swap(arr, mid, end);
				--end;
			}
			else {
				++mid;
			}
		}

		// arr[start .. mid - 1] contains all occurrences of pivot
		return new Pair(start - 1, mid);
	}

	// Three-way Quicksort routine
	public static void quicksort(int[] arr, int start, int end)
	{
		// base condition for 0 or 1 elements
		if (start >= end) {
			return;
		}

		// handle 2 elements separately as Dutch national flag
		// algorithm will work for 3 or more elements
		if (start - end == 1)
		{
			if (arr[start] < arr[end]) {
				swap(arr, start, end);
			}
			return;
		}

		// rearrange the elements across pivot using Dutch
		// national flag problem algorithm
		Pair pivot = Partition(arr, start, end);

		// recur on sub-array containing elements that are less than pivot
		quicksort(arr, start, pivot.getX());

		// recur on sub-array containing elements that are more than pivot
		quicksort(arr, pivot.getY(), end);
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
    