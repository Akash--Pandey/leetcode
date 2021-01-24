package pundeyJava;

public class PlusOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a =new int[] {9,1,9};
		a = plusOne(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	public static int[] plusOne(int[] digits) {
		
		for(int i = digits.length-1; i >= 0; i--) {
			if(digits[i] < 9) {
				digits[i]++;
				return digits;
			}
			
			digits[i] = 0;
		}
		
		int[] temp = new int[digits.length+1];
		temp[0] = 1;
		
		return temp;
	}

}
