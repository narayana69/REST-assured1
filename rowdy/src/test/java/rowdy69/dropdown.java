package rowdy69;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdown {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://www.nopcommerce.com/en/register?returnUrl=%2Fen%2Fdemo");
		 WebElement ele= driver.findElement(By.xpath("//select[@id='TimeZoneId']"));
	    Select sc=new Select(ele);
//	    sc.selectByIndex(4);
//	    sc.selectByValue("UTC-09");
//	    sc.selectByVisibleText("(UTC-09:00) Alaska");
	    List<WebElement> li=sc.getOptions();
	    System.out.println(li.size());
	    for(WebElement e:li) {
	    	if(e.getText().equals("(UTC-09:00) Alaska")) {
	    		e.click();
	    	}
	    }
	}

}
