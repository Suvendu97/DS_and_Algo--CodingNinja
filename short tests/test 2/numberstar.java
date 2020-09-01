//NUMBER STAR PATTERN

import java.util.*;
public class Solution {

	public static void main(String[] args) {

		// Write your code here		
        Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=n;j++)
            {
            if(j<=i)
                System.out.print(j);
             else
                System.out.print("*");
            }
            for(int j=n;j>=1;j--)
            {
            if(j<=i)
                System.out.print(j);
            else
                System.out.print("*");
            } 
        System.out.println();
        }

	}
}
