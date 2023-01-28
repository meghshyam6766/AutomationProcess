package assignmentDay5;
import java.util.List;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;





public class Assignment1 {

	public static void main(String[] args) {

		//Setting WebDriver path
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		//creating webbrowser instance
		WebDriver c=new ChromeDriver();
		//Maximize webbrowser
		c.manage().window().maximize();
		//Implicity wait
		c.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//Opening URL
		c.get("https://demo.actitime.com/login.do");
		//Login
		
		c.findElement(By.id("username")).sendKeys("admin");
		c.findElement(By.name("pwd")).sendKeys("manager");
		c.findElement(By.id("loginButton")).click();
		//Creating Tasks
		c.findElement(By.className("tasks")).click();
		c.findElement(By.className("plusIcon")).click();
		c.findElement(By.className("createNewTasks")).click();
	
		c.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//Select Project	
	
		c.findElement(By.cssSelector(".projectSelector .selectedItem")).click();
		List<WebElement> customerList=c.findElements(By.cssSelector(".projectSelector .searchItemList>div"));
		customerList.get(3).click();
		//Enter Task Name
		c.findElement(By.cssSelector("input[placeholder='Enter task name']")).sendKeys("Manual");
		//Selecting Date
		c.findElement(By.cssSelector("#ext-comp-1061>tbody>tr>*:nth-child(2)>em>button")).click();
		c.findElement(By.className("x-date-right")).click();
		c.findElement(By.cssSelector(".x-date-inner>tbody>*:nth-child(3)>*:nth-child(4)>a>em>span")).click();
		//Clicking on Create Task button
		c.findElement(By.className("commitButtonPlaceHolder")).click();
		//Selecting checkbox
		 WebElement checkbox=c.findElement(By.cssSelector(".createdTasksRowsTable>tbody>tr>td"));
		checkbox.click();
		
		//Deleting added task
		c.findElement(By.cssSelector(".bulkOperationsPanel>*:nth-child(6)")).click();
		c.findElement(By.cssSelector(".deleteDialog>div>div>div>.buttonsContainer .submitTitle")).click();
		
		
	
	}

}
