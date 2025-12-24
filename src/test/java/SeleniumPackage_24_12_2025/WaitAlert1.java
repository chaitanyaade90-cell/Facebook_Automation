package SeleniumPackage_24_12_2025;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitAlert1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver();
		
		ChromeDriver d1 = new ChromeDriver();
		
		d1.get("https://www.github.com/");
		
		d1.manage().window().maximize();
		
		d1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

}
