package week4.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Table {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://www.leafground.com/pages/table.html ");
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='table_id']//tr"));
		System.out.println("number of rows: "+rows.size());
		List<WebElement> cols = driver.findElements(By.xpath("//table[@id='table_id']/tbody/tr[2]/td"));
		System.out.println("number of column:" +cols.size());
	 String text = driver.findElement(By.xpath("//table[@id='table_id']/tbody/tr[3]/td[2]")).getText();
		
		System.out.println(text);
		driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).click();
		
		

	}

}
