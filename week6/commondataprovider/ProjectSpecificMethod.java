package commondataprovider;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class ProjectSpecificMethod {

	ChromeDriver driver;
	String excelFileName;
	@Parameters({"url","userName","password"})
	@BeforeMethod
	public void preCondition(String url,String userName,String password) {
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys(userName);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
	
	}
	 @DataProvider
	 public String[][] sendData() throws IOException {
		 ReadExcel excel=new ReadExcel();
		 String[][] data = excel.excelData(excelFileName);
		 return data;
		
	 }
	
	@AfterMethod
	public void postCondition() {
		driver.close();
	}
}
