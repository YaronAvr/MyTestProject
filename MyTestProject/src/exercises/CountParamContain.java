package exercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class CountParamContain {

	static String [] data = {"d","dssd","jkgjkfd","sdjkhf","djdmsklcm","fhndjnc"};
	
	public CountParamContain() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter input?");
		Scanner myScanner = new Scanner(System.in);
		String input = myScanner.nextLine();
		
		int count = getCountOfInput(input);
		System.out.println(count);

	}

	private static int getCountOfInput(String input) {
		// TODO Auto-generated method stub
		
		//int counter = Collections.frequency(Arrays.asList(data), input);
		
		int counter = 0;
		for (String string : data) {
			if (string.contains(input)) {
				counter++;
			}
		}
		
		return counter;
		
	}

	

}
