package week3.day2;

public class Automation extends MultipleLanguage implements TestTool, Language {

	@Override
	void python() {
		System.out.println("Python");
	}

	@Override
	void ruby() {
		System.out.println("Ruby");
	}

	public void Java() {
		System.out.println("Java");
	}

	public void Selenium() {
		System.out.println("Selenium");
	}

	public static void main(String[] args) {
		Automation lan = new Automation();
		lan.python();
		lan.ruby();
		lan.Java();
		lan.Selenium();

	}
}
