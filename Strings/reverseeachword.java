//REVERSE EACH WORD

public class Solution {

	// Return the reversed string. No need to print
	public static String reverseEachWord(String input) {
		// Write your code here
        String words[]=input.split("\\s");  
    String reverseEachWord="";  
    for(String w:words){  
        StringBuilder sb=new StringBuilder(w);  
        sb.reverse();  
        reverseEachWord+=sb.toString()+" ";  
    }  
    return reverseEachWord.trim(); 

	}
}
