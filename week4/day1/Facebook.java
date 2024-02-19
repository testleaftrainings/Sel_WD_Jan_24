package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {

		// Launch chrome browser
		ChromeDriver driver = new ChromeDriver();
		// Load the application url
		driver.get("https://www.facebook.com/");
		// Maximize the browser
		driver.manage().window().maximize();
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		 driver.findElement(By.linkText("Create new account")).click();
	
		
		driver.findElement(By.name("firstname")).sendKeys("vinoth");
		
	}
}