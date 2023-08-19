package rowdy69;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class javascriptexecutor {

	public static void drawborder(WebDriver driver,WebElement ele){
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].style.border='3px solid red'", ele);
		
	}
	public static String title(WebDriver driver){
		JavascriptExecutor js=(JavascriptExecutor)driver;
	String k=	js.executeScript("return document.title;").toString();
		return k;
	}
	public static void click(WebDriver driver,WebElement ele){
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", ele);
		
	}
	public static void alret(WebDriver driver,String message){
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("alert('"+message+"')");
		
	}
	public static void refresh(WebDriver driver){
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("history.go(0)");
		
	}
	public static void scrooldown(WebDriver driver){
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
	}
	public static void scroolup(WebDriver driver){
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
		
	}
	public static void zoom(WebDriver driver){
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.body.style.zoom='50%'");
		
	}
	public static void flashs(WebDriver driver,WebElement ele){
		JavascriptExecutor js=(JavascriptExecutor)driver;
	String bgcolor= ele.getCssValue("backgroundcolor");
		for(int a=0;a<3;a++) {
			changecolor(driver, ele, "red");
			changecolor(driver, ele, bgcolor);
			
		}
	}
	public static void changecolor(WebDriver driver,WebElement ele,String color){
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].style.backgroundColor='"+color+"'",ele);
		try {
			Thread.sleep(2000);
		}catch(Exception e) {
			
		}
	}



}
