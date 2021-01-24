package pundeyJava;

public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverse(-1534));
	}

	public static int reverse(int x) {
		int result = 0;
		boolean isNeg = false;
		if (x < 0) {
			isNeg = true;
			x *= -1;
		}
		System.out.println(isNeg + " " + x);
		while (x != 0) {
			int pop = x % 10;
			System.out.print(pop);
			x /= 10;
			result = result * 10 + pop;
		}

		if (result > Integer.MAX_VALUE) {
			return 0;
		}

		return isNeg ? (int)(-1 * result) : (int)result;
	}

}
