package exercises;

import java.util.HashSet;
import java.util.Set;

public class GetInterSection {

	static String [] strings1 = {"l","a","f","h","s","e","j","k",};
	static String [] strings2 = {"q","a","c","v","b","n","m","k",};
	
	public GetInterSection() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String result = findInterSection(strings1,strings2);
		System.out.println(result);

	}

	private static String findInterSection(String[] strings12,
			String[] strings22) {
		// TODO Auto-generated method stub
		
		Set<String> set = new HashSet<String>();
		String result = "";
		if (strings12.length > strings22.length) {
			
			for (String string : strings12) {
				set.add(string);
			}
			
			for (String string : strings22) {
				if (set.contains(string)) {
					result += string;
				}
			}
			
		}
		else {
			
			for (String string : strings22) {
				set.add(string);
			}
			
			for (String string : strings12) {
				if (set.contains(string)) {
					result += string;
				}
			}
			
		}
		
		return result;
	}

}
