//Print Keypad Combinations Code

public class solution {
    public static String getvalue(int n)
    {
       if(n<=0 || n>=10){
           String ans="";
        return ans;}
        else if(n==2)
        {
            String ans="abc";
            return ans;
        }
        else if(n==3)
        {
           String ans="def";
            return ans;
        }
        else if(n==4)
        {
           String ans="ghi";
            return ans;
        }
        else if(n==5)
        {
           String ans="jkl";
            return ans;
        }
        else if(n==6)
        {
           String ans="mno";
            return ans;
        }
        else if(n==7)
        {
           String ans="pqrs";
            return ans;
        }
        else if(n==8)
        {
           String ans="tuv";
            return ans;
        }
        else
        {
           String ans="wxyz";
            return ans;
        }
    }
    public static void callsequence(int n,String sofar)
    {
        if(n==0)
        {
            System.out.println(sofar);
            return;
        }
        String t=getvalue(n%10);
        for(int i=0; i<t.length();i++) {
			callsequence(n/10,t.charAt(i)+sofar);
        }
    }
	public static void printKeypad(int input){
             callsequence(input,"");
	}
}