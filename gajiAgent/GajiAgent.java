package gajiAgent;

/**
 * @author Reza Ananta Permadi Supriyo
 * @since 2022-02-11
 */

import java.util.Scanner;

public class GajiAgent {
	public static void main(String[] args) {
		int totalItem;
		double bonus, penalty, totalSalary = 0; 
		// input total item terjual
		Scanner input = new Scanner(System.in);
		totalItem = input.nextInt();
		// operasi matematika yang dilakukan sesuai kondisi total item terjual
		if(totalItem > 80) {
			bonus = (35*0.01)*(totalItem*50000);
			totalSalary = 500000 + bonus;
		}else if(totalItem >= 40){
			bonus = (25*0.01)*(totalItem*50000);
			totalSalary = 500000 + bonus;
		}else if (totalItem < 15) {
			totalItem = 15 - totalItem;
			penalty = (15*0.01)*(totalItem*50000);
			totalSalary = 500000 - penalty;
		}else {
			bonus = (10*0.01)*(totalItem*50000);
			totalSalary = 500000 + bonus;	
		}// print and casting double to integer
		System.out.println((int)totalSalary);
	}
}
