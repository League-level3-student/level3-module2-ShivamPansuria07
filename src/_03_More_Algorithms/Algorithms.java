package _03_More_Algorithms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

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

			if (s.equals("... --- ...")) {
				return true;

			}

		}

		return false;

	}

	public static List<Double> sortScores(List<Double> results) {
		for (int i = 0; i < results.size(); i++) {
			for (int k = 0; k < results.size() - 1; k++) {

				if (results.get(k) > results.get(k + 1)) {
					Double temp = results.get(k);
					double dob = results.get(k + 1);
					results.set(k, dob);
					results.set(k + 1, temp);

				}
			}
		}

		return results;
	}

	public static List<String> sortDNA(List<String> unsortedSequences) {
		for (int i = 0; i < unsortedSequences.size(); i++) {
			for (int k = 0; k < unsortedSequences.size() - 1; k++) {
				String str = unsortedSequences.get(k); 
				String str2 = unsortedSequences.get(k + 1);
				int num = str.length();
				int num2 = str2.length();
				if (num > num2) {
					String temp = unsortedSequences.get(k);
					String dob = unsortedSequences.get(k + 1);
					unsortedSequences.set(k, dob);
					unsortedSequences.set(k + 1, temp);
					

				}

			}

		}
		return unsortedSequences;
	}
	public static List<String> sortWords(List<String> words) {
		for (int i = 0; i < words.size(); i++) {
            for (int k = 0; k < words.size() - 1; k++) {
                
                // "a".compareTo( "b" ) => -1
                // "b".compareTo( "a" ) => 1
                // "b".compareTo( "b" ) => 0
            
            	//Look at the photo for hints; i have no clue what to do ngl
            	
               // if( words.get(k).compareTo(words.get(k+1) > ) {
                //    String temp = words.get(k);
                //    words.get(k) = arr3[ k+1 ];
                //    arr3[ k+1 ] = temp;
               // }
            }
        }
		return words;
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
