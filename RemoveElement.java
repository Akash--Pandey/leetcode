package pundeyJava;

public class RemoveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(removeElement(new int[] { 1, 4, 4, 5, 6, 4 }, 4));
	}

	public static int removeElement(int[] nums, int val) {
		int newLength = 0;
		if (nums.length == 0) {
			return 0;
		}

		for (int i = 0; i < nums.length; i++) {
			if(nums[i] != val) {
				nums[newLength] = nums[i];
				newLength ++;
			}
		}
		
		return newLength;
	}
}
