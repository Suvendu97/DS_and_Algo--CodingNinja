//sum of Array

public class Solution {

    public static int i=-1,sum1=0;;
	public static int sum(int input[]) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
        if (i>=input.length-1) 
            return 0; 
        i=i+1;
        sum1+=input[i];
        sum(input); // + input[i]); 
		return sum1;
	}
}