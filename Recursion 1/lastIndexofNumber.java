//last index of number


public class Solution {

    public static int i,j=1,result;
	public static int lastIndex(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
        i=input.length;
        if(input[i-j]==x)
            result=i-j;
        else if(i-j<=0)
            result=-1;
        else
        {
            j=j+1;
            lastIndex(input,x);
                
        }
            
        return result;
            
        
	}
	
}