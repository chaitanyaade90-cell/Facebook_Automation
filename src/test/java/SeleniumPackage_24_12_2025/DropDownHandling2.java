package SeleniumPackage_24_12_2025;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class DropDownHandling2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriverManager.chromedriver();
		
		ChromeDriver d1 = new ChromeDriver();
		
		d1.get("https://www.facebook.com");
		
		d1.manage().window().maximize();
		
		Select DropDown = new Select(d1.findElement(By.id("username")));
		
		

	}

}
