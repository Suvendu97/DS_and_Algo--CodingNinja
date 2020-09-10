//Find The leader of a Array

public class Solution {

	public static void leaders(int[] input) {
		/* Your class should be named Solution 
		 * Don't write main(). 
		 * Don't read input, it is passed as function argument. 
		 * Print output and don't return it. 
		 * Taking input is handled automatically. 
		 */
        
        int size=input.length;
        
         int max_from_right =  input[size-1]; 
   
        /* Rightmost element is always leader */
        System.out.print(max_from_right + " "); 
       
        for (int i = size-2; i >= 0; i--) 
        { 
            if (max_from_right <= input[i]) 
            {            
            max_from_right = input[i]; 
            System.out.print(max_from_right + " "); 
            } 
        }  
        
		
	}
	
}