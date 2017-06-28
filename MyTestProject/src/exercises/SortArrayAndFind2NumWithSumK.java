package exercises;

import java.util.Arrays;

public class SortArrayAndFind2NumWithSumK {

	public SortArrayAndFind2NumWithSumK() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = new int[20];
		
		for (int i = 0; i < nums.length; i++) {
			nums[i] = i;
		}
		
		int k = 22;
		int m = -1 , n = -1;
		
		for (int i = 0; i < nums.length; i++) {
			int num1 = nums[i];
			int num2 = k - num1;
			int index = Arrays.binarySearch(nums, num2);
			if (index > -1) {
				m = num1;
				n = num2;
				break;
			}
		}
		System.out.println("num1: " + m + "num2: " + n + " result: " + (m + n));
	}

}
