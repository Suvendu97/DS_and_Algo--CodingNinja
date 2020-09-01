//CHECH PERMUTATION

public class solution {

	public static boolean isPermutation(String input1, String input2) {
	    // Write your code here
        int n1=input1.length();
        int n2=input2.length();
        char[] ch1=input1.toCharArray();
        char[] ch2=input2.toCharArray();   
        int count=0;
        for(int i=0;i<n1;i++)
        {
            for(int j=0;j<n2;j++)
            {
                if(ch1[i]==ch2[j])
                {
                    count++;
                    ch2[j]=' ';
                    break;
                }
            
            }
        }
        if(count==n1)
            return true;
        else        
            return false;
            
	}
}
