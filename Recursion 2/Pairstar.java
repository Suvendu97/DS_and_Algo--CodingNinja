//Pair star


public class solution {

    static String output=""; 
  
// Function to insert * at desired position 
static void pairStar(String input, 
            int i) 
{ 
    // Append current character 
    output = output + input.charAt(i); 
  
    // If we reached last character 
    if (i == input.length() - 1) 
        return; 
  
    // If next character is same,  
    // append '*' 
    if (input.charAt(i) == input.charAt(i+1))  
        output = output + '*';      
  
    pairStar(input, i+1); 
}
	// Return the updated string
	public static String addStars(String s) {
		// Write your code here
        pairStar(s,0);
        return output;

	}
}
