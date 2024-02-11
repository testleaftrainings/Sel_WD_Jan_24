package week3.day4;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnWrapperClass {

	public static void main(String[] args) {
		int num =40;
		Integer val =65;
		
		System.out.println(val.floatValue());
		
		List<String> lstName =new ArrayList<String>();
		 //setup the driver and Launch the browser
		ChromeDriver driver =new ChromeDriver();
		//Load the url
		driver.get("https://www.leafground.com/select.xhtml");
		//Maximize the screen
		driver.manage().window().maximize();
		WebElement drop = driver.findElement(By.className("ui-selectonemenu"));
		Select tools =new Select(drop);
		List<WebElement> options = tools.getOptions();
		
		for (int i = 0; i <options.size() ; i++) {
			options.get(i).click();
			
		}
		
		List<Object> lstName1 =new ArrayList<Object>();
		
		lstName1.add("Testleaf");
		lstName1.add(14);
		lstName1.add('T');
		lstName1.add(12.3f);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
