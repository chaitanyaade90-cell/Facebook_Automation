package XpathPackage_28_12_2025;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
WebDriverManager.chromedriver();
		
		ChromeDriver d1= new ChromeDriver();
		d1.get("https://www.gmail.com");
		
		d1.findElement(By.xpath("//input[@id='username']")).sendKeys("testuser");
		d1.findElement(By.xpath("//input[@id='password']")).sendKeys("password");
		d1.findElement(By.xpath("//button[text))='Login']")).click();
		
		

	}




	}


