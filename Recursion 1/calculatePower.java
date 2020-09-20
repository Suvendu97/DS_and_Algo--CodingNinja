// Calculate Power

public class Solution {

	public static int power(int x, int n) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
		 * Taking input and printing output is handled automatically.
		 */
        if(n==0)
            return 1;
        else if(x==0)
            return 0;
        else if(n==1)
            return x;
        else
        {
            int result=x*power(x,n-1);
            return result;
        }
            
        /* int result=1;
        for(int i=n;i>=1;i--)
            result=x*power(x,n-i);
		return result; */
	}
}