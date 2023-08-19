package rowdy69;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class autosuggistiondropdown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
//		driver.get("https://www.google.com/");
//		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("selenium");
//		List<WebElement> li=driver.findElements(By.xpath("//ul[@class='G43f7e']//li"));
//		System.out.println(li.size());
//		for(WebElement e:li) {
//			if(e.getText().equals("selenium download")) {
//				e.click();
//				break;
//			}
//		}

		driver.get("https://www.google.com/");
		WebElement ele=driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
		ele.sendKeys("selenium");
		List<WebElement> li=driver.findElements(By.xpath("//ul[@class='G43f7e']//li"));
			for(WebElement e:li) {
				if(e.getText().equals("selenium download")) {
					e.click();
					break;
				}
			}
		
		
		
		
	}

}
