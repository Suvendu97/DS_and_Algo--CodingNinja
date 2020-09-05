//Row Wise Sum

import java.util.*;
public class Solution {

	public static void main(String[] args) {
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        int[][] arr=new int[rows][cols];
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        
        for(int i=0;i<rows;i++)
        {
            int sum=0;
            for(int j=0;j<cols;j++)
            {
                sum=sum+arr[i][j];
            }
            System.out.print(sum+" ");
        }

	}
}
