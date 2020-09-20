//Print Subsets of Array

public class solution {
	public static void printSubsets(int input[]) {
		// Write your code here
 int output[]= new int[0];
        printSubsetsHelper(input,0,output);
    }
    public static void printSubsetsHelper(int input[],int startIndex,int output[]){
        if(startIndex == input.length){
            for(int i : output){
                System.out.print(i+" ");
            }
            System.out.println();
            return;
        }
        int newOutput[] = new int[output.length+1];
        int i=0;
        for(;i<output.length;i++){
            newOutput[i] =output[i];
        }
        newOutput[i] = input[startIndex];
        printSubsetsHelper(input,startIndex+1,output);
            printSubsetsHelper(input,startIndex+1,newOutput);
    }
}