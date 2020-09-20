//Return subset of an array

public class solution {
	public static int[][] subsets(int input[]) {
		   if(input.length==0)		
           {
               int[][]arr= {{}};
			return arr;
		}
        		int[] temp=new int [input.length-1];
		for(int i=0;i < temp.length;i++)
		{
			temp[i]=input[i+1];
		}
        int smallans[][]=subsets(temp);
        int arr[][]=new int[2*smallans.length][];
	    for(int i=0;i < smallans.length;i++)
	    {
	    	int col=smallans[i].length;
            arr[i]=new int[col];
	    	for(int j=0;j < col;j++)
	    	{
	    		arr[i][j]=smallans[i][j];
	    	}
	    }
        for(int i=smallans.length;i<arr.length;i++)
        {
            int col=smallans[i-smallans.length].length+1;
          arr[i]=new int[col];
	    	for(int j=0;j < col;j++)
	    	{
	    		if(j==0)
	    		{
	    			arr[i][j]=input[0];
	    		}
	    		else
	    		{
	    			arr[i][j]=smallans[i-smallans.length][j-1];
	    		}
	    	}
	    }
	    return arr;
	}
}










