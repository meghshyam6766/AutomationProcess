package assignmentDay2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {

	public static void main(String[] args) {
		//Setting driver executable path
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		//Creating an instance of WebBrowser by generic method
		WebDriver c=new ChromeDriver();
		//Opening given url
		c.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//Getting Pagetitle and Printing and validating
		String pageTitle=c.getTitle();
		System.out.println("Page Title is="+pageTitle);
		System.out.println("Validation of Page Title="+pageTitle.equals("OrangeHRM"));
		//Getting page url and validating
		String pageUrl=c.getCurrentUrl();
		System.out.println("Page Url is="+pageUrl);
		System.out.println("Validation of Page Url="+pageUrl.equals("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"));
		c.getPageSource();
		System.out.println("Page Source Lenth="+c.getPageSource().length());
	
	}

}
