//REVERSE STRING WORDWISE

public class Solution {
	public static String reverseWordWise(String input) {
		// Write your code here
        String s[] = input.split(" "); 
        String ans = ""; 
        for (int i = s.length - 1; i >= 0; i--) { 
            ans += s[i] + " "; 
        }  
        String reversedString=(ans.substring(0, ans.length() - 1)); 
        return reversedString;
     

	}
}
