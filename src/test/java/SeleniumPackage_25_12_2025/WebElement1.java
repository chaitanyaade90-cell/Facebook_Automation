package SeleniumPackage_25_12_2025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class WebElement1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriverManager.chromedriver();
		
		ChromeDriver d1 = new ChromeDriver();
		
		d1.get("https://www.facebook.com");
		
		d1.manage().window().maximize();
		
		WebElement logo = d1.findElement(By.id("logo"));
		
		System.out.println(logo.isDisplayed());

	}

}
