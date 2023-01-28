package assignmentDay3;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestCase2 {

	public static void main(String[] args) {
		
		//Setting Webdriver path
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		
		//Creating instance of webbrowser by generic method
		WebDriver c=new ChromeDriver();
		
		//Opening given url link
		c.get("https://www.techlistic.com/");
		
		//Maximize size of browser after opening browser
		c.manage().window().maximize();
		
//		WebDriverWait wait= (new WebDriverWait(c, 5));
	//	wait.until(ExpectedConditions . elementToBeClickable (By.partialLinkText("Java")));
			
		
		//Finding Java link element and Click on Java link in webapp
		c.findElement(By.className("overflowable-item")).click();			
		c.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//Validating page Url
		String pageUrl=c.getCurrentUrl();
		System.out.println("Validating Java link page url after clicking on java link="+pageUrl.equals("https://www.techlistic.com/p/java.html"));
		//Navigating back to homepage
		c.navigate().back();
		//Finding Seleniumlink and clicking
		c.findElement(By.className("dropbtn")).click();
		//Navigating back to homepage
		c.navigate().back();
		//Finding BDD link and clicking and validating and navigating back
		c.findElement(By.linkText("BDD")).click();;
		//Validating page Url again
		String BDDpageUrl=c.getCurrentUrl();
		System.out.println("Validating BDD page url after clicking on java link="+BDDpageUrl.equals("https://www.techlistic.com/p/bdd-tutorial-with-python-behave.html"));
		c.navigate().back();
		//Finding Testing link and clicking and validating 
		c.findElement(By.linkText("TESTING")).click();
		c.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebDriverWait wait= (new WebDriverWait(c, 5));
	//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(id)))));
				
		String TestingpageUrl=c.getCurrentUrl();
		System.out.println("Validating Testing link page url after clicking on java link="+TestingpageUrl.equals("https://www.techlistic.com/p/software-testing.html"));
		c.close();
		
	}

}
