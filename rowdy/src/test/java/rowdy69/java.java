package rowdy69;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class java {
	public static void drawborderele(WebElement ele,WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].style.border='3px solid red'", ele);
	}
	public static String titlepage(WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
	String k=	js.executeScript("return document.title").toString();
	return k;
	}
	public static void clickbutton(WebElement ele,WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", ele);
	}
	public static void alertbox(WebDriver driver,String message) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("alert('"+message+"')");
	}
	public static void refeshpage(WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("history.go(0)");
	}public static void Scrooldownpage(WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}public static void Scrooluppage(WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
	}public static void zoompage(WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.body.style.zoom='50%'");
	}
	public static void flashele(WebDriver driver,WebElement ele) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		String bgcolor=ele.getCssValue("backgroundcolor");
		for(int a=1;a<4;a++) {
			changecolorpage(ele, driver, "green");
			changecolorpage(ele, driver, bgcolor);
		}
	}public static void changecolorpage(WebElement ele,WebDriver driver,String color ) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].style.backgroundColor='"+color+"'", ele);
		try {
			Thread.sleep(2000);
			
		}catch(Exception e) {
		System.out.println(e.getMessage());	
		}
	}
	
}
