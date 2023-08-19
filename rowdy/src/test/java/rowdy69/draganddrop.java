package rowdy69;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class draganddrop {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Actions act=new Actions(driver);
		WebElement ele=driver.findElement(By.xpath("//div[@id='box1']"));
		WebElement el=driver.findElement(By.xpath("//div[@id='box101']"));

		//act.dragAndDrop(ele, el);
		act.clickAndHold(ele).release(el).perform();
		
	}

}
