package assignmentDay5;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment2 {

	public static void main(String[] args) {
		
		//Setting Webdriver path
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		
		//Creating instance of WebBrowser
		WebDriver c=new ChromeDriver();
		
		//Maximizing size of browser
		c.manage().window().maximize();
		
		//Implicity wait
		c.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Opening URL
		c.get("https://www.redbus.in/");
		
		//Finding and Entering Source City and choosing from list
		c.findElement(By.cssSelector("input[data-message='Please enter a source city']")).sendKeys("Pune");
		c.findElement(By.xpath("//*[@id='search']/div/div[1]/div/ul/li[3]")).click();
	
		//Finding and Entering Destination City and choosing from list
		c.findElement(By.cssSelector("input[data-message='Please enter a destination city']")).sendKeys("Goa");
		c.findElement(By.xpath("//*[@id='search']/div/div[2]/div/ul/li[2]")).click();
		
		//Entering Date
		c.findElement(By.cssSelector(".rb-monthHeader>*:nth-child(3)")).click();
		c.findElement(By.cssSelector(".rb-monthTable>tbody>*:nth-child(5)>*:nth-child(4)")).click();
		
		//Clicking on search button
		c.findElement(By.id("search_btn")).click();
	
		//Check box selection of after 6pm travels
     	c.findElement(By.cssSelector(".details>*:nth-child(3)>*:nth-child(4)>label")).click();
	   
     	//Checkbox selection for AC travels
     	WebDriverWait wait = new WebDriverWait(c,30);
	    wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".list-chkbox>*:nth-child(3)>label")));
	    c.findElement(By.cssSelector(".list-chkbox>*:nth-child(3)>label")).click();
	  
	    
	    //Creating List of travels and fares displayed after chckbox selection and printing it one by one
	    List<WebElement> suggList=c.findElements(By.className("travels"));
	    List<WebElement> fare=c.findElements(By.className("seat-fare"));
	    
    	System.out.println("List="+suggList.size());
    	for(int i=0;i<suggList.size();i++)
    	{
    	
    		
    		WebElement list=suggList.get(i);
    		WebElement fares=fare.get(i);
    		System.out.println("Travel Name"+list.getText()+", Fare="+fares.getText());
    	
    	
	
	
	}
	}
}

