//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int n = Integer.parseInt(read.readLine().trim());
            String arr[] = read.readLine().trim().split(" ");

            Solution ob = new Solution();
            System.out.println(ob.longestCommonPrefix(arr, n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    String longestCommonPrefix(String arr[], int n){
        // code here
          Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        char start[] = arr[0].toCharArray();
        char end [] = arr[arr.length-1].toCharArray();
        
        for(int i=0;i<start.length;i++) {
            if(start[i] != end[i]){
                break;
            }
            sb.append(start[i]);
        }
        
        if(sb.length() != 0){
            return sb.toString();
        }
        else {
            return "-1";
        }
    }
}