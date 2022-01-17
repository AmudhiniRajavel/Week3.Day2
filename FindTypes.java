package week3.day2;

public class FindTypes {

	public static void main(String[] args) {

		String test = "$$ Welcome to 2nd Class of Automation $$ ";
	
		for(int i=0; i<test.length(); i++) {

			boolean flag = Character.isAlphabetic(test.charAt(i));
			boolean flag1 = Character.isDigit(test.charAt(i));
			boolean flag2 = Character.isSpaceChar(test.charAt(i));
			
			if (flag) {
				System.out.println("'" + test.charAt(i) + "' is a letter");
			}
			if (flag1) {
				System.out.println("'" + test.charAt(i) + "' is a number");
			}
			if (flag2) {
				System.out.println("'" + test.charAt(i) + "' is a space");
			} 
			else {
				System.out.println("'" + test.charAt(i) + "' is a special Character");

			}
		}
	}
}

