package assignmentDay7;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) {
		
		//Setting WebDriver path 
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		//Creating instance of Browser
		WebDriver c=new ChromeDriver();
		//Maximize size of browser
		c.manage().window().maximize();
		//implicity wait
		c.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//Opening URL
		c.get("https://www.flipkart.com/");
		System.out.println("********X path for Price of Samsung Galaxy F13 phone********");
		System.out.println("//div[div[div[text()=\"SAMSUNG Galaxy F13 (Waterfall Blue, 64 GB)\"]]]/div[2]/div[1]/div[1]/div[1]");
		
	}

}
