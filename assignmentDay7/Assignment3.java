package assignmentDay7;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {

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
				c.get("https://www.nseindia.com/market-data/live-equity-market?symbol=NIFTY%2050");
				System.out.println("********X path for Volume of AXIS BANK********");
				System.out.println("//tr[td[a[text()='AXISBANK']]]/td[9]");
			
		
	}

}
