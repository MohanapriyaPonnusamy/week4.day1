package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nykaa {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.nykaa.com/");
		WebElement brandsEle = driver.findElement(By.xpath("//a[text()='brands']"));
		Actions builder = new Actions(driver);
		builder.moveToElement(brandsEle).perform();
		driver.findElement(By.linkText("L'Oreal Paris")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//span[@class='sort-name']")).click();
		driver.findElement(By.xpath("(//span[@class='title'])[4]")).click();
		driver.findElement(By.xpath("(//span[@class='title '])[1]")).click();
		driver.findElement(By.xpath("(//li[@class='css-1do4irw']/following::span")).click();
		driver.findElement(By.xpath("(//span[text()='Hair Care']")).click();
		driver.findElement(By.xpath("(//span[text()='Shampoo']")).click();
		driver.findElement(By.xpath("(//span[text()='Concern']")).click();
		driver.findElement(By.xpath("(//span[text()='Color Protection']")).click();
		String Shampoo = driver.findElement(By.xpath("(//span[contains(text(),'Filters Applied')]/following::span[1]")).getText();
		
		if(Shampoo.contains("Shampoo")) {
			System.out.println("text matches");
		}else {
			System.out.println("text not matches");
		
		}
		driver.findElement(By.xpath("(//div[@class='css-xrzmfa']")).click();
		driver.switchTo().window("https://www.nykaa.com/");
		driver.findElement(By.xpath("(//select[@class='css-2t5nwu']")).click();
		WebElement mrp = driver.findElement(By.xpath("(//span[@class='css-u05rr']"));
		System.out.println(mrp);
		driver.findElement(By.xpath("(//span[@class='btn-text']")).click();
		
		
		}
}






//8)check whether the Filter is applied with Shampoo
//9) Click on L'Oreal Paris Colour Protect Shampoo
//10) GO to the new window and select size as 175ml
//11) Print the MRP of the product
//12) Click on ADD to BAG
//13) Go to Shopping Bag 
//14) Print the Grand Total amount
//15) Click Proceed
//16) Click on Continue as Guest
//17) Check if this grand total is the same in step 14
//18) Close all windows