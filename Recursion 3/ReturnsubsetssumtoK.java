//Return subsets sum to K

public class solution {
    // Return a 2D array that contains all the subsets which sum to k
    public static int[][] subsetsSumK(int input[], int k) {
        // Write your code here
        return subsetsSumK(input, k,0);
    }
    public static int[][] subsetsSumK(int input[], int k, int si){
        if(si==input.length){
            if(k==0){
                int output[][]=new int[1][0];
                return output;
            }
            int output[][]=new int[0][0];
            return output;
        }
        int temp1[][]=subsetsSumK(input,k-input[si],si+1);
        int temp2[][]=subsetsSumK(input,k,si+1);
        int output[][]=new int[temp1.length+temp2.length][];
        for(int i=0;i<temp1.length;i++){
            output[i]= new int[temp1[i].length+1];
            output[i][0]=input[si];
            for(int j=0;j<temp1[i].length;j++){
                output[i][j+1]=temp1[i][j];
            }
        }
        for(int i=0;i<temp2.length;i++){
            output[i+temp1.length]= new int[temp2[i].length];
            for(int j=0;j<temp2[i].length;j++){
                output[i+temp1.length][j]=temp2[i][j];
            }
        }
        return output;
    }
}