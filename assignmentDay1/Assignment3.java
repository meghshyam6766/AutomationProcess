package assignmentDay1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver c= new ChromeDriver();
		c.get("https://www.google.com");
		String currentUrl=c.getCurrentUrl();
		System.out.println("Current Url="+currentUrl);

		System.out.println("Url="+currentUrl.equals("https://www.google.com/"));
		c.getPageSource();
		c.close();
	
	}

}
