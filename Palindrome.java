package week3.day2;

public class Palindrome {
	public static void main(String[] args) {

		String s = "malayalam";
		String srev = "";

		for (int i=s.length()-1;i>=0; i--) {
			srev = srev + s.charAt(i);
		}
			System.out.println(srev);
			if (s.equalsIgnoreCase(srev)) {
				System.out.println("It is a Palindrome");
			} else
				System.out.println("It is not a Palindrome");
		}

	}
