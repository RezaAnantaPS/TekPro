package Strings;

import java.util.Scanner;

/**
 * @author Reza Ananta Permadi Supriyo
 * @since 2022-02-11
 */

public class SoalStrings {
	public static void main(String[] args) { 
		try(Scanner input = new Scanner(System.in)){
			String A = input.nextLine();
			String B = input.nextLine();
			System.out.println(A.length() + B.length());
			if ((A.compareTo(B)) == 0){
				System.out.println("Yes");
			} 
			else{
				System.out.println("No");
			}
			System.out.printf("%s %s", A.substring(0, 1).toUpperCase() + A.substring(1), B.substring(0, 1).toUpperCase() + B.substring(1));
		} 
		catch (Exception e) {
			System.out.println("Error");
		}
	}
}
