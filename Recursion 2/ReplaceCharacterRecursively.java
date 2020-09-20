// Replace Character Recursively


public class Solution {

	public static String replaceCharacter(String input, char c1, char c2) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
		 * Taking input and printing output is handled automatically.
		 */
        int l = input.length(); 
    char []arr = input.toCharArray(); 
      
    // loop to traverse in the string 
    for (int i = 0; i < l; i++) 
    { 
      
        // check for c1 and replace 
        if (arr[i] == c1) 
            arr[i] = c2; 
              
        // check for c2 and replace 
       // else if (arr[i] == c2) 
         //   arr[i] = c1; 
    } 
      
    return String.valueOf(arr);

	}
}
