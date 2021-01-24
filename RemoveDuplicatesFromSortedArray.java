package pundeyJava;

import java.util.HashSet;

public class RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(removeDuplicates(new int[] {0,0,1,1,1,2,2,3,3,4}));
	}

	public static int removeDuplicates(int[] nums) {
		int currIndex =1;
		for(int i =0;i<nums.length-1;i++) {
			if(nums[i] != nums[i+1]) {
				nums[currIndex] = nums[i + 1];
				currIndex++;
			}
			
		}
		return currIndex;
	}

}
