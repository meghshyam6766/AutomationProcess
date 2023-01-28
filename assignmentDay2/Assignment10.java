package assignmentDay2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment10 {

	public static void main(String[] args) {
	
		//Setting Webdriver path
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		
		//Creating an instance of Webbrowser
		WebDriver c=new ChromeDriver();
		
		//Opening required url
		c.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//Validation of login page
		String loginUrl=c.getCurrentUrl();
		System.out.println("Validation of loginpage="+loginUrl.equals("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"));
		
		//Entering username and password
		c.findElement(By.name("username")).sendKeys("Admin");
		c.findElement(By.name("password")).sendKeys("admin123");
		c.findElement(By.className("oxd-button")).click();
	
		
		
		
		
	}

}
