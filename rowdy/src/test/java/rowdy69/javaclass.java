package rowdy69;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class javaclass {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nopcommerce.com/en/register?returnUrl=%2Fen%2Fdemo");
		WebElement ele=driver.findElement(By.xpath("//h1[normalize-space()='Register']"));
		
		WebElement el=driver.findElement(By.xpath("//input[@id='register-button']"));

//		javascriptexecutor.drawborder(driver, ele);
//		javascriptexecutor.alret(driver, "this is");
		//javascriptexecutor.refresh(driver);
//		javascriptexecutor.scrooldown(driver);
//		Thread.sleep(3000);
//		javascriptexecutor.scroolup(driver);
//		javascriptexecutor.click(driver, el);
		System.out.println(javascriptexecutor.title(driver));
		//javascriptexecutor.zoom(driver);
		
		javascriptexecutor.flashs(driver, ele);
	}

}
