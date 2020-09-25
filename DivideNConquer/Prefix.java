import java.io.*;
class Prefix
{
    static String commonPrefix2(String s1,String s2)
    {
        String res="";
        int n1=s1.length();
        int n2=s2.length();
        for(int i=0,j=0;i<=n1-1 && j<=n2-1;i++,j++)
        {
            if(s1.charAt(i)!=s2.charAt(j))
            {
                break;
            }
            res=res+s1.charAt(i);
        }
        return res;
    }
    static String commonPrefix(String arr[],int low,int high)
    {
        if(low==high)
        {
            return arr[low];
        }
        if(high>low)
        {
            int mid=low+(high-low)/2;
            String str1=commonPrefix(arr,low,mid);
            String str2=commonPrefix(arr,mid+1,high);
            return commonPrefix2(str1,str2);
        }
        return null;
    }
    public static void main(String[] args)throws Exception{ 
        String arr[] = new String[100]; 
        File f=new File("input.txt");
        BufferedReader br = new BufferedReader(new FileReader(f));
        String st; 
        String s2="";
        while ((st = br.readLine()) != null) 
           {
               s2=s2.concat(st);
           }
        String words[]=s2.split(" ");
        int n=words.length;
        String ans = commonPrefix(words, 0, n - 1); 
  
        if (ans.length() != 0) { 
            System.out.println("The longest common prefix is "
                    + ans); 
        } else { 
            System.out.println("There is no common prefix"); 
        } 
    } 
}