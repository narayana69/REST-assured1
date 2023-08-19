package rowdy69;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class jquerydropdown {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.manage().window().maximize();
	driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
	driver.findElement(By.xpath("//input[@id='justAnInputBox']")).click();
	
//	slect(driver, "choice 1","choice 4");
	slect(driver, "all");
}
public static void slect(WebDriver driver,String...value) {
	List<WebElement> li=driver.findElements(By.xpath("//ul//span//ul//span[@class='comboTreeItemTitle']"));
	if(!value[0].equals("all")) {
		for(WebElement e:li) {
			String k=e.getText();
			for(String val:value) {
				if(k.equals(val)) {
					e.click();
					break;
				}
			}
		}
	}else {try {
		for(WebElement e:li) {
			e.click();
			
		}
	}catch (Exception e) {
		
	}
		
	}
}
}