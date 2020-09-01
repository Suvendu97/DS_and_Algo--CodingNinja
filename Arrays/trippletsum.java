//TRIPLET SUM

public class Solution{	
    
	public static void tripletSum(int[] input, int x){
        
        for(int i=0;i<input.length-2;i++){
            for(int j=i+1;j<input.length-1;j++){
                for(int k=j+1;k<input.length;k++){
                    
                    if(input[i]+input[j]+input[k]==x){
                        
                        /*if(input[i]<input[j] && input[i]<input[k] && input[j]<input[k])
                            System.out.println(input[i]+" "+input[j]+" "+input[k]);
                        
                        else if(input[i]<input[j] && input[i]<input[k] && input[j]>input[k])
                            System.out.println(input[i]+" "+input[k]+" "+input[j]);
                        
                        else if(input[j]<input[i] && input[j]<input[k] && input[i]<input[k])
                            System.out.println(input[j]+" "+input[i]+" "+input[k]);
                        
                        else if(input[j]<input[i] && input[j]<input[k] && input[i]>input[k])
                            System.out.println(input[j]+" "+input[k]+" "+input[i]);
                        
                        else if(input[k]<input[i] && input[k]<input[j] && input[i]<input[j])
                            System.out.println(input[k]+" "+input[i]+" "+input[j]);
                        
                        else if(input[k]<input[i] && input[k]<input[j] && input[i]>input[j])
                            System.out.println(input[k]+" "+input[j]+" "+input[i]);
                        */
                         if(input[i]<=input[j] && input[i]<=input[k])
                    {
                        System.out.print(input[i]+" ");
                        if(input[j]<input[k] )
                            System.out.print(input[j]+" "+input[k]);
                        else
                            System.out.print(input[k]+" "+input[j]);
                    }
                    else if(input[j]<=input[i] && input[j]<=input[k])
                    {
                        System.out.print(input[j]+" ");
                        if(input[i]<input[k] )
                            System.out.print(input[i]+" "+input[k]);
                        else
                            System.out.print(input[k]+" "+input[i]);
                    } 
                    else
                    {
                        System.out.print(input[k]+" ");
                        if(input[i]<input[j] )
                            System.out.print(input[i]+" "+input[j]);
                        else
                            System.out.print(input[j]+" "+input[i]); 
                    }
                    System.out.println(); 
                          
                    }
                }
                
            }
        }		
		
	}
}
