package DataDriverFramework_27_12_2025;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataDriven2 {

	private static CharSequence username;

	public static void main(String[] args, ChromeDriver d1) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver();
		
		
			 
			d1=new ChromeDriver();
			d1.manage().window().maximize();
			d1.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
			d1.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			
				

				WebElement username1=d1.findElement(By.name("username"));
				username1.sendKeys(username); 
				
				WebElement pwd=d1.findElement(By.name("password"));
				pwd.sendKeys("password");
				
				WebElement login=d1.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
				login.click();
				
			
			
			
		}
		
		
			
		

	}


