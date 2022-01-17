package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDupliates {

	public static void main(String[] args) {

		String s = "PayPal India";
		s=s.replace(" ", "");
		char[] charArray = s.toCharArray();
		// System.out.println(charArray);

		Set<Character> charSet = new LinkedHashSet<Character>();
		Set<Character> dupcharSet = new LinkedHashSet<Character>();

		for (char c : charArray) {
			boolean add = charSet.add(c);
			if (!add) {
				dupcharSet.add(c);
			}
		}
			System.out.println(dupcharSet);

			charSet.removeAll(dupcharSet);
			System.out.println(charSet);
		}

	}


