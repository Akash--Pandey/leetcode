package pundeyJava;

public class MaximumSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(maxSubArray(new int[] {-2,1,-3,4,-1,2,1,-5,4}));
	}

	public static int maxSubArray(int[] nums) {
		int max = nums[0];
		int [] temp = new int[nums.length];
		temp[0] = nums[0];
		if(nums.length == 1) {
			return max;
		}
		
		for(int i = 1; i < nums.length; i++ ) {
			temp[i] = Math.max(nums[i], nums[i] + temp[i-1]);
			 if(max < temp[i]) {
				 max = temp[i];
			 }
		}
		
		return max;
	}

}
