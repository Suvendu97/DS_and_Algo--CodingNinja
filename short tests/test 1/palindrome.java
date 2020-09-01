//PALINDROME OF A NUMBER

import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
         int r,sum=0,temp;
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();    
    temp=n;    
  while(n>0){    
   r=n%10;  //getting remainder  
   sum=(sum*10)+r;    
   n=n/10;    
  }    
  if(temp==sum)    
   System.out.println("true");    
  else    
   System.out.println("false");  

	}
}
