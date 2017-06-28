package exercises;

public class GetNumberAndCheckIfLeftAndRightAreEquals {

	
	public GetNumberAndCheckIfLeftAndRightAreEquals() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer [] nums = new Integer [] {1,2,3,4,6};
		/*
		for (int i = 0; i < nums.length; i++) {
			nums[i] = i;
		}
		*/
		Integer index = 3;
		Integer sumLeft = 0 , sumRight = 0;
		for (int i = 0; i < nums.length; i++) {
			if (i<index) {
				sumLeft +=nums[i];
			}
			else if (i>index) {
				sumRight+=nums[i];
			}
		}
		System.out.println(sumLeft == sumRight);
	}

}
