//{ Driver Code Starts
import java.lang.*;
import java.io.*;
import java.util.*;
class GFG
{
	public static void main (String[] args) throws IOException
	{
	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 int tc=Integer.parseInt(br.readLine().trim());
	 
	 while(tc-- >0)
	 {
	     String line=br.readLine().trim();
	     
	     Solution obj = new Solution();
	     
	     System.out.println(obj.getMaxOccuringChar(line));
	     
	 }
	 }
}
// } Driver Code Ends



class Solution
{
    //Function to find the maximum occurring character in a string.
    public static char getMaxOccuringChar(String line)
    {
        // Your code here
        int[]   c=new int[26];
        for(int i=0;i<line.length();i++){
            c[line.charAt(i)-'a'] ++;
            
        }
        int m=c[0];
        int id=0;
        for(int i=0;i<26;i++){
            if(c[i]>m){
                m=c[i];
                id=i;
                }
        }
        return (char)(id+'a');
    }
    
}