package Selenium_27_12_2025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest_27_12_2025 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver();
		
		ChromeDriver d1 = new ChromeDriver();
		
		d1.get("https://www.gmail.com/");
		
		d1.manage().window().maximize();
		
		WebElement loginbutton = d1.findElement(By.id("loginbtn"));
		
		loginbutton.click();
		
		WebElement gettitle = d1.findElement(By.id(d1.getTitle()));
		

	}

}
