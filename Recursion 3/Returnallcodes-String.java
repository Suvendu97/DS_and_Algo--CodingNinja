//Return all codes - String

public class solution {

	// Return a string array that contains all possible codes
	public static  String[] getCode(String input){
		// Write your code here
        if(input.length()==0)
        {
            String arr[]={""};
            return arr;
        }
        String arr1[]=getCode(input.substring(1));
        int i1=Integer.valueOf(input.substring(0,1));
        
        String arr2[]=new String[0];
        int i2=0;
        if(input.length()>=2)
        {
            i2=Integer.valueOf(input.substring(0,2));
            if(i2>=10 && i2<=26)
            {
                arr2=getCode(input.substring(2));
            }
        }
        
        String ans[]=new String[arr1.length+arr2.length];
        int k=0;
        
        for(int i=0;i<arr1.length;i++)
        {
            ans[k]=(char)(i1+'a'-1)+arr1[i];
            k++;
        }
        for(int i=0;i<arr2.length;i++)
        {
            ans[k]=(char)(i2+'a'-1)+arr2[i];
            k++;
        }
    
		return ans;
	}

}
