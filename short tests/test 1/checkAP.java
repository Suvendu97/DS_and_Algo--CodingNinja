//CHECH AP

import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] ar=new int[n];
        boolean flag=true;
        for(int i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
        }
        if(n<=2)
            {
                System.out.print("true");
            }
        else
        {
            
            int diff=ar[1]-ar[0];
            for(int i=0;i<n-1;i++)
            {
            
                if((ar[i+1]-ar[i])!=diff)
                 {
                     flag=false;
                     break;
                  }    
             }
             if(flag==true)
             {
                 System.out.print("true");
             }
             else{
                 System.out.print("false");
             }
        }

	}
}
