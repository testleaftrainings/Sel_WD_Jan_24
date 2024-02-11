package week2.day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToPrintAllTheValuesFromDropDown {
public static void main(String[] args) {

//Launch chromeBrowser
	ChromeDriver driver=new ChromeDriver();
	//Load the application url
	driver.get("https://www.leafground.com/select.xhtml;jsessionid=node01opcqizniq61w14fxyayh5vpx7168901.node0");
	
	//To Maximize the Browser
	driver.manage().window().maximize();
	
	
	//How to select values from dropdown
	//Locate the dropDown element
	WebElement dropDown = driver.findElement(By.xpath("//Select[@class='ui-selectonemenu']"));
	Select eleDropDown=new Select(dropDown);
	//eleDropDown.selectByVisibleText("Cypress");
	
	//To get the options from list
	List<WebElement> options = eleDropDown.getOptions();
	
	//iterate the values 
	for (int i = 0; i < options.size(); i++) {
		String text = options.get(i).getText();
		System.out.println(text);
	}
	
	
	
	
	
	
	
	
	
	
	
}
}
