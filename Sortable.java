package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sortable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://www.leafground.com/pages/sortable.html");
		
		WebElement element2 = driver.findElement(By.xpath("//li[@class='ui-state-default ui-sortable-handle'][2]"));
		WebElement element4 = driver.findElement(By.xpath("//li[@class='ui-state-default ui-sortable-handle'][4]"));
		Actions builder = new Actions(driver);
		builder.dragAndDrop(element2, element4).perform();
	}

}
