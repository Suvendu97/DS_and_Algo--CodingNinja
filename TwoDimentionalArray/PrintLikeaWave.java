//Print Like a Wave


public class Solution {

	
	// input - input 2D array
	public static void wavePrint(int input[][]){
		
		// Write your code here
        if(input.length==0)
            return;
        int numRows=input.length;
        int numCols=input[0].length;
        
        for(int j=0;j<numCols;j++)
        {
            if(j%2==0)
                for(int i=0;i<numRows;i++)
                      System.out.print(input[i][j]+" ");
            else
                for(int i=numRows-1;i>=0;i--)
                      System.out.print(input[i][j]+" ");
        }

	}

	
}
