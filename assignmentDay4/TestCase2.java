package assignmentDay4;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase2 {

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
		c.get("https://www.espncricinfo.com/");
		//Validating Homepage
		String homePage=c.getCurrentUrl();
		System.out.println("Validation of homepage="+homePage.equals("https://www.espncricinfo.com/"));
	
		//Main menu option count
		List<WebElement> menuList=c.findElements(By.className("ci-nav-text"));
		System.out.println("Main menu List COunt="+menuList.size());
		for(int i=0;i<menuList.size();i++)
		{
			
			WebElement List=menuList.get(i);
			System.out.println(List.getText());
		}
		
	
	
	
	}
	
	

}
