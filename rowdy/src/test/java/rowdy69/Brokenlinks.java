package rowdy69;

import java.awt.datatransfer.StringSelection;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Brokenlinks {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://www.nopcommerce.com/en/register?returnUrl=%2Fen%2Fdemo");
//	List<WebElement> li=driver.findElements(By.tagName("a"));
//	System.out.println(li.size());
//	
//	int broken = 0;
//	int visit=0;
//	for(WebElement e:li) {
//		try {
//		String k=e.getAttribute("href");
//		URL url=new URL(k);
//	HttpURLConnection http=(HttpURLConnection)url.openConnection();
//	
//	http.connect();
//	int j=http.getResponseCode();
//	if(j>400) {
//		
//		System.out.println(j+" "+ url+"this is broken links ");
//		broken++;
//	}
//	else {
//		System.out.println(j+" "+ url+"this is visit links ");
//		visit++;
//	}
//		
//		
//		
//		}catch(Exception g) {
//			
//		}
//		
//		
//		
//	}
//	
//	System.out.println("broken links"+broken);
//	
//	System.out.println("visit links"+visit);
//	}
		int broken=0;
		int vist=0;
	List<WebElement> li=driver.findElements(By.tagName("a"));
	System.out.println(li.size());
	for(WebElement e:li) {
		try {
		String k=e.getAttribute("href");
		URL url=new URL(k);
		HttpURLConnection http=(HttpURLConnection)url.openConnection();
		http.connect();
		int r=http.getResponseCode();
		if(r>400) {
			
			System.out.println(r+"  "+url+"  "+"brokenlinks");
			broken++;
			break;
			
			
		}
		else {
			System.out.println(r+" "+url+" "+"visit links");
			vist++;
		}
		}catch(Exception g) {
		
	}
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
	}System.out.println("broken links"+broken);
	System.out.println("visit links"+vist);
	}
	}
