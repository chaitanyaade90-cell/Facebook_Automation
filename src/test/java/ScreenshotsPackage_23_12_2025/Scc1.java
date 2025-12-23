package ScreenshotsPackage_23_12_2025;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scc1 {

	@SuppressWarnings("unchecked")
	public static <TakeScreenshots> void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver();
		
		ChromeDriver d1= new ChromeDriver();
		
		d1.get("https://www.google.com/");
		
		// TakeScreenshots
		
		TakeScreenshots ts = (TakeScreenshots) d1;
		
		File source = ((Object) ts).getscreenshotAs(OutputType.FILE);

	}

}
