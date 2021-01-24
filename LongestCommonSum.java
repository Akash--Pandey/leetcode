package pundeyJava;


//A O(n) and O(n) extra space Java program to find 
//longest common subarray of two binary arrays with 
//same sum 

class LongestCommonSum 
{ 
	static int arr1[] = new int[]{0, 1, 0, 1, 1, 1,1}; 
	static int arr2[] = new int[]{1, 1, 1, 1, 1, 0,1}; 
	
	// Returns length of the longest common sum in arr1[] 
	// and arr2[]. Both are of same size n. 
	static int longestCommonSum(int n) 
	{
		int maxLen=0; int pre_sum1,pre_sum2 = 0;
		int diff[] = new int[2*n+1];
		for(int i =0;i<(2*n+1);i++) {
			diff[i] = -1;
		}
		
		for (int i = 0; i < n; i++) {
			pre_sum1 = + arr1[i];
			pre_sum2 = + arr2[i];
			
			int curr_diff = pre_sum1 - pre_sum2;
			int diffIndex = n + curr_diff;
			if(curr_diff == 0) {
				maxLen = i+1;
			}
			else if(diff[diffIndex] == -1) {
				diff[diffIndex] = i;
			}
			else {
				int len = i - diff[diffIndex];
				if(len > maxLen)
					maxLen = len;
			}
		}
		return maxLen;
	} 
	
	// Driver method to test the above function 
	public static void main(String[] args) 
	{ 
		System.out.print("Length of the longest common span with same sum is "); 
		System.out.println(longestCommonSum(arr1.length)); 
	} 
} 
