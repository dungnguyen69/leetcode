package romanToInt;

public class RomanToInt {
	public int conversion(char x) {
		switch (x) {
		case 'I':
			return 1;
		case 'V':
			return 5;
		case 'X':
			return 10;
		case 'L':
			return 50;
		case 'C':
			return 100;
		case 'D':
			return 500;
		case 'M':
			return 1000;
		}
		return -1;
	}

	public int romanToInt(String roman) { // MCMXCIV
		int output = 0;
		for (int index = 0; index < roman.length(); index++) {
			if (index == roman.length() - 1) {
				output += conversion(roman.charAt(index));
				break;
			}

			if (conversion(roman.charAt(index)) >= conversion(roman.charAt(index + 1))) {
				output += conversion(roman.charAt(index));
			} else {
				output -= conversion(roman.charAt(index));
			}
		}
		return output;
	}
}
