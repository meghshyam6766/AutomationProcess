package assignmentDay4;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","drivers\\chromedriver.exe");
		
		WebDriver c=new ChromeDriver();
		
		c.manage().window().maximize();
		//c.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
		c.get("https://www.flipkart.com/");
		c.findElement(By.className("_2doB4z")).click();
		//Validate home page
		
		String pageTitle=c.getTitle();
		System.out.println("Pagetitle validation="+pageTitle.equals("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!"));
		
		List<WebElement> categories = c.findElements(By.cssSelector("._37M3Pb>div>a>div>div>img"));
		System.out.println("Option count is: " + categories.size());

		for(int i=0;i<categories.size();i++)
		{
			System.out.println(categories.get(i).getText());
			
			}
		
		      
		}
	}


