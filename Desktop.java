package week3.day2;

public class Desktop implements Software{

	public void deskTopModel() {
		System.out.println("Desktop Model");

	}

	public void hardwareResources() {
		System.out.println("Hardware Resource");

	}

	public void softwareResources() {
		System.out.println("Software Resource");
		
	}
public static void main(String[] args) {
	Desktop desk = new Desktop();
	desk.deskTopModel();
	desk.hardwareResources();
	desk.softwareResources();
}

}
