package palindromeNumber;

public class PalindromeNumberWithoutString {
	public boolean isPalindrome(int original) {
		int reverseNumber = 0;
		int tempNumber = original; // 987

		while (tempNumber > 0) {
			int lastDigit = tempNumber % 10; // 987%10 = 7
			reverseNumber = reverseNumber * 10 + lastDigit; // 0*10 + 7
			tempNumber = tempNumber / 10; // 987/10 = 98
		}

		if (original == reverseNumber)
			return true;
		return false;
	}
}
