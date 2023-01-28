package assignmentDay4;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase4 {

	public static void main(String[] args) {
		
		
		//Setting Webdriver path
				System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
				
				//Creating instance of Webbrowser
				WebDriver c=new ChromeDriver();
				//Maximize size of browser
				c.manage().window().maximize();
				//implicity wait
				c.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				//Opening URL
				c.get("https://www.gsmarena.com/");
				//Validation of HomePage
				String homePage=c.getCurrentUrl();
				System.out.println("Validation of homepage="+homePage.equals("https://www.gsmarena.com/"));

				//Main menu option count
		     	List<WebElement> list=	c.findElements(By.cssSelector(".brandmenu-v2>ul>li>a"));
		     	System.out.println("PhoneFinder list count="+list.size());
		     	list.get(0).click();
		     
				
				List<WebElement> list1=c.findElements(By.cssSelector("#review-body>div>ul>li>a"));
				System.out.println("Samsung phones List Size="+list1.size());
	
				//Printing list
				for(int i=0;i<list1.size();i++)
				{
					WebElement listSize=list1.get(i);
					System.out.println(listSize.getText());
				}
	}

}
