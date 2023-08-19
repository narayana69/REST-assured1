package rowdy69;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class keywordactions {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));	
		driver.get("https://www.nopcommerce.com/en/register?returnUrl=%2Fen");
		
	WebElement ele=driver.findElement(By.xpath("//input[@id='FirstName']"));
	ele.sendKeys("venky");
	Actions act=new Actions(driver);
	act.keyDown(Keys.CONTROL).sendKeys("a");
	act.keyDown(Keys.CONTROL).sendKeys("c");
	act.keyUp(Keys.CONTROL);
	act.sendKeys(Keys.TAB);
	driver.findElement(By.xpath("//input[@id='ConfirmEmail']")).click();
	act.keyDown(Keys.CONTROL).sendKeys("v").perform();
	
	}

}
