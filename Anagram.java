package week3.day2;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String s1 = "Stops";
		String s2 = "Potss";
		int len1 = s1.length();
		int len2 = s2.length();
		boolean status = true;
		if (len1 != len2) {
			System.out.println("Length is not same");

		} else
			System.out.println("Length is same");

		char[] charArray = s1.toLowerCase().toCharArray();
		char[] charArray2 = s2.toLowerCase().toCharArray();
		Arrays.sort(charArray);
		Arrays.sort(charArray2);
		status = Arrays.equals(charArray, charArray2);

		if (status) {
			System.out.println("Both are Anagram");
		} else
			System.out.println("Both are not Anagram");

	}

}
