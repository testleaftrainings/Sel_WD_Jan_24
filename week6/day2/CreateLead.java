package week6.day2;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;








public class CreateLead extends ProjectSpecificMethod {

@Test(dataProvider = "fetchData")
	public  void runCreateLead(String companyName,String firstName,String lastName) {
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
		driver.findElement(By.name("submitButton")).click();	
}
@DataProvider(name="fetchData")
public String[][] sendData() throws IOException {
	                      // row coloumn
	
	  ReadExcel excel=new ReadExcel();
	  String[][] data = excel.excelData();
	//data[0][0]="Testleaf";
	//data[0][1]="Vinoth";
	//data[0][2]="R";
     return data;
}
	
	
}






