package inputOutput;

import java.util.Scanner;

/**
 * @author Reza Ananta Permadi Supriyo
 * @since 2022-02-11
 */

public class inputString {
	static int n;

	public static void main(String[] args) {
		// input
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();
		// memisahkan string menjadi token
		String[] temp = s.split("[! , . ? _ ' @]+");
		n = temp.length;
		// print jumlah angka
		System.out.println(n);
		// print split string
		for (int i=0; i< temp.length;i++) {
			System.out.println(temp[i]);
		}
	}
}
