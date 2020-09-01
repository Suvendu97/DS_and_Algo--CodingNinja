//REMOVE CHARACTER

public class solution {

	/* public static String removeAllOccurrencesOfChar(String input, char c) {
	    // Write your code here
        int j, count = 0, n = input.length(); 
    char[] t = input.toCharArray(); 
    for (int i = j = 0; i < n; i++) 
    { 
        if (t[i] != c) 
        t[j++] = t[i]; 
        else
            count++; 
    }  
    while(count > 0) 
    { 
        t[j++] = '\0'; 
        count--; 
    } 
    
        String str=new String(t);
        return str;

	}

} */

public static String removeAllOccurrencesOfChar(String input, char c) {
	  
        
    
        String str="";
        
        for(int i=0; i<input.length();i++){
            
            if(input.charAt(i)!=c){
                str=str+input.charAt(i);
                
            }
        }
        return str;
}
}