package week5.day3;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Lead_LearnInvocationCount {

	@Test
	public void createLead() {
		System.out.println("Create Lead");
	}
	@Test
	public void editLead() {
		System.out.println("Edit Lead");
	}
	@Test(invocationCount = 5,threadPoolSize = 2 ,enabled = false)
	public void deleteLead() {
		 ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://leaftaps.com/opentaps/");
		System.out.println("Delete Lead");
	}
	@Test
	public void duplicateLead() {
		System.out.println("Duplicate Lead");
	}
}
