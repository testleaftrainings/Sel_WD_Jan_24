package week3.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAdvancedXpath {

	public static void main(String[] args) {
		 //setup the driver and Launch the browser
		ChromeDriver driver =new ChromeDriver();
		//Load the url
		driver.get("http://leaftaps.com/opentaps/control/main");
		//Maximize the screen
		driver.manage().window().maximize();
		//Find the element then enter the username
		driver.findElement(By.xpath("//p[@class='top']/input")).sendKeys("demosalesmanager");
		//Find the element then enter the password
		driver.findElement(By.xpath("(//form[@id='login']//input)[2]")).sendKeys("crmsfa");
		//Find the element click login
		driver.findElement(By.xpath("(//label[@for='username']/following::input)[3]")).click();
		//click on crmsfa
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		//click on leads
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
	}

}
