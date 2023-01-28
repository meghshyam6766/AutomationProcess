package assignmentDay2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment6 {

	public static void main(String[] args) {

		//Setting Webdriver path
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		
		//Creating Instance of WebBrowser by generic method
		WebDriver c=new ChromeDriver();
		
		//Opening required URL in browser
		c.get("https://demo.automationtesting.in/Register.html");
		
		//Getting PageTitle,printing and validating
		String pageTitle=c.getTitle();
		System.out.println("Page Title is="+pageTitle);
		System.out.println("Validation of Pagetitle="+pageTitle.equals("Register"));
		
		//Getting PageUrl,printing and validating
		String pageUrl=c.getCurrentUrl();
		System.out.println("Page Title is="+pageUrl);
		System.out.println("Validation of Pagetitle="+pageUrl.equals("https://demo.automationtesting.in/Register.html"));
		
		//Getting page source code and print its length
		c.getPageSource();
		System.out.println("PageSource Length="+c.getPageSource().length());
		
		
		
		
	}

}
