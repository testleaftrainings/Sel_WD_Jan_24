package week5.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandling2 {
public static void main(String[] args) {
	//Launch the chrome browser
	ChromeDriver driver=new ChromeDriver();
	//Load the application url
	driver.get("https://www.leafground.com/window.xhtml;jsessionid=node016y1502fmyirh1rhz5yp3oyvkk224238.node0");
	//Maximize the Browser
	driver.manage().window().maximize();
	
	//To get page title
	String title1 = driver.getTitle();
    System.out.println("title 1"+ title1);
    
    String currentUrl = driver.getCurrentUrl();
    System.out.println("currentUrl 1"+currentUrl);
    //to get parent window
    String parentWindow = driver.getWindowHandle();
    
    //click on open button	
	driver.findElement(By.xpath("//button[@type='button']")).click();
//	//to get child window
//	Set<String> windowHandles = driver.getWindowHandles();
//	System.out.println(windowHandles.size());
//	//Create an empty list and pass the set object to set constructor
//	List<String> childWindow=new ArrayList<String>(windowHandles);
//	System.out.println("List "+childWindow.size());
//	//Controll move to next window
//	driver.switchTo().window(childWindow.get(1));
//	
	
	//To get page title
		String title2 = driver.getTitle();
	    System.out.println("title 2"+ title2);
	    
	    String currentUr2 = driver.getCurrentUrl();
	    System.out.println("currentUrl 2"+currentUr2);
	    
	    //driver.switcgTo().window(childWindow.get(0));
	    //driver.switcgTo().window(parentWindow);
	    
	   driver.close();
	   // driver.quit();
}
}
