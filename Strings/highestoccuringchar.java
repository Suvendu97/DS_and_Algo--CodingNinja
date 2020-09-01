//HIGHEST OCCURING CHARACTER

// highest occurring character in the String.
public class solution {

    static final int N = 256;
	public static char highestOccuringCharacter(String inputString) {
		// Write your code here
        int ctr[] = new int[N];
  int l = inputString.length();
  for (int i = 0; i < l; i++)
   ctr[inputString.charAt(i)]++;
  int max = -1;
  char result = ' ';

  for (int i = 0; i < l; i++) {
   if (max < ctr[inputString.charAt(i)]) {
    max = ctr[inputString.charAt(i)];
    result = inputString.charAt(i);
   }
  }
        return result;

	}
}
