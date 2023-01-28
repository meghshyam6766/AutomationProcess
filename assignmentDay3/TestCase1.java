package assignmentDay3;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {

	public static void main(String[] args) {
	
		//Setting WebDriver path
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		
		//Creating Instance of WebBrowser by generic method
		WebDriver c=new ChromeDriver();
		
		//Opening Amazon URL
		c.get("https://www.amazon.in/");
	
	//Maximizing the Browser screen
	c.manage().window().maximize();
	
		//getting pageTitle and printing it
		String pageTitle =c.getTitle();
		System.out.println("Page Title="+pageTitle);
	
		//Getting menulink and printing its title
		c.findElement(By.linkText("Best Sellers")).click();
		System.out.println("Pagetitle of menulink="+c.getTitle());
		
		//navigating to backpage
		c.navigate().back();
		//Again getting page title for verification
		String verify=c.getTitle();
		System.out.println("Verification="+verify.equals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"));
		c.close();
	}
	
	}