package pundeyJava;

public class Sqrt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(mySqrt(5));
	}

	public static int mySqrt(int x) {
		
		if(x == 1 || x == 0) {
			return x;
		}
		int low = 1;
		int high = x/2;
		int mid = 0;
		 while (low <= high) {
			 mid = (low + (high - low))/2;
			 long sq = (long)mid*mid;
			 if(x == sq) {
				 return mid;
			 } else if (x > sq) {
				 low = mid+1;
			 } else {
				 high = mid-1 ;
			 }
		 }
		 
		 
		 return low -1;
	}

}
