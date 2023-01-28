package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Elementsmultiple {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		
		//Creating Instance of WebBrowser by generic method
		WebDriver c=new ChromeDriver();
		
		//Opening Amazon URL
		c.get("https://www.google.co.in/");
	
		//Maximizing the Browser screen
		c.manage().window().maximize();
	
    c.findElement(By.name("q")).sendKeys("Automation Testing");
    List<WebElement> list=c.findElements(By.xpath("//ul[@class='G43f7e']/li/div/div[2]/div[1]/span"));
  //get the count of identify element
  		int suggCount=list.size();
  		System.out.println(suggCount);
  		//to access one by one list element
  		for(int i=0;i<suggCount;i++) {
  			System.out.println(list.get(i).getText());
  		}
  		//close current browser
  		c.close();		
    
		
		
		
	}

}
