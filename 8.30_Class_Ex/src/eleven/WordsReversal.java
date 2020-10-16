package eleven;

import java.util.Scanner;

public class WordsReversal {

	private static String getReverseStrings(String strs) {
		String result = "";
		String[] split = strs.split(" ");
		for (int i = 0; i < split.length; i++) {

			result += getReverse(split[i]);
		}
		return result;
	}

	private static String getReverse(String strs) {

		String rev = "";
		for (int i = strs.length() - 1; i >= 0; i--) {

			rev += strs.charAt(i);
		}
		return rev + " ";
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter strings:");
		String strs = sc.nextLine();

		String rev = getReverseStrings(strs);
		System.out.println(rev);

		sc.close();

	}

}
