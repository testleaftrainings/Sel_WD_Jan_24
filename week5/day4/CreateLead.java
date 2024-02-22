package week5.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;




public class CreateLead extends ProjectSpecificMethod {

@Test()
	public  void runCreateLead(String companyName,String firstName,String lastName) {
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
		driver.findElement(By.name("submitButton")).click();	
}
@DataProvider(name="fetchData")
public String[][] sendData() {
	                      // row coloumn
	String[][] data=new String[1][3];
	
	data[0][0]="Testleaf";
	data[0][1]="Vinoth";
	data[0][2]="R";
	
	
//	data[1][0]="Qeagle";
//	data[1][1]="Vineeth";
//	data[1][2]="R";
//			
//	data[2][0]="Testleaf";
//	data[2][1]="Aravind";
//	data[2][2]="R";
	
return data;
	
	
	
	
}
	
	
}






