package rowdy69;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class fileupload {

	public static void main(String[] args) throws AWTException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.foundit.in/");
		driver.findElement(By.xpath("//div[@class='heroSection-buttonContainer_secondaryBtn secondaryBtn']")).click();
	//	driver.findElement(By.xpath("//input[@id='file-upload']")).sendKeys("C:\\Users\\Venky\\OneDrive\\Documents\\avinash resume.pdf");
	  WebElement ele=driver.findElement(By.xpath("//input[@id='file-upload']"));
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	  js.executeScript("arguments[0].click()", ele);
	  Robot rb=new Robot();
	  rb.delay(2000);
	  StringSelection sc=new StringSelection("C:\\Users\\Venky\\OneDrive\\Documents\\avinash resume.docx");
	  
	  
	  rb.keyPress(KeyEvent.VK_CONTROL);
	  rb.keyPress(KeyEvent.VK_V);
	  
	  rb.keyRelease(KeyEvent.VK_CONTROL);
	//  rb.keyRelease(KeyEvent.VK_V);
	  
	  
	  rb.keyPress(KeyEvent.VK_ENTER);
	  rb.keyRelease(KeyEvent.VK_ENTER);
	}

}
