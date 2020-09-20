//chech number in array

public class Solution {
    
	public static int i=0;
    public static boolean b;
	public static boolean checkNumber(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
        
        if(input[i]==x)
            b=true;
        else if(i>=input.length-1)
            b= false;
                
        else
        {
            i=i+1;
            checkNumber(input, x);
        }
            
       return b;
		
	}
}