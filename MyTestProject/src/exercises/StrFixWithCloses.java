package exercises;

import java.util.Stack;

public class StrFixWithCloses {

	public StrFixWithCloses() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(StrFixWithCloses.isStrFix("sf(dfs(fds)((dfsdfs))")); 
	}

	public static boolean isStrFix(String str) {

		char[] s = str.toCharArray();
		Stack<String> stack = new Stack<String>();

		for (int i = 0; i < s.length; i++) {

			if (s[i] == '(') {
				stack.push(String.valueOf(s[i]));
			} else if (s[i] == ')') {

				if (stack.isEmpty())
					return false;

				stack.pop();
			}
		}

		if (stack.isEmpty())
			return true;
		else {
			return false;
		}
	}

}
