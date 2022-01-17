package week3.day2;

import java.util.Arrays;

public class SortingwithoutCollection {
	public static void main(String[] args) {

		String[] input = { "HCL", "Wipro", "Aspire Systems", "CTS" };
		int size = input.length;
		System.out.println(size);
		Arrays.sort(input);
		for (int i = size-1; i >= 0; i--)
			System.out.println(input[i]);

	}
}
