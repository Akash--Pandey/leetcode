package pundeyJava;

public class SearchInsertPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(searchInsert(new int[] {3,5,7,9,10}, 8));
	}

	public static int searchInsert(int[] nums, int target) {
		int len = nums.length;
		int result = 0;
		if(nums[0] > target) {
			return 0;
		} else if (nums[len-1] < target) {
			return len;
		}
		int high = nums.length-1;
		int low = 0;
		int mid =0;
		while (low < high) {
			mid = (low + high)/2;
			
			if(nums[mid] == target) {
				return mid;
			} else if(nums[mid] > target) {
				high = mid -1;
			} else {
				low = mid+1;
			}				
		}	
		
		System.out.println("mid " + mid);
		System.out.println("high " + high);
		System.out.println("low " + low);
		if(high <= low) {
			if(nums[high] >= target) {
				result = high ;
			} else if(nums[high] < target){
				result = high + 1;
			} 
		}
		return result;
	}

}
