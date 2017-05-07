package exercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Stack;
// מקבלים 4 ספרות ומחזירים שעה הכי מאוחרת

public class YouGet4NumbersShowingMostLateHour {

	public YouGet4NumbersShowingMostLateHour() {
		// TODO Auto-generated constructor stub
	}
	
	public static String lateHour(Integer... numArr){
		
		StringBuffer result= new StringBuffer("");

		List<Integer> list = Arrays.asList(numArr);
				
		Collections.sort(list);
		Collections.reverse(list);
		result.append(list.get(0));
		result.append(":");
		result.append(list.get(1));
		result.append(":");
		result.append(list.get(2));
		result.append(".");
		result.append(list.get(3));
		
		
		result.insert(0, Arrays.asList(numArr).toString()); 
		return result.toString();
	}

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println(YouGet4NumbersShowingMostLateHour.lateHour(new Integer [] {1,4,3,2})); 
	}

}
