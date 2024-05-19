//{ Driver Code Starts
import java.io.*;
import java.util.*;


class IntArray
{
    public static int[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s[i]);

        return a;
    }

    public static void print(int[] a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<Integer> a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int n;
            n = Integer.parseInt(br.readLine());
            
            
            int k;
            k = Integer.parseInt(br.readLine());
            
            
            int[] arr = IntArray.input(br, n);
            
            Solution obj = new Solution();
            int res = obj.findClosest(n, k, arr);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends



class Solution {
    public static int findClosest(int n, int k, int[] arr) {
        // code here
           int low = 0, high = n - 1;
        int mid = 0;
        
        while (low < high) {
            mid = low + (high - low) / 2;
            if (arr[mid] < k) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        if (low == 0) {
            return arr[0];
        }
        if (low == n) {
            return arr[n - 1];
        }
        
        // Find the closest between arr[low-1] and arr[low]
        int closestValue = arr[low];
        if (Math.abs(arr[low - 1] - k) <= Math.abs(arr[low] - k)) {
            closestValue = arr[low - 1];
        }
        
        // If differences are the same, we need to return the greater one
        if (Math.abs(arr[low - 1] - k) == Math.abs(arr[low] - k)) {
            closestValue = Math.max(arr[low - 1], arr[low]);
        }
        
        return closestValue;
       
    }
}
        
