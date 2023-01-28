package assignmentDay4;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase7 {

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
     	
     	List<WebElement> pagination=c.findElements(By.cssSelector(".pushT10>div>a"));
     	System.out.println("No. of Pages list count="+pagination.size());
     	
     	for(int i=0;i<pagination.size();i++)
     	{
     		//WebElement pagination1=c.findElement(By.cssSelector(".pushT10>div>a"));
     		//String href=pagination1.getAttribute("href");
     		System.out.println("No. of Pages in pagination: "+pagination.get(i).getText());
     		//WebElement paginationList=pagination.get(i);
     		//System.out.println("Pagination links="+paginationList.getText());
     	}
     	
     	pagination.get(1).click();
     	System.out.println(c.getCurrentUrl());
	
	
	}

}
