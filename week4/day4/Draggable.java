package week4.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draggable {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/drag.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement drag = driver.findElement(By.id("form:conpnl_content"));
        Point location = drag.getLocation();
        
        System.out.println(location.getX());
        System.out.println(location.getY());
        
        Actions builder =new Actions(driver);
        builder.dragAndDropBy(drag, 100, 0).perform();
        System.out.println(drag.getLocation().getX());
        System.out.println(drag.getLocation().getY());
        
	}

}
