//LINEAR SEARCH

public class LinearSearch{	
	
	public static int linearSearch(int[] arr, int num){
		/* Your class should be named LinearSearch
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
    
            for(int i=0;i<arr.length;i++)
            
                if(num==arr[i])
                    return i;
            return -1;
    	
	}
}