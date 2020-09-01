//COMPRESS THE STRING

import java.util.*;
public class Solution {

	public static String compress(String inputString) {
		// Write your code here
        int n = inputString.length(); 
        String s="";
        for (int i = 0; i < n; i++)
        { 
            int count = 1; 
            while (i < n - 1 && inputString.charAt(i) == inputString.charAt(i + 1)) 
            { 
                count++; 
                i++; 
            } 
            
           s+=inputString.charAt(i);
            if(count>1)
            {
                s+=count;
            }
           
        }
        return s;

	}

}
