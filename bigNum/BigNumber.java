package bigNum;

/**
 * @author Reza Ananta Permadi Supriyo
 * @since 2022-02-11
 */

import java.util.Scanner;
import java.math.BigInteger; // untuk operasi matematika pada BigInteger

public class BigNumber {
	public static void main(String[] args) {
		// input
		Scanner input = new Scanner(System.in);
		
		BigInteger a = input.nextBigInteger();
		BigInteger b = input.nextBigInteger();
		// operasi matematika BigInteger
		BigInteger add = a.add(b);
		BigInteger multiply = a.multiply(b);
		// print
		System.out.println(add);
		System.out.println(multiply);
	}

}
