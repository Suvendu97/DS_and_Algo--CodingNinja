//Maximise the sum

public class Solution {

	public static long maximumSumPath(int[] input1, int[] input2) {
		/* Your class should be named Solution
		* Don't write main().
		* Don't read input, they are passed as function arguments.
		* Return output and don't print it.
		* Taking input and printing output is handled automatically.
		*/
        int i = 0;
    int j = 0;
    int max;
    int sum1 = 0;
    int sum2 = 0;
    long result = 0;
    int m = input1.length;
    int n = input2.length;
 
    // This part is very similar to merge sort
    while (i < m && j < n)
    {
        if (input1[i] < input2[j])
            sum1 += input1[i++];
 
        else if (input1[i] > input2[j])
            sum2 += input2[j++];
 
        else  // Found a common point
        {
            if(sum1>sum2)
            {
                max=sum1;
            }
            else
                max=sum2;
            result += max;
            sum1 = 0;
            sum2 = 0;
 
            while (i < m &&  j < n && input1[i] == input2[j])
            {
                result = result + input1[i];
                i++;
                j++;
            }
        }
    }
 
    // The loop ends when one of the array reached its end.
    // That means we still have to choose the array whose elements will end the
    // maximum-sum-path (since last pair of equals)
    while (i < m)
        sum1  +=  input1[i++];
    while (j < n)
        sum2 +=  input2[j++];
 
    if(sum1>sum2)
    {
        max=sum1;
    }
    else
        max=sum2;
    result +=  max;
 
    return result;
		
	}
}