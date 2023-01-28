package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class you {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		
		//Creating instance of browser using generic method
		WebDriver c=new ChromeDriver();
		
		//Maximizing webbrowser
		c.manage().window().maximize();
		//Implicity wait
		c.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//Opening URL
		c.get("https://www.youtube.com/");
		c.findElement(By.cssSelector("[placeholder='Search']")).sendKeys("pani pani");
		WebDriverWait wait=new WebDriverWait(c,20);
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#search-icon-legacy>yt-icon")));
		c.findElement(By.cssSelector("#search-icon-legacy>yt-icon")).click();
		c.findElement(By.cssSelector("a[title='Badshah | Paani Paani | Official Lyrical Video | Jacqueline Fernandez | Aastha Gill']")).click();
	
	}

}
