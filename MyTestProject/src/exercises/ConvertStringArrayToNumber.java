package exercises;


public class ConvertStringArrayToNumber {

	public ConvertStringArrayToNumber() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		String[] str = new String[] { "1", "9", "4", "8" };

		System.out.println(ConvertStringArrayToNumber.convertToNumV2(str));
	}

	public static int convertToNum(String[] s) {

		String strNum = "";

		for (int i = 0; i < s.length; i++) {
			strNum += s[i];
		}

		return Integer.valueOf(strNum);
	}

	public static int convertToNumV2(String[] s) {

		int mul = 1;
		int result = 0;
		
		for (int i = s.length - 1; i >= 0; i--) {

			result += Integer.valueOf(s[i]) * mul;
			mul *= 10;
		}

		return result;
	}

}
