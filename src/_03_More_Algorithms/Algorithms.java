package _03_More_Algorithms;

import java.util.Iterator;
import java.util.List;

/*
 * Write your methods in this class
 */
public class Algorithms {

	public static int findBrokenEgg(List<String> eggs) {
		int num = 0;
		for (int i = 0; i < eggs.size(); i++) {
			String s = eggs.get(i);
			if (s == "cracked") {
				num = i;
				break;
			}
		}
		return num;
	}

	public static int countPearls(List<Boolean> oysters) {
		int num = 0;
		for (int i = 0; i < oysters.size(); i++) {
			boolean s = oysters.get(i);
			if (s) {
				num += 1;

			}
		}
		return num;
	}

	public static double findTallest(List<Double> peeps) {
		double num = 0;

		for (int i = 0; i < peeps.size(); i++) {
			Double dob = peeps.get(i);
			if (dob >= 6.6) {
				num = peeps.get(i);

			}
		}
		return num;
	}

	public static String findLongestWord(List<String> words) {
		String word = "";

		for (int i = 0; i < words.size(); i++) {
			String str = words.get(i);
			if (str.length() >= 14) {
				word = words.get(i);
				break;
			}
		}

		return word;
	}

	public static boolean containsSOS(List<String> message2) {
		for (int i = 0; i < message2.size(); i++) {
			String s = message2.get(i);

			if (s == "... --- ...") {
				return true;

			} else if(s != "... --- ..."){
				return false;
			}
			
		}
		
		return false;

	}
//MoreAndMoreTests	

	public static boolean isPrime(int i) {

		if (i % 2 == 0) {

			return false;

		} else {

			return true;
		}

	}

	public static boolean isSquare(int i) {
		double num = Math.sqrt(i);
		if (num - Math.floor(num) == 0) {
			return true;
		} else {
			return false;
		}

	}

}
