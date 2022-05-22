package inputOutput1;

import java.util.Scanner;

/**
 * @author Reza Ananta Permadi Supriyo
 * @since 2022-02-11
 */

public class inputSting1 {
	public static void main(String[] args) {
		int i;
		// array of string
		String[] lang = new String[3];
		// array of integer
		int[] x = new int[3];
		// input
		Scanner sc = new Scanner(System.in);
        for (i = 0; i<3; i++) {
            String s = sc.next();
            lang[i] = s;
            int n = sc.nextInt();
            x[i] = n;
        }
        // print format
        System.out.println("================================");
        for (i=0; i<3; i++) {
        	System.out.format("%-15s%03d%n", lang[i], x[i]);
        }
        System.out.println("================================");
	}
}
