package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class keyboard {

	public static void main(String[] args) {
		
		//Setting WebDriverPath
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		
		//Creating Instance of Browser
		WebDriver c=new ChromeDriver();
		//Maximize browser
		c.manage().window().maximize();
		//Implicity wait
		c.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//Opening URL
		c.get("https://demo.actitime.com/login.do");

		WebElement username=c.findElement(By.id("username"));
	//	username.sendKeys("admin",Keys.chord(Keys.CONTROL,"a"),Keys.chord(Keys.CONTROL,"c"));
	//	WebElement password=c.findElement(By.name("pwd"));
		//password.sendKeys(Keys.chord(Keys.CONTROL,"v"));
		username.sendKeys("admin",Keys.chord(Keys.CONTROL,"a"),Keys.chord(Keys.CONTROL,"c"));
		WebElement password=c.findElement(By.name("pwd"));
		password.sendKeys("manager",Keys.ENTER);
		
	}

}
