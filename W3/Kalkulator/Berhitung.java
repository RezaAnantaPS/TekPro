package Kalkulator;

/**
 * @author Reza Ananta Permadi Supriyo
 * @since 2022-02-11
 */

import java.util.Scanner;

public class Berhitung {
	public static void main(String[] args) {

	    char operator;
	    int number1, number2, result;

	    Scanner input = new Scanner(System.in);
	    // input operasi matematika
	    number1 = input.nextInt();
	    operator = input.next().charAt(0);
	    number2 = input.nextInt();
	    if((number1>=1 && number1<=1000)&&(number2>=1 && number2<=1000)) {
		    switch (operator) {
		      // penjumlahan
		      case '+':
		        result = number1 + number2;
		        System.out.println(result);
		        break;
		      // pengurangan
		      case '-':
		        result = number1 - number2;
		        System.out.println(result);
		        break;
		      // perkalian
		      case '*':
		        result = number1 * number2;
		        System.out.println(result);
		        break;
		      // pembagian
		      case '/':
		        result = number1 / number2;
		        System.out.println(result);
		        break;
		      default:
		        System.out.println("Invalid!");
		        break;
		    }
			    input.close();
	    }else
	    	System.out.println("Invalid Number!!");
	  }
}
