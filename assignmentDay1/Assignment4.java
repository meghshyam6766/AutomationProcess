package assignmentDay1;



import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "drivers\\geckodriver.exe");
	
		WebDriver c=new FirefoxDriver();
		
		c.get("http://demosite.executeautomation.com/Login.html");
		
		
		String PageTitle=c.getTitle();
		System.out.println("Page Title="+PageTitle);
		System.out.println("PageTitle Length="+PageTitle.length());
		String currentUrl=c.getCurrentUrl();
		System.out.println("Verification of URl="+currentUrl.equals("https://demosite.executeautomation.com/Login.html"));
		WebElement usernameinput=c.findElement(By.name("UserName"));
		usernameinput.sendKeys("execution");
		WebElement passwordinput=c.findElement(By.name("Password"));
		passwordinput.sendKeys("admin");
		
		c.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement loginbutton=c.findElement(By.name("Login"));
		
		loginbutton.submit();
		FluentWait wait=new FluentWait(c)
				.withTimeout(Duration.ofSeconds(20))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class);
	
		wait.until(ExpectedConditions.elementToBeClickable(By.tagName("a")));
		c.findElement(By.tagName("a")).click();
		
		//WebElement logout=c.findElement(By.tagName("a"));
		//logout.click();
		
	}

}
