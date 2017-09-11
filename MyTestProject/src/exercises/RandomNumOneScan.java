package exercises;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class RandomNumOneScan {

	public RandomNumOneScan() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] numbers = new int [100];
		
		for (int i = 0; i < 100; i++) {
			numbers[i] = i;
		}
		
		Random random = new Random();
		Set<Integer> integers = new TreeSet<Integer>();
		Set<Integer> integers2 = new LinkedHashSet<Integer>();
		for (int i = 99; i >= 0; i--) {
			
			if(i != 0){
				int num = random.nextInt(i);
				//System.out.print("," + numbers[num] + ",");
				integers2.add(Integer.valueOf(numbers[num]));
				integers.add(Integer.valueOf(numbers[num]));
				int temp = numbers[num];
				numbers[num] = numbers[i];
				numbers[i] = temp;
			}
			
			
			
		}
		
		System.out.println(integers.size());
		Iterator<Integer> iterator = integers.iterator();
		while(iterator.hasNext()){
			
			System.out.print(iterator.next() + ",");
			
		}
		System.out.println("");
		
		System.out.println(integers2.size());
		Iterator<Integer> iterator2 = integers2.iterator();
		while(iterator2.hasNext()){
			
			System.out.print(iterator2.next() + ",");
			
		}
	}

}
