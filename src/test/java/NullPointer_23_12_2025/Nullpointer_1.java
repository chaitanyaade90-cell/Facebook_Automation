package NullPointer_23_12_2025;

import org.openqa.selenium.chrome.ChromeDriver;

public class Nullpointer_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver d1=null;
		System.out.println("My name is Chaitanya");
		d1.get("https://www.google.com/");
		
		System.out.println("Exception on line no 1");
		System.out.println("Exception on line no 2");
		System.out.println("Exception on line no 3");

	}

}
