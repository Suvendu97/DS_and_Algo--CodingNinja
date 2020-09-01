//SORT 0 1

public class SortBinaryArray{	

	public static void sortBinaryArray(int[] arr){
		/* Your class should be named SortBinaryArray.
		 * Don't write main().
     		 * Don't read input, it is passed as function argument.
     		 * Update in the given array itself. Don't return or print anything.
     		 * Taking input and printing output is handled automatically.
                 */
        int count = 0; // counts the no of zeros in arr 
      
        for (int i = 0; i < arr.length; i++) { 
            if (arr[i] == 0) 
                count++; 
        } 
  
        // loop fills the arr with 0 until count 
        for (int i = 0; i < count; i++) 
            arr[i] = 0; 
  
        // loop fills remaining arr space with 1 
        for (int i = count; i < arr.length; i++) 
            arr[i] = 1;

	}
}