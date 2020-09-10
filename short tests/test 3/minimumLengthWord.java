//Minimum length word


public class Solution {
    static String minWord = "", maxWord = "";
	
	public static String minLengthWord(String input){
		
		// Write your code here
        int len = input.length(); 
        int si = 0, ei = 0; 
        int min_length = len, min_start_index = 0, 
              max_length = 0, max_start_index = 0; 
  
        // Loop while input string is not empty 
        while (ei <= len)  
        { 
            if (ei < len && input.charAt(ei) != ' ') 
            { 
                ei++; 
            }  
            else
            { 
                // end of a word 
                // find curr word length 
                int curr_length = ei - si; 
  
                if (curr_length < min_length)  
                { 
                    min_length = curr_length; 
                    min_start_index = si; 
                } 
  
                if (curr_length > max_length)  
                { 
                    max_length = curr_length; 
                    max_start_index = si; 
                } 
                ei++; 
                si = ei; 
            } 
        }
         minWord = input.substring(min_start_index, min_start_index + min_length); 
        
        return minWord;

	}
}
