package rowdy69;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Bootstrapdropdown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("");
//		driver.findElement(By.xpath("")).click();
////		List<WebElement> li=driver.findElements(By.xpath(""));
////		for(WebElement e:li) {
////			if(e.getText().equals("Accounts")) {
////				e.click();
////			}	
////			}
////			driver.findElement(By.xpath("")).click();
////			List<WebElement> l=driver.findElements(By.xpath(""));
////			for(WebElement e:l) {
////				if(e.getText().equals("Saving Accounts")) {
////					e.click();
////					
////				}
////
////	}}
//	List<WebElement> li=driver.findElements(By.xpath(""));
//	select(li, "Accounts");
//	
//	
//	driver.findElement(By.xpath("")).click();
//	List<WebElement> lis=driver.findElements(By.xpath(""));
//	select(lis, "Saving Accounts");
//		
//		
//		
//		
//		
//	}
//	
//	public static void select(List<WebElement> ele,String value) {
//		for(WebElement e:ele) {
//			if(e.getText().equals(value))
//			{
//				e.click();
//				break;
//			}
		
		driver.findElement(By.xpath("")).click();
		List<WebElement> li=driver.findElements(By.xpath(""));
//		for(WebElement e:li) {
//			
//			if(e.getText().equals("Accounts")) {
//				e.click();
//				break;
//			}
			driver.findElement(By.xpath("")).click();
			List<WebElement> l=driver.findElements(By.xpath(""));
			selectbt(li, "Sacingaccounts");
//			for(WebElement h:l) {
//				
//				if(h.getText().equals("Saving Accounts")) {
//					h.click();
//					break;
//				}
//		
//		
//		
//		
//		}
//			
//			
//			
//			
//			
//	}}
		}
public static void selectbt(List<WebElement> li,String value) {
	for(WebElement r:li) {
		if(r.getText().equals(value)) {
			r.click();
			break;
		}
	}
}

}
		
		
		
	
	
	
	
	
	
	
	
	
	


