package assignmentDay1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		
		WebDriver c=new ChromeDriver();
		c.get("https://demo.actitime.com/login.do");
	
		String pageTitle=c.getTitle();
		System.out.println("Page Title "+pageTitle);
		System.out.println("Page Title "+pageTitle.length());
		String actualurl=c.getCurrentUrl();
		System.out.println("Page url is: "+actualurl );
		System.out.println("Verification of url:"+actualurl.equals("https://demo.actitime.com/login.do"));
		String pagesource=c.getPageSource()	;                      
		
		System.out.println("Page Source Length="+pagesource.length());
		WebElement usernameinput=c.findElement(By.id("username"));
		usernameinput.sendKeys("admin");
		WebElement passwordinput=c.findElement(By.name("pwd"));
		passwordinput.sendKeys("manager");
		WebElement loginbutton=c.findElement(By.id("loginButton"));
		loginbutton.click();
		
		
		
		
		
		
		
		
	}
	

}
