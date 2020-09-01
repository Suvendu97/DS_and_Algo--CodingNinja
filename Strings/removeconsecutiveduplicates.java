//REMOVE CONSECUTIVE DUPLICATES

import java.util.*;
public class solution {

	public static String removeConsecutiveDuplicates(String input) {
	    // Write your code here
       /* char[] ch = new char[input.length()]; 
        for (int i = 0; i < input.length(); i++) 
        { 
            ch[i] = input.charAt(i); 
        } */
        char[] ch = input.toCharArray(); 
        int n = ch.length;
        int j = 0;  
        for (int i = 1; i < n; i++)  
        { 
            if (ch[j] != ch[i]) 
            { 
                j++; 
                ch[j] = ch[i]; 
            } 
        } 
        char[] ch1 = (Arrays.copyOfRange(ch, 0, j + 1));
        String str=new String(ch1);
        return str;

	}
}
