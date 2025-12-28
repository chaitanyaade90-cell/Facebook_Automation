package Mousehover_testng_28_12_2026;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MH_TestNG_1 {
	
	WebDriver driver;
	
	@BeforeMethod
	
	public void setup() {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.gmail.com");
		
		driver.quit();
		
	}
	
	@AfterMethod
	
	public void tearDown() {
		
	}

}
