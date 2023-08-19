package rowdy69;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mousehover {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.nopcommerce.com/en/demo");
		WebElement ele= driver.findElement(By.xpath("//span[@class='user-actions-ico']//*[name()='svg']"));
		WebElement el=driver.findElement(By.xpath("//span[normalize-space()='Register']"));
		Actions act=new Actions(driver);
		act.moveToElement(ele).moveToElement(el).click().perform();
	}

}
