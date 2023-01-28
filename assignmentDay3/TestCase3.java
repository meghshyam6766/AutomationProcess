package assignmentDay3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase3 {

	public static void main(String[] args) {
	
		//Setting WebDriver path
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		
		//Creating Webbrowser instance using generic method
		WebDriver c=new ChromeDriver();
		
		//Opening required URL
		c.get("https://www.amazon.in/");
		c.manage().window().maximize();
		//Printing page title
		c.getTitle();
		System.out.println("Main Pagetitle="+c.getTitle());

		//Clicking on CUSTOMER SERVICE link and verify page title
		c.findElement(By.linkText("Customer Service")).click();
	    c.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String customerpageTitle=c.getTitle();
		System.out.println("Validation of Customerpage title="+customerpageTitle.equals("Help - Amazon Customer Service"));
		c.navigate().back();
		
		//Clicking on MOBILE link and verify page title
	
		c.findElement(By.linkText("Mobiles")).click();
	  
		String mobilePageTitle=c.getTitle();
		System.out.println("Validation of mobile link title="+mobilePageTitle.equals("Mobile Phones: Buy New Mobiles Online at Best Prices in India | Buy Cell Phones Online - Amazon.in"));
		c.navigate().back();
		
		//Clicking on TODAYS DEAL and verify page title
		c.findElement(By.linkText("Today's Deals")).click();
	  
		String dealPageTitle=c.getTitle();
		System.out.println("Validation of Deal link title="+dealPageTitle.equals("Amazon.in - Today's Deals"));
		c.navigate().back();
				c.close();
		
		
		
		
		
		
		
		
		
	}

}
