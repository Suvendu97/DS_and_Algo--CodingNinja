//FIND UNIQUE

import java.util.*;
public class Solution{	
	
	public static int findUnique(int[] arr){
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
        Arrays.sort(arr);
     
    int i=1;
    while(i<arr.length)
    {
        if(arr[i]!=arr[i+1])
        {
            return arr[i];
        }
        i=i+2;
    }
     
    return -1;
		
	}
}