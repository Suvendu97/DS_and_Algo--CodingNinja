// first index of number


public class Solution {

    public static int i=0,result;
    
	public static int firstIndex(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
        
        if(input[i]==x)
            result=i;
        else if(i>=input.length-1)
            result=-1;
        else
        {
            i=i+1;
            firstIndex(input, x);
        }
		return result;
	}
	
}