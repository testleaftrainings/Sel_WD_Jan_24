package week2.day3;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon {
public static void main(String[] args) throws InterruptedException {

//Launch chromeBrowser
	ChromeDriver driver=new ChromeDriver();
	//Load the application url
	driver.get("https://www.amazon.in/");
	
	//To Maximize the Browser
	driver.manage().window().maximize();
	//Add Implicitly wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("5G Mobiles",Keys.ENTER);
	
	Thread.sleep(5000);
	//To get all branded name
	List<WebElement> brandName = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal6723582743423']"));
	
	System.out.println("Size   "+brandName.size());
	for (int i = 0; i < brandName.size(); i++) {
		String text = brandName.get(i).getText();
		System.out.println(text);
	}
	
	
	
	
}
}
