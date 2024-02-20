package week5.day1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnSnapshot {
public static void main(String[] args) throws IOException {
	//Launch the chrome browser
	ChromeDriver driver=new ChromeDriver();
	//Load the application url
	driver.get("https://www.leafground.com/window.xhtml;jsessionid=node016y1502fmyirh1rhz5yp3oyvkk224238.node0");
	//Maximize the Browser
	driver.manage().window().maximize();
	//To take screenshot browser
     File source = driver.getScreenshotAs(OutputType.FILE);
     
     File destnation=new File("./snapshot/001.png");
     
     FileUtils.copyFile(source, destnation);
     
     //To take screenshot particular element
     //click on open button	
 	WebElement ele = driver.findElement(By.xpath("//button[@type='button']"));
     
 	File source1 = ele.getScreenshotAs(OutputType.FILE);
    
    File destnation1=new File("./snapshot/002.png");
    
    FileUtils.copyFile(source1, destnation1);
     
     
}
}
