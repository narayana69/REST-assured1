package rowdy69;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class java2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.nopcommerce.com/en/register?returnUrl=%2Fen%2Fdemo");
		WebElement ele=driver.findElement(By.xpath("//h1[normalize-space()='Register']"));
		WebElement el=driver.findElement(By.xpath("//input[@id='register-button']"));
//		java.drawborderele(ele, driver);
//		System.out.println(java.titlepage(driver));	
//		java.refeshpage(driver);
//		java.alertbox(driver, "this alret box------");
		//java.flashele(driver, ele);
//		java.Scrooldownpage(driver);
//	    java.Scrooluppage(driver);
     //   java.clickbutton(el, driver);
		java.zoompage(driver);
	}

}
