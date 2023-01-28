package assignmentDay2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {

	public static void main(String[] args) {

		//setting webdriver path
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		
		//Creating webbrowser instance by generic method
		WebDriver c=new ChromeDriver();
		
		//Opening required URL
		c.get("http://sampleapp.tricentis.com/101/");
		
		//Getting Pagetitle and printing and validiting
		String pageTitle=c.getTitle();
		System.out.println("Page titile="+pageTitle);
		System.out.println("Validation of Pagetitle="+pageTitle.equals("Tricentis Vehicle Insurance"));
		
		//Getting PageUrl and printing and Validating
		String pageUrl=c.getCurrentUrl();
		System.out.println("Page Url="+pageUrl);
		System.out.println("Validation of PageUrl="+pageUrl.equals("http://sampleapp.tricentis.com/101/"));
		
		//Getting pagesource code and print its length
		c.getPageSource();
		System.out.println("Pagesource length="+c.getPageSource().length());
	}

}
