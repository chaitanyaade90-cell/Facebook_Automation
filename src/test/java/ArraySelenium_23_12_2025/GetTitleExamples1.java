package ArraySelenium_23_12_2025;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetTitleExamples1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver();
		
		ChromeDriver d1=new ChromeDriver();
		
		d1.get("https://www.github.com/");
		
		d1.manage().window().maximize();
		
		String title = d1.getTitle();
		
		System.out.println("Page title: " + title);

	}

}
