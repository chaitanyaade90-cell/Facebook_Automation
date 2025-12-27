package DataDriverFramework_27_12_2025;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDF_1 {

	private static ChromeDriver d1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		{
			 
			d1=new ChromeDriver();
			d1.manage().window().maximize();
			d1.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
			d1.get("C:UsersLENOVO DownloadsTestDataCore.xlsx");
			
				

				WebElement username1=d1.findElement(By.name("username"));
				username1.sendKeys("username"); 
				
				WebElement pwd=d1.findElement(By.name("password"));
				pwd.sendKeys("Password");
				
				WebElement login=d1.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
				login.click();
				
			
			
			
		}
		
		{
			 {
				
				
			}
		}

	}

}
