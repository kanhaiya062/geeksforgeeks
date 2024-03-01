//{ Driver Code Starts
//Initial template for JAVA

import java.lang.*;
import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function template for JAVA

class Solution
{
    //Function to check if a string is Pangram or not.
    public static boolean checkPangram  (String s) {
        // your code here
         int size = s.length();
        if(size < 26)
        return false;
        char orig[] = s.toLowerCase().toCharArray();
        Set<Character> set = new HashSet<>();
        for (char c = 'a'; c <= 'z'; c++) {
            set.add(c);
        }
        for(char c : orig)
        {
            if(set.contains(c))
            set.remove(c);
        }
        if(set.size() > 0)
        return false;
        return true;
    }
}

//{ Driver Code Starts.

class GFG
 {
	public static void main (String[] args) throws IOException
	 {
	  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	  int t=Integer.parseInt(br.readLine());
	  while(t-->0)
	  {
	    String s=br.readLine().trim();
	    
	    System.out.println(new Solution().checkPangram (s)==true?1:0);
	  }
	  
	 }
}
// } Driver Code Ends