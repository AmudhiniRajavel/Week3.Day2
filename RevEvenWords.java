package week3.day2;

public class RevEvenWords {
	public static void main(String[] args) {

		String test = "I am a software tester";
		System.out.println(test);
		String[] name1 = test.split(" "); //"I","am","a","software","tester"
		for(int i=0;i<name1.length;i++)
		
		 {
		if(i%2!=0)							
		 {			
			char[] name2 = name1[i].toCharArray();		
			for(int j=name2.length-1;j>=0;j--) {
				System.out.print(name2[j]);
			}
			}
			else
		{
			System.out.print(" "+name1[i]+" "); //0
		}
		}

	}
}


