package rowdy69;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class checkboxes {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://artoftesting.com/samplesiteforselenium");
////		driver.findElement(By.xpath("//input[@value='Automation']")).click();
////		driver.findElement(By.xpath("//input[@value='Performance']")).click();
//		List<WebElement> li=driver.findElements(By.xpath("//input[@type='checkbox']"));
//		for(WebElement e:li) {
//			String r=e.getAttribute("value");
//			
//			if(r.equals("Automation")) {
//				e.click();
//				break;
//			}
//			
		//driver.findElement(By.xpath("//input[@value='Automation']")).click();
			List<WebElement> li=driver.findElements(By.xpath("//input[@type='checkbox']"));
			System.out.println(li.size());
			for(WebElement e:li) {
				String s=e.getAttribute("value");
				e.click();
				if(s.equals("Automation")) {
					e.click();
				}
			}
		}
		
	
	
	
	
	
	
	
	
	}


