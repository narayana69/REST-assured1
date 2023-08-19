package rowdy69;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class open2URLSintwotabs {

	public static void main(String[] args) {
		
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.get("https://www.nopcommerce.com/en/register?returnUrl=%2Fen%2Fdemo");
			driver.switchTo().newWindow(WindowType.WINDOW);
			//driver.switchTo().newWindow(WindowType.TAB);
			driver.get("https://demo.automationtesting.in/Frames.html");
			
			
	}

}
