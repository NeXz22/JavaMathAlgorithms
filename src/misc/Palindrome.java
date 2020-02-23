package misc;

public class Palindrome {

	/*
	 * A palindrome is a word, number, phrase, or other sequence of characters which
	 * reads the same backward as forward, such as madam or racecar.
	 * 
	 * isPalindrome(String s) tests for palindrome NOT ignoring whitespace,
	 * punctuation etc; e.g.: "race.car" -> false
	 * 
	 * isPalindrome(String s, String ignoredChars) tests for palindrome ignoring any
	 * character that is specified in String#ignoredChars regex; e.g.: "race.car" ->
	 * true
	 * 
	 * See misc.Testing for two examples
	 */
	public static boolean isPalindrome(String s) {
		return isPalindrome(s.toLowerCase(), 0, s.length() - 1);
	}

	public static boolean isPalindrome(String s, String ignoredChars) {
		return isPalindrome(s.replaceAll(ignoredChars, "").toLowerCase(), 0,
				s.replaceAll(ignoredChars, "").length() - 1);
	}

	private static boolean isPalindrome(String s, int n, int m) {
		return s.charAt(n) == s.charAt(m) && (n > m || isPalindrome(s, ++n, --m));
	}
}
