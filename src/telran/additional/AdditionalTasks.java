package telran.additional;

import java.util.Arrays;

public class AdditionalTasks {
	public static boolean isAnagram(String sourceWord, String targetWord) {
		if(sourceWord.length() != targetWord.length()) {
			return false;
		}
		int [] helper = new int [26];
		sourceWord = sourceWord.toLowerCase();
		targetWord = targetWord.toLowerCase();
		boolean res = true;
		for (int i = 0; i < sourceWord.length(); i++) {
				if(sourceWord.charAt(i) < 'a' ||sourceWord.charAt(i) > 'z' && 
						targetWord.charAt(i) < 'a' || targetWord.charAt(i) > 'z') 
				{
					return false;
				}
				helper[sourceWord.charAt(i) - 'a'] ++;
				helper[targetWord.charAt(i) - 'a'] --;
		}
		for(int i = 0; i < helper.length; i++) {
			if(helper[i] != 0) {
				return false;
			}
		}
		return  res;
	}

	public static boolean hasValidBrackets(String text) {
		int j = -1;
		boolean res = false;
		char[] stack = new char[text.length()];
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == '(' || text.charAt(i) == '{' || text.charAt(i) == '[') {
				stack[++j] = text.charAt(i);
			} else {
				if (j >= 0 && ((stack[j] == '(' && text.charAt(i) == ')') || (stack[j] == '{' && text.charAt(i) == '}')
						|| (stack[j] == '[' && text.charAt(i) == ']'))) {
					stack[j--] = 0;
					if (stack[0] == 0) {
						res = true;
					}
				}
			}
		}
		return res;
	}
}