//Return Permutations - String

public class solution {
	public static String[] permutationOfString(String input){
		if(input.length()==0)
        {
            String[] ans={""};
            return ans;
        }
        String smallans[]=permutationOfString(input.substring(1));
        String ans[]=new String[input.length()*smallans.length];
        int k=0;
        for(int i=0;i<smallans.length;i++)
        {
            String current=smallans[i];
            for(int j=0;j<=current.length();j++)
            {
                String newstr=current.substring(0,j)+input.charAt(0)+current.substring(j);
                ans[k]=newstr;
                k++;
            }
        }
		return ans;
	}
}