//ARRANGE NUMBER


public class Solution {

	
	public static int[] arrange(int n){
		
		/* Your class should be named Solution
	 	* Don't write main().
	 	* Don't read input, it is passed as function argument.
	 	* Return output and don't print it.
		* Taking input and printing output is handled automatically.
		*/
        int arr[]=new int[n];
        int value=1;
        int value2;
        if(n%2==0)
        {
            value2=n;
        }
        else
        {
            value2=n-1;
        }
           
        
        for(int i=0;i<n;i++)
        {
            if(n%2==0)
            {
                if(i<n/2)
                {
                    arr[i]=value;
                    value=value+2;
                }
                else
                {
                    arr[i]=value2;
                    value2=value2-2;
                }
            }
            else
            {
                if(i<=n/2)
                {
                    arr[i]=value;
                    value=value+2;
                }
                else
                {
                    arr[i]=value2;
                    value2=value2-2;
                }
            }
            
            
        }
        return arr;

	}
	
}
