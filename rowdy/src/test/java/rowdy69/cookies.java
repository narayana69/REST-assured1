package rowdy69;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class cookies {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://www.nopcommerce.com/en/register?returnUrl=%2Fen%2Fdemo");
//		Set<Cookie>	cook=	driver.manage().getCookies();
//		System.out.println(cook.size());
//		for(Cookie c:cook) {
//			System.out.println(c.getName()+"   "+c.getValue());
//		}
//		Cookie ob=new Cookie("venky", "1254268");
//		driver.manage().addCookie(ob);
//		Set<Cookie>	cook1=	driver.manage().getCookies();
//		System.out.println(cook1.size());
//
//
////		driver.manage().deleteCookie(ob);
////		Set<Cookie>	cook2=	driver.manage().getCookies();
////		System.out.println(cook2.size());
//		driver.manage().deleteCookieNamed("venky");
//		Set<Cookie>	cook3=	driver.manage().getCookies();
//		System.out.println(cook3.size());
//
//		
//		driver.manage().deleteAllCookies();
//		Set<Cookie>	cook4=	driver.manage().getCookies();
//		System.out.println(cook4.size());

	Set<Cookie> cook=	driver.manage().getCookies();
	System.out.println(cook.size());
	for(Cookie w:cook) {
		System.out.println(w.getName()+"  "+w.getValue());
	}
		Cookie ob=new Cookie("venky","12345");
		driver.manage().addCookie(ob);
		Set<Cookie> coo=driver.manage().getCookies();
		System.out.println(coo.size());
		driver.manage().deleteCookie(ob);
		driver.manage().deleteCookieNamed("venky");
		Set<Cookie> co=driver.manage().getCookies();
		
				System.out.println(co.size());
		driver.manage().deleteAllCookies();
		Set<Cookie> c=driver.manage().getCookies();
		System.out.println(c.size());
		
	}

}
