package palindromeNumber;

public class PalindromeNumber {
	public boolean isPalindrome(int x) {
		if (x < 0)
			return false;

		String[] digits = String.valueOf(x).split("");
		int numberLength = digits.length;

		for (int digit = 0; digit < numberLength; digit++) {
			if (!digits[digit].equalsIgnoreCase(digits[numberLength - 1 - digit]))
				return false;
		}

		return true;
	}
}
