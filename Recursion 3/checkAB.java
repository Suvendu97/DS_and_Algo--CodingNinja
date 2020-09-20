//check AB

public class Solution {

	public static boolean checkAB(String input) {
		// Write your code here
        if (input == null || input.isEmpty()) return false;

  // So long as the string continues to match the pattern, keep stripping
  // characters from it until it is empty. If you reach empty, it matches the pattern.
  while (! input.isEmpty()) {
    // If the first character isn't 'a', we don't match; return false.
    if (input.charAt(0) != 'a') {
      return false;
    }

    // Check for abb, if so strip all of that, otherwise strip just the a
    if (input.length() >= 3 && "abb".equals(input.substring(0,3))) {
      input = input.substring(3);
    } else {
      input= input.substring(1);
    }
  }
  // Reached empty string, return true.
  return true;

	}
}
