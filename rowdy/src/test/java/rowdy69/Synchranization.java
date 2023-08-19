package rowdy69;

import java.time.Duration;
import java.util.List;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Synchranization {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();	
		driver.get("https://www.google.com/");
		//Implicitly wait
	
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement ele=   driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
		ele.sendKeys("selenium");
		ele.sendKeys(Keys.ENTER);
	/*//	driver.findElement(By.xpath("//h3[normalize-space()='Selenium']")).click();
		
		//Explicitly Wait

		
//		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
//		
//		WebElement el=wait.until(ExpectedConditions.visibilityOfElementLocated( By.xpath("//h3[normalize-space()='Selenium']")));
//		el.click();
		//By loct=By.xpath("//h3[normalize-space()='Selenium']");
		//waiting(driver,loct , 5).click();
		
		
		
		//BY USING GENERIC METHOD
	
//		public static WebElement waiting(WebDriver driver,By locator,int timeouts ) {
//			
//			
//			WebDriverWait waits=new WebDriverWait(driver, Duration.ofSeconds(timeouts));
//             WebElement elee=waits.until(ExpectedConditions.presenceOfElementLocated(locator));
//             return elee;
//			
//			
//			
//		}
		
		*/
		
		//FLUENT WAIT declaration part
		
		/*Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class);
		
		//USING OF FLUENT WAIT
		
		
		WebElement foo=wait.until(new Function<WebDriver,WebElement>(){
			
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.xpath("//h3[normalize-space()='Selenium']"));
			}});
		foo.click();*/
			
		By loct=By.xpath("//h3[normalize-space()='Selenium']");	
		
		
		waits(driver, loct).click();
	}
	public static WebElement waits(WebDriver driver,final By locator) {
Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
.withTimeout(Duration.ofSeconds(20))
.pollingEvery(Duration.ofSeconds(5))
.ignoring(NoSuchElementException.class);
		

WebElement ele=wait.until(new Function<WebDriver, WebElement>() {
	public WebElement apply(WebDriver driver) {
		return driver.findElement(locator);
	}
});
	return ele;	
			
		}
		
		
		
		
		
		
		
		
		
	}


