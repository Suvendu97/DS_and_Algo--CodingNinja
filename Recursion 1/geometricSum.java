//geometric sum 


public class solution {
    
    public static double geometricSum(int k,int a)
    {
        if(k == 0)
            return 1;
        a = a*2;
        return (double)1/a + geometricSum(k-1, a);
}

	public static double findGeometricSum(int k){
		// Write your code here
        int a = 1;
        return geometricSum(k,a);

	}
}
