package rowdy69;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class autocompletegoogleplacesdropdown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
	/*	driver.get("https://www.twoplugs.com/");
		driver.findElement(By.xpath("//a[normalize-space()='Live Posting']")).click();
		WebElement ele= driver.findElement(By.xpath("//input[@id='autocomplete']"));
		ele.clear();
		ele.sendKeys("Toronto");
		String text;
		do {
			ele.sendKeys(Keys.ARROW_DOWN);
			text=ele.getAttribute("value");
			if(text.equals("Toronto, OH, USA")) {
				ele.sendKeys(Keys.ENTER);
				break;
			}
			
		}while(!text.isEmpty());
		*/
		
		
		
	driver.get("https://www.twoplugs.com/");
	driver.findElement(By.xpath("//a[normalize-space()='Live Posting']")).click();
	WebElement ele=driver.findElement(By.xpath("//input[@id='autocomplete']"));
	ele.clear();
	ele.sendKeys("Toronto");
	String text;
	do {
		ele.sendKeys(Keys.ARROW_DOWN);
		text=ele.getAttribute("value");
		if(text.equals("Toronto, OH, USA")) {
			ele.sendKeys(Keys.RETURN);
			break;
		}
		
	}while(!text.isEmpty());
	}

}
