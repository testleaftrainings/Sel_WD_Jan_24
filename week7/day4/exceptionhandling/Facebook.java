package exceptionhandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {

		// Launch chrome browser
		ChromeDriver driver = new ChromeDriver();
		// Load the application url
		driver.get("https://www.facebook.com/");
		// Maximize the browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		 driver.findElement(By.linkText("Create new account")).click();
	
		
		try {
			driver.findElement(By.name("firstname1`2345")).sendKeys("vinoth");
		} finally {
			driver.findElement(By.name("lastname")).sendKeys("R");
		}
		
		
	}
}