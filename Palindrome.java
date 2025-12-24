/** Checks if a given string is a palindrome. */
public class Palindrome {

	public static void main(String[]args) {
    	System.out.println(isPalindrome(args[0]));
    }
	
	/** Checks if the given string is a palindrome. */
	public static boolean isPalindrome(String s) {

		boolean isPali = true;
		int x = 0;
		int length = s.length();
		if(x == s.length()){
			return isPali;
		}



		if (s.charAt(0) == s.charAt(s.length()-1)){
			return isPalindrome(s.substring(x+1,length-1));
		}


		return false;
    }

}