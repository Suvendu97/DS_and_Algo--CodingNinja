//Remove X


public class solution {

    public static String deathToX(String str, String newStr) {  
    //look for x char
    if(str.substring(0, 1).equals("x")) {
        //do nothing
    } else {
        //add non-x char to newStr
        newStr += str.charAt(0);
    }

    if(str.length() == 1) {
        return newStr;
    }

    return deathToX(str.substring(1), newStr);
}
	// Return the changed string
	public static String removeX(String input){
		// Write your code here
        return deathToX(input, "");

	}
}
