//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		while(t-->0)
		{
		    String s=sc.nextLine();
		    
		    System.out.println(printNumber(s,s.length()));
		}
		
	}

// } Driver Code Ends
//User function Template for Java


//Function to find matching decimal representation of a string as on the keypad.
public static String printNumber(String s, int n) 
{
    //Your code here
     HashMap<Character, Integer> keypadMapping = new HashMap<>();
        char currentChar = 'a';
        for (int i = 2; i <= 9; i++) {
            int count = (i == 7 || i == 9) ? 4 : 3; 
            for (int j = 0; j < count; j++) {
                keypadMapping.put(currentChar++, i);
            }
        }

        StringBuilder decimalRepresentation = new StringBuilder();


        for (char ch :s.toCharArray()) {
            
            ch = Character.toLowerCase(ch);
        
            if (keypadMapping.containsKey(ch)) { 
                
                decimalRepresentation.append(keypadMapping.get(ch));
            }
        }

        return decimalRepresentation.toString();
    

}

//{ Driver Code Starts.

}

// } Driver Code Ends