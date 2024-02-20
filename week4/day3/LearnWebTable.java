package week4.day3;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebTable {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/dashboard.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// Locate the table
		WebElement table = driver.findElement(By.xpath("//div[@id='j_idt154_content']/table"));
		// Get the rowCount
		List<WebElement> rowCount = table.findElements(By.tagName("tr"));
		System.out.println("Row count:" + rowCount.size());
		// Get the columnCount
		List<WebElement> columnCount = table.findElements(By.tagName("th"));

		System.out.println("Column count:" + columnCount.size());
		// print specific data
		String data = driver.findElement(By.xpath("//div[@id='j_idt154_content']/table//tr[3]/td[1]")).getText();

		System.out.println(data);
		// print all the country name
		for (int i = 1; i < rowCount.size(); i++) {
			for (int j = 1; j < columnCount.size(); j++) {
				String country = driver
						.findElement(By.xpath("//div[@id='j_idt154_content']/table//tr[" + i + "]/td[" + j + "]"))
						.getText();
				System.out.println(country);
			}

		}

	}

}
