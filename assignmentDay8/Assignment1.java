package assignmentDay8;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import practice.keyboard;

public class Assignment1 {

//	private static final String Avinash1234 = null;

	public static void main(String[] args) {
		
		//Setting WebDriver path
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		
		//Creating instance of browser using generic method
		WebDriver c=new ChromeDriver();
		
		//Maximizing webbrowser
		c.manage().window().maximize();
		//Implicity wait
		c.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//Opening URL
		c.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//Login to Require Website
		WebElement username=c.findElement(By.cssSelector("input[placeholder='Username']"));
		username.sendKeys("Admin",Keys.TAB);
		WebElement pass=c.findElement(By.cssSelector("input[placeholder='Password'"));
		pass.sendKeys("admin123",Keys.ENTER);
		c.findElement(By.cssSelector(".oxd-sidepanel-body>ul>*:nth-child(2)")).click();
		c.findElement(By.className("oxd-button-icon")).click();
		c.findElement(By.className("orangehrm-firstname")).sendKeys("Avinash1234");

		//c.findElement(By.className("orangehrm-middlename")).sendKeys("P.");

	    WebElement save=c.findElement(By.className("orangehrm-lastname"));
	    save.sendKeys("patil");
	    c.findElement(By.className("orangehrm-left-space")).click();
	    c.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		c.findElement(By.cssSelector(".oxd-sidepanel-body>ul>*:nth-child(2)")).click();
		WebDriverWait Wait=new WebDriverWait(c,30);
		Wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[div[div[label[text()='Employee Name']]]]/div/div[2]/div/div/input")));
        c.findElement(By.xpath("//div[div[div[label[text()='Employee Name']]]]/div/div[2]/div/div/input")).sendKeys("Avinash1234");
		c.findElement(By.xpath("//button[ text()=' Search ']")).click();
		WebDriverWait Wait1=new WebDriverWait(c,30);
		Wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[div[div[text()='Avinash1234 ']]]/div/div/button[2]/i")));
      
		c.findElement(By.xpath("//div[div[div[text()='Avinash1234 ']]]/div/div/button[2]/i")).click();
		c.findElement(By.xpath("//div[a[text()='Job']]/a")).click();
		//c.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  //Job list
		Wait1.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".oxd-select-wrapper>div>div")));

		c.findElement(By.cssSelector(".oxd-select-wrapper>div>div")).click();
		c.findElement(By.xpath("//button[@type='submit']")).click();
		//Clicking on Employee list
		c.findElement(By.cssSelector(".oxd-topbar-body>nav>ul>*:nth-child(2)")).click();
		//Clicking on delete button
		c.findElement(By.cssSelector(".oxd-table-body>*:nth-child(4)>div>*:nth-child(9)>div>*:nth-child(1)")).click();
		//Confirm Delete
		c.findElement(By.cssSelector(".oxd-button--label-danger")).click();
		
		}

}