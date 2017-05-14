package exercises;

import java.util.HashSet;
import java.util.Set;

public class GetDuplicateDataInOneScan {

	
	static String [] data = {"a","b","d","f","s","f","g","a","s","d","e","w","q","f","g"};
	public GetDuplicateDataInOneScan() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String result = getDuplicate(data);
		
		System.out.println(result);
	}

	private static String getDuplicate(String[] data2) {
		// TODO Auto-generated method stub
		
		Set<String> set = new HashSet<String>();
		Set<String> resultSet = new HashSet<String>();
		String result = "";
		
		for (String string : data) {
			
			if (set.contains(string)) {
				resultSet.add(string);
			}
			set.add(string);
		}
		for (String string : resultSet) {
			result += string;
		}
		return result;
	}

}
