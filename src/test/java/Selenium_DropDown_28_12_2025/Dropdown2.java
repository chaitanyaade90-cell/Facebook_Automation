package Selenium_DropDown_28_12_2025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver();
		
		ChromeDriver d1 = new ChromeDriver();
		
		d1.get("https://practice.expandtesting.com/dropdown");
		
		d1.manage().window().maximize();
		
		WebElement sd = d1.findElement(By.id("dropdown"));
		
		Select sdropdown = new Select(sd);
		
		sdropdown.selectByValue("1");
		

	}

}
