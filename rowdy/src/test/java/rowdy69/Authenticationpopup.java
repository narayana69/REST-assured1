package rowdy69;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Authenticationpopup {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
	//	driver.get("https://the-internet.herokuapp.com/basic_auth");
	//	driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		//driver.get("https://user:password@the-internet.herokuapp.com/basic_auth");
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
	//	driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
			}
}

