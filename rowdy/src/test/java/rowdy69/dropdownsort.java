package rowdy69;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdownsort {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.nopcommerce.com/en/register?returnUrl=%2Fen%2Fdemo");
		WebElement ele=driver.findElement(By.xpath("//select[@id='CountryId']"));
		Select sc=new Select(ele);
		List<WebElement> li=sc.getOptions();
		ArrayList og=new ArrayList();
		ArrayList tem=new ArrayList();
		for(WebElement e:li) {
			String k=e.getText();
			og.add(k);
			tem.add(k);
		}System.out.println(og);
		//System.out.println(tem);
		Collections.sort(tem);
		System.out.println(tem);
		if(tem.equals(og)) {
			System.out.println("not sorted");
		}else {
			System.out.println("sorted");
			
		}
	}

}
