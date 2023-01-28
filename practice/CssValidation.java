package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CssValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Setting WebDriver path
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		//creating webbrowser instance
		WebDriver c=new ChromeDriver();
		//Maximize webbrowser
		c.manage().window().maximize();
		//Implicity wait
		c.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//Opening URL
		c.get("https://demo.actitime.com/login.do");
		//Clicking on login button
	WebElement login=	c.findElement(By.id("loginButton"));
	login.click();
	String loginbutton=login.getCssValue("background-image");
		//Explicit wait
		WebDriverWait Wait=new WebDriverWait(c,20);
		Wait.until(ExpectedConditions.textToBe(By.cssSelector(".errormsg"), "Username or Password is invalid. Please try again."));
		//Identify error msg
		//colour
		WebElement errorMsg=c.findElement(By.cssSelector(".errormsg"));
		String errorColour=errorMsg.getCssValue("color");
		String errorSize=errorMsg.getCssValue("font-size");
		String errorFontFamily=errorMsg.getCssValue("font-family");
		System.out.println("ErrorColour msg Validations="+errorColour);
		System.out.println("ErrorSize msg Validations="+errorSize);	
		System.out.println("ErrorFontFamily msg Validations="+errorFontFamily);
		System.out.println("LoginButton Colour Validations="+loginbutton);
			
		Point errormsgPosition = errorMsg.getLocation();
		int Xcoordinate=errormsgPosition.getX();
		int Ycoordinate=errormsgPosition.getY();
		System.out.println("X coordinate="+Xcoordinate);
		System.out.println("Y coordinate="+Ycoordinate);
		
		
		
	}

}
