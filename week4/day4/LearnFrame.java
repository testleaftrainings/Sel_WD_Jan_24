package week4.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrame {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/frame.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//switch the driver control
		driver.switchTo().frame(0);
		//click me
		driver.findElement(By.xpath("(//button[text()='Click Me'])[1]")).click();
       //verification
		String text = driver.findElement(By.id("Click")).getText();
		System.out.println(text);
		//switch back to the main window
		driver.switchTo().defaultContent();
		//parent frame
		driver.switchTo().frame(2);
		//child frame
		driver.switchTo().frame("frame2");
		driver.findElement(By.xpath("//button[text()='Click Me']")).click();
		String text1 = driver.findElement(By.id("Click")).getText();
		System.out.println(text1);
		//parent frame
		driver.switchTo().parentFrame();
		//As a WebElement
		WebElement frame = driver.findElement(By.id("frame2"));
		driver.switchTo().frame(frame);
	}

}
