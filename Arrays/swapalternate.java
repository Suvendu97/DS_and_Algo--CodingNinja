//SWAP ALTERNATE


public class Solution {

	
	public static void swapAlternate(int[] input){
		
		/* Your class should be named Solution.
	 	* Don't write main().
	 	* Don't read input, it is passed as function argument.
		* Taking input and printing output is handled automatically.
		*/
        for(int i=0;i<input.length-1;i=i+2)
        {
            int temp=input[i];
            input[i]=input[i+1];
            input[i+1]=temp;
        }
        

	}
	
}
