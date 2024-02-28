//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0)
        {
            String input[];
            input = br.readLine().trim().split(" ");
            int n = Integer.parseInt(input[0]);
            int k = Integer.parseInt(input[1]);
            Solution ob = new Solution();
            
            System.out.println(ob.replaceBit(n,k));    
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    int replaceBit(int N, int K){
         String b= Integer.toBinaryString(N);

        if(b.length()<=K-1) 
          return N;

        StringBuffer sb = new StringBuffer(b);

        sb.setCharAt(K-1,'0');

        int decimal = Integer.parseInt(String.valueOf(sb),2);

        return decimal;
    }
}