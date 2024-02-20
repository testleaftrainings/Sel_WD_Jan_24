package week4.day4;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//click show
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[1]")).click();
		//step 1: identify the alert
		Alert alert = driver.switchTo().alert();//switch the driver control
		//get the text from the alert box
		String msg = alert.getText();
		System.out.println(msg);
		alert.accept();
		//confirmation alert
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[2]")).click();
		Alert confirm = driver.switchTo().alert();
		System.out.println(confirm.getText());
		confirm.accept();
		String text = driver.findElement(By.id("result")).getText();
		System.out.println(text);
		//Sweet alert
		driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-closethick'])[2]")).click();
		
		
		
		
		
		

	}

}
