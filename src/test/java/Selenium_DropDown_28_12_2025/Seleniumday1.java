package Selenium_DropDown_28_12_2025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Seleniumday1 {

	private static Object Selectdropdown;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://practice.expandtesting.com/dropdown");
		
		driver.manage().window().maximize();
		
		WebElement sd = driver.findElement(By.id("dropdown"));
		
		Select sdropdown = new Select(sd);
		
		sdropdown.selectByValue("1");
		

	}

}
