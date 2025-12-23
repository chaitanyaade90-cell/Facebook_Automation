package ScreenshotsPackage_23_12_2025;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShotsExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver();
		
		ChromeDriver d1=new ChromeDriver();
		
		d1.get("https://www.google.com");
		
		// Takescreenshot
		
		ScreenShotsExamples ts=new ScreenShotsExamples;

	}

}
