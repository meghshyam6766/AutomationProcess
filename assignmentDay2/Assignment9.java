package assignmentDay2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment9 {

	public static void main(String[] args) {
		
	//Setting webdriver path 
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		
	//Creating instance of webbrowser
		WebDriver c=new ChromeDriver();
		
		//Opening required url browser
		c.get("https://demo.vtiger.com/vtigercrm/index.php");
		
		//Validation of login page open or not
		String loginUrl=c.getCurrentUrl();
		System.out.println("Validation of Login Url="+loginUrl.equals("https://demo.vtiger.com/vtigercrm/index.php"));
	
		// Finding Elements and clearing and entering values
		WebElement username=c.findElement(By.id("username"));
		username.clear();
		username.sendKeys("admin");
		WebElement password=c.findElement(By.id("password"));
		password.clear();
		password.sendKeys("Test@123");
		
		//Clicking on login button
		
		WebElement loginbtn=c.findElement(By.className("button"));
		loginbtn.click();
		
		
		
	}

	
}
