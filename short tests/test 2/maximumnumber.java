//MAXIMUM NUMBER

public class Solution {
    
    public static int max_number(int n){
        
        int maxnum=0;
        int i=1;
        while(n/i>0)
        {
            int newmaxnum=(n/(i*10))*i+n%i;
            i=i*10;
            if(maxnum<newmaxnum)
                maxnum=newmaxnum;
        }
        return maxnum;
        

    }
    

}
