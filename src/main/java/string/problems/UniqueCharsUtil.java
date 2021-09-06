package string.problems;

public class UniqueCharsUtil {

	/*
	 * Assumption: 	1. All characters are ASCII characters
	 * 				2. Case sensitive matching
	 * 				3. Symbols may occur
	 * 
	 * */
	public static boolean hasAllUniqueCharsCaseSensitive(String input) {
		char[] charArray = input.toCharArray();

		// Facts to know: - ASCII set has 128 characters
		// 				  - [65 - 90] ==> [A - Z] and [97 - 122] ==> [a - z]
		
		boolean[] charOccurance = new boolean[128];
		
		for(char c: charArray) {
			if(charOccurance[c]) {
				return false;
			}
			charOccurance[c] = true;
		}
		
		return true;
	}
	
	/*
	 * Assumption: 	1. All characters are ASCII characters
	 * 				2. Case Insensitive matching
	 * 				3. Symbols may occur
	 * 
	 * */
	public static boolean hasAllUniqueCharsCaseInsensitive(String input) {
		char[] charArray = input.toCharArray();
		boolean[] charOccurrances = new boolean[106]; // 128-26
		
		// Facts to know: - ASCII set has 128 characters
		// 				  - [65 - 90] ==> [A - Z] and [97 - 122] ==> [a - z]
		
		for(char c : charArray) {
			
			// Treat small case characters as capital case to ignore case
			// There is gap of 32 chars between small case and upper case (i.e. 97('A') - 65('a') = 32 chars)
			
			if(c >= 97 && c <= 122) {
				c = (char) ((int) c - 32);
			}

			if(charOccurrances[c]) {
				return false;
			}
			
			charOccurrances[c] = true;

		}
		
		return true;
	}

}
