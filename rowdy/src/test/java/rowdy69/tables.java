package rowdy69;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class tables {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://tablepress.org/demo/");
         int rows=	driver.findElements(By.xpath("//table[@class='tablepress tablepress-id-demo tablepress-responsive dataTable']//thead//tr[1]//th")).size();
	
	System.out.println(rows);
	
	int columns=driver.findElements(By.xpath("//table[@class='tablepress tablepress-id-demo tablepress-responsive dataTable']//tr[1]//td")).size();
	System.out.println(columns);
	
	
	String data=driver.findElement(By.xpath("//table[@class='tablepress tablepress-id-demo tablepress-responsive dataTable']//tr[2]//td[1]")).getText();
	System.out.println(data);
	
	
	for(int r=2;r<=rows;r++) {
		for(int c=1;r<=columns;c++) {
		String l=	driver.findElement(By.xpath("//table[@class='tablepress tablepress-id-demo tablepress-responsive dataTable']//tr['"+r+"']//td['"+c+"']")).getText();
		System.out.println(" ");
		}
		System.out.println(" ");
	}
	
	driver.quit();
	
	}

}
