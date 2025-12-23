package ArraySelenium_23_12_2025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ArrayAelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver();
		
		ChromeDriver d1=new ChromeDriver();
		
		d1.get("https://www.gmail.com");
		
		WebElement[] buttons= new WebElement[3];
		buttons[1] = d1.findElement(By.id("btn1"));
		buttons[2] =d1.findElement(By.id("btn2"));
		buttons[3] = d1.findElement(By.id("btn3"));
		
		for (int i = 0; i < buttons.length; i++) {
			buttons [i].click();
			
		}
		
		
		

	}

}
