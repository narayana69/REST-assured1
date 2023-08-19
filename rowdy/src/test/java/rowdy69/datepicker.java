package rowdy69;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class datepicker {
@Test
	public void setuo() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/datepicker/");
//		
//		driver.switchTo().frame(0);
//		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
//		
//		String monyr="June 2024";
//		String date="12";
//		
//		
//		while(true) {
//			String mony=driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
//			
//			if(mony.equals(monyr)) {
//				break;
//			}else {
//				driver.findElement(By.xpath("//a[@title='Next']")).click();
//			}
//			
//			
//		}
//		
//		
//		List<WebElement> li=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
//		for(WebElement e:li) {
//			if(e.getText().equals(date)) {
//				e.click();
//				break;
//			}
//		}
		
		
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		String monyr="August 2024";
		String date="15";
		while(true) {
			String mony=driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
		if(mony.equals(monyr)) {
			break;
			
		}else {
			driver.findElement(By.xpath("//a[@title='Next']")).click();
			
		}
		
		}
		List<WebElement> li=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
		System.out.println(li.size());
		for(WebElement e:li) {
			if(e.getText().equals(date)) {
				e.click();
			}
		}
	}

}
