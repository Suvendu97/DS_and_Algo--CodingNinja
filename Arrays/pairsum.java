//PAIR SUM

public class Solution{	
	
	public static void pairSum(int[] input, int x){
		/* Your class should be named Solution 
		 * Don't write main(). 
		 * Don't read input, it is passed as function argument. 
		 * Print output and don't return it. 
		 * Taking input is handled automatically. 
		 */
        for(int i=0;i<input.length;i++)
        {
            for(int j=i+1;j<input.length;j++)
            {
                if(input[i]+input[j]==x)
                {
                    if(input[i]<input[j])
                    {
                        System.out.println(input[i]+" "+input[j]);
                    }
                    else
                    {
                        System.out.println(input[j]+" "+input[i]);
                    }
                }
            }
        }
		
	}
}