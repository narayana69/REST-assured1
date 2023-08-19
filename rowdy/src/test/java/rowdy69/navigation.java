package rowdy69;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class navigation {

	public static void main(String[] args) {
		
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.get("https://www.nopcommerce.com/en/demo");
			driver.navigate().to("https://demo.automationtesting.in/Frames.html");
			driver.navigate().back();
			driver.navigate().forward();
			driver.navigate().refresh();
	}

}
