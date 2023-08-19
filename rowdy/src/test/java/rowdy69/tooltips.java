package rowdy69;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class tooltips {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.nopcommerce.com/en/register?returnUrl=%2Fen%2Fdemo");
	WebElement ele=	driver.findElement(By.xpath("//input[@id='FirstName']"));
        System.out.println(ele.getText());
        System.out.println(ele.getAttribute("value"));
        System.out.println(ele.getTagName());
        System.out.println(ele.getLocation());
        System.out.println(ele.getSize());


        
	}

}
