package pundeyJava;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] result = new int[2];
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++) {
        	int diff = target - nums[i];
        	for (int j = 0; j < nums.length; j++) {
				if(i != j && diff == nums[j]) {
					result[0]=i;
					result[1]=j;
					return result;
				}
			}
        }
        
        
        
        return result;
    }

    
    public static void main(String[] args) {
    	Solution ob = new Solution();
    	
    	//System.out.println(ob.solution(50));
    	//int a[] = ob.solution(780);
    	int a[] = {-9,-1,1,0,-4,0,7,8};
    	int[] res = new int[2];
    	res = ob.twoSum(a,15);
    	for (int i = 0; i < res.length; i++) {
			System.out.println(res[i]);
		}
	}
}
