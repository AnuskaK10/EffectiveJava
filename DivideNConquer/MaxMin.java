class MaxMin
{
    static class Pair 
    { 
        // to return 2 values from a function
        int min; 
        int max; 
    } 
   
    static Pair getMinMax(int arr[], int low, int high)
    {
        Pair p=new Pair();
        Pair mml=new Pair();
        Pair mmr=new Pair();
        int mid;
        if(low==high)
        {
            p.min=arr[low];
            p.max=arr[low];
            return p;
        }
        if (high == low + 1) { 
            if (arr[low] > arr[high]) 
            { 
                p.max = arr[low]; 
                p.min = arr[high]; 
            } else
             { 
                p.max = arr[high]; 
                p.min = arr[low]; 
            } 
            return p; 
        } 
        mid = (low + high) / 2; 
        mml = getMinMax(arr, low, mid); 
        mmr = getMinMax(arr, mid + 1, high); 
        
        if (mml.min < mmr.min)
         { 
            p.min = mml.min; 
        } 
         else 
        { 
            p.min = mmr.min; 
        } 
        if (mml.max > mmr.max) 
        { 
            p.max = mml.max; 
        } else
        { 
            p.max = mmr.max; 
        } 
        return p;
    }
    
    public static void main(String args[])
    {
        int arr[] = {1000, 11, 445, 1, 330, 3000}; 
        int arr_size = 6; 
        Pair minmax = getMinMax(arr, 0, arr_size - 1); 
        System.out.printf("\nMinimum element is %d", minmax.min); 
        System.out.printf("\nMaximum element is %d", minmax.max); 
    }
}