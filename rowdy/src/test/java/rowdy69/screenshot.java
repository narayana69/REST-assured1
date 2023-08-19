package rowdy69;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class screenshot {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File trg=new File(".\\screenshots\\venky.png");
		FileUtils.copyFile(src, trg);

		WebElement ele=driver.findElement(By.xpath("//h1[@id='demo-simple-context-menu']"));
		File sr=ele.getScreenshotAs(OutputType.FILE);
		File tr=new File(".\\screenshots\\venkat.png");
		FileUtils.copyFile(sr, tr);
		WebElement el=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		File s=el.getScreenshotAs(OutputType.FILE);
		File t=new File(".\\screenshots\\venkatna.png");
		FileUtils.copyFile(s, t);
		
		
	}

}
