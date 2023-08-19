package rowdy69;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowhandle {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.nopcommerce.com/en/register?returnUrl=%2Fen%2Fdemo");
		//	String s= driver.getWindowHandle();
		//System.out.println(s);
		String k=Keys.chord(Keys.CONTROL,Keys.ENTER);
		String l=Keys.chord(Keys.CONTROL,Keys.ENTER);
		String m=Keys.chord(Keys.CONTROL,Keys.ENTER);
		WebElement ele=driver.findElement(By.xpath("//ul[@class='list']//a[normalize-space()='Get started']"));
		WebElement ele2=driver.findElement(By.xpath("//a[contains(text(),'Marketplace')]"));
		WebElement ele3=driver.findElement(By.xpath("//a[contains(text(),'Translations')]"));
		ele.sendKeys(k);
		ele2.sendKeys(l);
		ele3.sendKeys(m);
	     Set<String> win= driver.getWindowHandles();
//	     Iterator<String> it=win.iterator();
//	     String parent=it.next();
//	     String child=it.next();
//	     String child1=it.next();
//	     String child2=it.next();
//	     
//	     driver.switchTo().window(child);
//	     System.out.println(driver.getTitle()+child);
	     List<String> li=new ArrayList<String>(win);
	     String parent   =  li.get(0);
	     String child   =  li.get(1);
	     String child1   =  li.get(2);
	    String child2  =  li.get(3);
	     driver.switchTo().window(child2);
	     System.out.println(driver.getTitle());
	     for(String e:li) {
	    	String h= driver.getWindowHandle();
	    	 driver.switchTo().window(e);
	    	 System.out.println(driver.getTitle()+h);
	    	 
	     }	
	}
	
}
