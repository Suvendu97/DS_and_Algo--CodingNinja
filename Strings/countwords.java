//COUNT WORDS


public class Solution {

	public static int countWords(String str){
	
		/* Your class should be named Solution
	 	* Don't write main().
	 	* Don't read input, it is passed as function argument.
	 	* Return output and don't print it.
	 	* Taking input and printing output is handled automatically.
		*/
         int count=0;  
      
            char ch[]= new char[str.length()];     
            for(int i=0;i<str.length();i++)  
            {  
                ch[i]= str.charAt(i);  
                if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )  
                    count++;  
            }  
            return count;  

	}
	

}
