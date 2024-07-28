//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            List<Integer> arr = new ArrayList<>();
            String input = sc.nextLine();
            Scanner ss = new Scanner(input);
            while (ss.hasNextInt()) {
                arr.add(ss.nextInt());
            }
            Solution ob = new Solution();
            int ans = ob.print2largest(arr);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int print2largest(List<Integer> arr) {
        // Code Here
        if (arr == null || arr.size() < 2) {
            return -1; // Return -1 if there are fewer than 2 elements
        }
        
        int lar = Integer.MIN_VALUE;
        int sec = Integer.MIN_VALUE;
        
        for (int i = 0; i < arr.size(); i++) {
            int num = arr.get(i);
            if (num > lar) {
                sec = lar;
                lar = num;
            } else if (num > sec && num < lar) {
                sec = num;
            }
        }
        
        if (sec == Integer.MIN_VALUE) {
            return -1; // Return -1 if there is no second largest element
        }
        
        return sec;
    
    }
}