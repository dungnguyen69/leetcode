package validParentheses;

import java.util.*;

public class ValidParentheses {

	public static boolean isValid(String s) {
		Stack<Character> stack = new Stack<Character>();

		for (char parentheses : s.toCharArray()) {
			if (parentheses == '{' || parentheses == '[' || parentheses == '(')
				stack.push(parentheses);
			else {
				if (stack.isEmpty())
					return false;
				char dataString = stack.peek();
				boolean isValid = (dataString == '{' && parentheses == '}') || (dataString == '[' && parentheses == ']')
						|| (dataString == '(' && parentheses == ')');
				if (isValid)
					stack.pop();
				else
					return false;
			}
		}
		return stack.empty();
	}
}
