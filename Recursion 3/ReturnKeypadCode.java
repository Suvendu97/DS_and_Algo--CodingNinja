//Return Keypad Code

public class solution {

	static String[] singleDigit(int n)
	{
		if(n<=1 || n>10)
		{
			String[] output ={}; 
            return output;
		}
		if(n==2)
		{
			String output[] = {"a","b","c"};
			return output;
		}
		else if(n==3)
		{
			String output[] = {"d","e","f"};
			return output;
		}
		else if(n==4)
		{
			String output[] = {"g","h","i"};
			return output;
		}
		else if(n==5)
		{
			String output[] = {"j","k","l"};
			return output;
		}
		else if(n==6)
		{
			String output[] = {"m","n","o"};
			return output;
		}
		else if(n==7)
		{
			String output[] = {"p","q","r","s"};
			return output;
		}
		else if(n==8)
		{
			String output[] = {"t","u","v"};
			return output;
		}
		else
		{
			String output[] = {"w","x","y","z"};
			return output;
		}
	}
	public static String[] keypad(int n){
		if(n==0)
		{
			String output[] = {""};
			return output;
		}
		String smallNuArray[] = keypad(n/10);
		String sindleDigitOutput[] = singleDigit(n%10);
		String output[] = new String[smallNuArray.length*sindleDigitOutput.length];
		int k=0;
		for(int a=0;a<sindleDigitOutput.length;a++)
		{
			for(int i=0;i<smallNuArray.length;i++)
			{
				output[k] = smallNuArray[i]+sindleDigitOutput[a];
                k++;
			}
            
		}
		return output;
	}
}
	
