package misc;

public class Palindrome {

	public static boolean isPalindrome(String s) {
		return isPalindrome(s.toLowerCase().trim(), 0, s.trim().length() - 1);
	}
	
	private static boolean isPalindrome(String s, int n, int m) {
		return s.charAt(n) == s.charAt(m) ? n <= m ? isPalindrome(s, ++n, --m) : true : false;
	}
}
