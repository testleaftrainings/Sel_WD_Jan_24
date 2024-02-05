package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LaunchBrowser {

	public static void main(String[] args) {
	  //setup the driver and Launch the browser
		ChromeDriver driver =new ChromeDriver();
		//Load the url
		driver.get("http://leaftaps.com/opentaps/control/main");
		//Maximize the screen
		driver.manage().window().maximize();
		//Find the element then enter the username
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		//Find the element then enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//Find the element click login
		driver.findElement(By.className("decorativeSubmit")).click();
		//click on crmsfa
		driver.findElement(By.linkText("CRM/SFA")).click();
		//click on leads
		driver.findElement(By.linkText("Leads")).click();
		//verify the page is loaded 
		 String title = driver.getCurrentUrl();
		 System.out.println(title);
		if(title.contains("Leads")) {
			System.out.println("Page is loaded");
		}
		else {
			System.out.println("Not loaded");
		}
		driver.findElement(By.linkText("Create Lead")).click();
		System.out.println(driver.getTitle());
		 String attribute = driver.findElement(By.id("createLeadForm_companyName")).getAttribute("name");
		System.out.println( attribute);
		//Handle the dropdown
		
		//locating the dropdown element then return as a WebElement
		WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		//Create obj for Select
		Select drop =new Select(source);
		//methods to pick the specific option
		//drop.selectByIndex(3);
		drop.selectByValue("LEAD_EMPLOYEE");
		//drop.selectByVisibleText("Partner");
		
		String text = driver.findElement(By.id("")).getText();
		
		
		//close the browser
		//driver.close();
		
		
	}

}
