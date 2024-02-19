package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnWait {
public static void main(String[] args) {

	// Launch chrome browser
	ChromeDriver driver = new ChromeDriver();
	// Load the application url
	driver.get("https://www.facebook.com/");
	// Maximize the browser
	driver.manage().window().maximize();
	
	driver.findElement(By.linkText("Create new account")).click();
	
	By name = By.name("firstname");
	
	WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(20));
	
	wait.until(ExpectedConditions.presenceOfElementLocated(name));
	driver.findElement(name).sendKeys("Vinoth");
	
}
}
