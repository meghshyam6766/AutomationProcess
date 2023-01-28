package assignmentDay7;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) {
	
		//Setting WebDriver Path
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		
		//Creating instance of webbrowser
		WebDriver c=new ChromeDriver();
		
		//Maximizing Browser
		c.manage().window().maximize();
		
		//Implicity wait
		c.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Opening URL
		c.get("https://www.demoblaze.com/");

		WebElement Price=c.findElement(By.xpath("//div[div[h4[a[text()=\"Samsung galaxy s6\"]]]]/div/h5"));
		System.out.println("X-Path = //div[div[h4[a[text()=\"Samsung galaxy s6\"]]]]/div/h5");
		WebElement iphone=c.findElement(By.xpath("//div[div[h4[a[text()='Iphone 6 32gb']]]]/div/h5"));
		System.out.println("Iphone price="+iphone.getText());
	}

}
