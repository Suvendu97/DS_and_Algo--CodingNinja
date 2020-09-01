//NUMBER STAR PATTERN

import java.util.*;
public class runner {

	public static void main(String[] args) {
		// Write your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            int k=n;
            for(int j=1;j<=n;j++)
            {
                if(j!=n-i+1)
                {
                    System.out.print(k);
                }
                else
                {
                    System.out.print("*");
                }
                k=k-1;
            }
            System.out.println();
        }

	}
}
