package NullPointer_26_12_2025;

import org.openqa.selenium.chrome.ChromeDriver;

public class Nullpointer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver d1 = null;
		System.out.println("My project name is Universal");
		d1.get("https://www.github.com");
		
		System.out.println("Exceptiom on line no 1");
		System.out.println("Exception on line no 2");
		System.out.println("Exception on line no 3");

	}

}
