package learnexception;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Facebook {
@Test
	public  void runFacebook() {

		// Launch chrome browser
		ChromeDriver driver = new ChromeDriver();
		// Load the application url
		driver.get("https://www.facebook.com/");
		// Maximize the browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		 driver.findElement(By.linkText("Create new account")).click();
	
		
		try {
			driver.findElement(By.name("firstname1234556")).sendKeys("vinoth");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.name("lastname")).sendKeys("RK");
	}
}