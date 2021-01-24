/**
 * 
 */
package pundeyJava;

import java.util.function.Predicate;
import java.util.stream.IntStream;

/**
 * @author Akash
 *
 */
public class PrimeNo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 7;
		Predicate<Integer> isDiv = div -> num % div == 0;
		
		System.out.println( num > 1 && IntStream.range(2, num).noneMatch(index -> isDiv.test(index)));
		
	}

}
