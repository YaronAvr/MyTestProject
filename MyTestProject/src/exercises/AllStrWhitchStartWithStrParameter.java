package exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AllStrWhitchStartWithStrParameter {

	public AllStrWhitchStartWithStrParameter() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		List<String> collectionString = new ArrayList<String>();
		List<String> collectionResult = new ArrayList<String>();
		 
		collectionString.add("sdjkvdjkbv");
		collectionString.add("djksvjk");
		collectionString.add("djksvjkdksjchjdbvjhdfjh");
		collectionString.add("djkssdjklb");
		collectionString.add("ksdfhdkljsvkl");
		collectionString.add("dpoafujdvksld");
		collectionString.add("kdlsncknsdkn");
		collectionString.add("kdandkn");
		collectionString.add("orieavmklnvz");
		collectionString.add("zvdfljgfklzdm");
		collectionString.add("zvdfljgflzdm");
		
		int maxLength = getMaxLengthStr(collectionString);
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String paramStr = reader.readLine();
		
		collectionResult = getAllStrWhitchStartWithStrParameter(collectionString,maxLength,paramStr,collectionResult);
		
		printResult(collectionResult);
		
	
	}

	
	private static void printResult(List<String> collectionResult) {
		// TODO Auto-generated method stub
		
		for (String string : collectionResult) {
			System.out.println(string);
		}
	}

	private static List<String> getAllStrWhitchStartWithStrParameter(
			List<String> collectionString,int maxLength, String paramStr,
			List<String> collectionResult) {
		// TODO Auto-generated method stub
		for (int i = 0; i < maxLength; i++) {
			for (String s : collectionString) {
				if (s.startsWith(paramStr,i)) {
					collectionResult.add(s);
				}
			}
		}
		
		
		return collectionResult;
	}

	private static int getMaxLengthStr(List<String> collectionString) {
		// TODO Auto-generated method stub
		
		int max = 0;
		
		for (String string : collectionString) {
			if (string.length() > max) {
				max = string.length();
			}
		}
		
		return max;
	}

}
