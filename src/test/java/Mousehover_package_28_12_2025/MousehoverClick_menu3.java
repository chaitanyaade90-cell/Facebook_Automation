package Mousehover_package_28_12_2025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MousehoverClick_menu3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver();
		
		ChromeDriver d1 = new ChromeDriver();
		
		d1.get("https://www.amazon.com");
		
		d1.manage().window().maximize();
		
		WebElement menu = d1.findElement(By.id("nav-link-accountList"));
		
		WebElement submenu = d1.findElement(By.xpath("//span[text()='Your orders]"));
		
		Actions act = new Actions(d1);
		
		act.moveToElement(menu).click(submenu).perform();
		

	}

}
