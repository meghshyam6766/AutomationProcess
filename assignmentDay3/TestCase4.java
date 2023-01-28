package assignmentDay3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase4 {

	public static void main(String[] args) {
		
		//Setting WebDriver path
		System.setProperty("webdriver.chrome.driver","drivers\\chromedriver.exe");
		
		//Creating instance of webbrowser
		WebDriver c=new ChromeDriver();
		
		//Opening URL link
		c.get("https://demo.vtiger.com/vtigercrm/index.php");
		
		//Verifying login page
		String pageTitle=c.getTitle();
		System.out.println("Page Title Verification="+pageTitle.equals("vtiger"));
		
		//Login to vgtier
		WebElement username=c.findElement(By.id("username"));
		username.clear();
		WebElement password=c.findElement(By.id("password"));
		password.clear();
		
		c.findElement(By.id("username")).sendKeys("admin");
		c.findElement(By.id("password")).sendKeys("Test@123");
		c.findElement(By.className("buttonBlue")).click();
		//validating homepage 
		String homepageTitle=c.getTitle();
		System.out.println("Home Page Title Verification="+homepageTitle.equals("Dashboard"));
		c.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//Clicking on add widget
		c.findElement(By.className("addButton")).click();
		//First
	
		c.findElement(By.cssSelector("a[data-name='GroupedBySalesStage']")).click();
		c.findElement(By.className("addButton")).click();
		
		
		c.findElement(By.cssSelector("a[data-name='TotalRevenuePerSalesPerson']")).click();
		
		//Logout
		c.findElement(By.className("userName")).click();
		c.findElement(By.id("menubar_item_right_LBL_SIGN_OUT")).click();
		c.close();
		

		
		
		
	}

}
