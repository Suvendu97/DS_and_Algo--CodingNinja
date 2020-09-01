//STRING PALINDROME


public class Solution {

	public static boolean checkPalindrome(String str){
		/* Your class should be named Solution
		* Don't write main().
		* Don't read input, it is passed as function argument.
		* Return output and don't print it.
		* Taking input and printing output is handled automatically.
		*/
        int n=str.length();
        int i;
        for(i=0;i<n/2;i++)
        {
            if(str.charAt(i)!=str.charAt(n-i-1))
                break;
        }
        if(i==n/2)
        {
            return true;
        }
        else
        {
            return false;
        }

	}
}
