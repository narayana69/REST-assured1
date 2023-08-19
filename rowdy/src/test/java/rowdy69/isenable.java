package rowdy69;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class isenable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://accounts.google.com/signup/v2/birthdaygender?biz=false&cc=IN&continue=https%3A%2F%2Fmail.google.com&flowEntry=SignUp&flowName=GlifWebSignIn&hl=en&service=mail&authuser=0&TL=AGEVcSRjTo0HajopJ0bVsFMnW2I3lxQCoS-sxMgYn234S5W2ZqytNFgdTFIQJbdT");
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("venky");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("kulluri");
		driver.findElement(By.xpath("//span[@class='VfPpkd-vQzf8d']")).click();
		
		WebElement ele= driver.findElement(By.xpath("//span[normalize-space()='Basic information']"));
		System.out.println(ele.isDisplayed());
		System.out.println(ele.isEnabled());
		System.out.println(ele.isSelected());
//		WebElement el=driver.findElement(By.xpath("//input[@value='Automation']"));
//		el.click();
//		System.out.println(ele.isDisplayed());
//		System.out.println(ele.isEnabled());
//		System.out.println(el.isSelected());
	}

}
