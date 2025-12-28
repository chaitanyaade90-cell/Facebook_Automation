package Scrrenshots_package_28_12_2025;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshots_1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver();
		
		ChromeDriver d1 = new ChromeDriver();
		
		d1.get("https://www.google.com");
		
		d1.manage().window().maximize();
		
		TakesScreenshot ts = (TakesScreenshot) d1;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/google.png");
		
		FileUtils.copyFile(src, dest);

	}

}
