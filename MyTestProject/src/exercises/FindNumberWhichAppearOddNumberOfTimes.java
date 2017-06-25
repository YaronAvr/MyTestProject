package exercises;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FindNumberWhichAppearOddNumberOfTimes {

	public FindNumberWhichAppearOddNumberOfTimes() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int [] arr = new int [] {2,4,7,2,8,4,6,88,43,65,32,453,56,32,435,78,53,6,32,56};
		int maxNum = 0;
		int num = -1;
		
		/*
		//v1
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > maxNum) {
				maxNum = arr[i];
			}
		}
		
		int [] result = new int [maxNum + 1];
		
		for (int i = 0; i < arr.length; i++) {
			result[arr[i]]++;
		}
		
		for (int i = 0; i < result.length; i++) {
			if((result[i]%2) != 0 && result[i] > 1){
				num = i;
				break;
			}
		}
		*/
		
		//v2
		
		Map<Integer, Integer> myMap = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			Integer val = myMap.get(arr[i]);
			if (val == null) {
				val = 0;
			}
			val++;
			myMap.put(arr[i], val);
		}
		
		Iterator<Integer> myIterator = myMap.keySet().iterator();
		while (myIterator.hasNext()) {
			Integer key = myIterator.next();
			Integer val = myMap.get(key);
			if ((val % 2) != 0 && val > 1) {
				num = key;
			}
		}
		
		System.out.println(num);

	}

}
