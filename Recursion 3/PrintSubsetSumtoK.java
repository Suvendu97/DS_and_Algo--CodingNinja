//Print Subset Sum to K

public class solution {
	public static void printSubsetsSumTok(int input[], int k) {
		// Write your code here
        printSubsetsSumToK(input, k, 0, "");
        }
    public static void printSubsetsSumToK(int input[], int k , int sI, String outputSoFar)
    {
            if(sI==input.length)
            {
                if(k==0)
                {
                    System.out.println(outputSoFar.trim());
                    return;
                    }
                return;
            }
        printSubsetsSumToK(input, k - input[sI] , sI + 1,outputSoFar + " " + input[sI] );
        printSubsetsSumToK(input, k , sI + 1,outputSoFar );
}
}