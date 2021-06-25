package _03_More_Algorithms;

import java.util.List;

/*
 * Write your methods in this class
 */
public class Algorithms {

	public static String multiply(int num1, int num2) {
		int sum = num1 * num2;
		String s = String.valueOf(sum);
		return s;
	}

	public static int findBrokenEgg(List<String> eggs) {
		return 0;
	}

	public static boolean isPrime(int num) {

		if (num % 2 == 0) {

			return false;

		} else {

			return true;
		}

	}

	public static boolean isSquare(int i) {
		double num = Math.sqrt(i);
		if(num - Math.floor(num) == 0) {
			return true;
		}else {
			return false;
		}
		
	}
}
