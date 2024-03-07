package exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnThrow {
public static void main(String[] args) throws InterruptedException, FileNotFoundException {
	FileInputStream  fis=new FileInputStream("src/main/resources/config_english.properties");
	Properties prop=new Properties();
	//prop.load(fis);
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Leads")).click();
	Thread.sleep(3000);
	System.out.println("Program running successfully");
	throw new RuntimeException();

}
}
