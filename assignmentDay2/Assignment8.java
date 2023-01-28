package assignmentDay2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment8 {

	public static void main(String[] args) {
		
		
		//setting webdriver path
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		
		//Creating webbrowser instance by generic method
		WebDriver c=new ChromeDriver();
		
		//Opening required URL
		c.get("https://www.amazon.in/");
		
		//Getting Pagetitle and printing and validiting
		String pageTitle=c.getTitle();
		System.out.println("Page titile="+pageTitle);
		System.out.println("Validation of Pagetitle="+pageTitle.equals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"));
		
		//Getting PageUrl and printing and Validating
		String pageUrl=c.getCurrentUrl();
		System.out.println("Page Url="+pageUrl);
		System.out.println("Validation of PageUrl="+pageUrl.equals("https://www.amazon.in/"));
		
		//Getting pagesource code and print its length
		c.getPageSource();
		System.out.println("Pagesource length="+c.getPageSource().length());
	}

}
