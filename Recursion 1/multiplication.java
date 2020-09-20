// multiplication


public class Solution {
    
    private static int[] helper(int input[],int x,int index){
        
        //Base Case (if the array is empty)
        if(index==input.length){
            return new int[0];
        }
        
        //We will call recursion and tell recursion to find all the index and give it in smallAns
        int smallAns[] = helper(input,x,index+1);
        
        //Now we have to do our work
        //If the index we are on is equal to x
        //Then we will update the array
        if(input[index]==x){
            int ans[] = new int[smallAns.length+1];
            ans[0] = index;
            for(int i =0;i<smallAns.length;i++){
                ans[i+1] = smallAns[i];
            }
            return ans;
        }
        return smallAns;
        
    }
    
	public static int[] allIndexes(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
        
        //First we need to call a helper function so that we can track the index
        
        return helper(input,x,0);
	}
	
}