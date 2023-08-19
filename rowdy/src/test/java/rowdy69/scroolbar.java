package rowdy69;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class scroolbar {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		WebElement ele=driver.findElement(By.xpath("//span[1]"));
		System.out.println(ele.getSize());
		Actions act=new Actions(driver);
		act.dragAndDropBy(ele, 100, 0).perform();
		WebElement el=driver.findElement(By.xpath("//span[2]"));
		act.dragAndDropBy(el, -100, 0).perform();
		
		
	}

}
