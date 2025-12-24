package SeleniumPackage_24_12_2025;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_Xpath1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver();
		
		ChromeDriver d1 = new ChromeDriver();
		
		d1.get("https://www.github.com/");
		
		d1.manage().window().maximize();
		
		d1.findElement(By.xpath("//input[@name='q']")).sendKeys("Automations");

	}

}
