package assignmentDay4;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase5 {

	public static void main(String[] args) {
		
		//Setting WebDriver Path
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		//Creating instance of WebBrowser
		WebDriver c=new ChromeDriver();
		//Maximize webbrowser
		c.manage().window().maximize();
		//Implicity wait
		c.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//Opening URl
		c.get("https://www.google.co.in/");
		//Searching "Automation Testing" in search bar
		c.findElement(By.name("q")).sendKeys("Automation Testing");
		
		List<WebElement> list=c.findElements(By.cssSelector(".UUbT9>div>div>div>div>ul>li"));
		System.out.println("Suggestion list="+list.size());
		
		for(int i=0;i<list.size();i++)
		{
			WebElement list1=list.get(i);
			System.out.println(list1.getText());
		}
		
	}

}
