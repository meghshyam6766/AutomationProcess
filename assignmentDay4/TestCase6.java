package assignmentDay4;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestCase6 {

	public static void main(String[] args) {
	
		//Setting Webdriver path
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		
		//Creating instance of webbrowser
		WebDriver c=new ChromeDriver();
		
		//Maximize size of browser
		c.manage().window().maximize();
		
		//Implicity wait
		//c.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Opening URL
		c.get("https://www.facebook.com/");
		
		//Validating homepage
		String homePage=c.getCurrentUrl();
		System.out.println("Validation of facebook homepage="+homePage.equals("https://www.facebook.com/"));
		
		//Click on Account creation button
		c.findElement(By.className("_6lti")).click();
		
		WebDriverWait wait=new WebDriverWait(c,20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("day")));
		System.out.println("*************Operations on Date****************");
		//Operation on Date dropdown
		WebElement date=c.findElement(By.id("day"));
		System.out.println("Id date dropdown displayed?="+date.isDisplayed());
		System.out.println("Id date dropdown enabled?="+date.isEnabled());
		System.out.println("Id date dropdown selected?="+date.isSelected());
		List<WebElement> optioncount=c.findElements(By.cssSelector(".large_form>*:nth-child(5)>*:nth-child(2)>span>span>*:first-child>option"));
		System.out.println("Date option count="+optioncount.size());
	//	System.out.println("Default Value on Date="+optioncount.);
	//	optioncount.get(5);
		optioncount.get(5).click();
	//System.out.println("After changing Value on Date="+date.);

		System.out.println("*************Operations on Month****************");
		//Operation on Month Dropdown
		WebElement month=c.findElement(By.id("month"));
		System.out.println("Id date dropdown displayed?="+month.isDisplayed());
		System.out.println("Id date dropdown enabled?="+month.isEnabled());
		System.out.println("Id date dropdown selected?="+month.isSelected());
		List<WebElement> monthOptionCount=c.findElements(By.cssSelector(".large_form>*:nth-child(5)>*:nth-child(2)>span>span>*:nth-child(2)>option"));
		System.out.println("Date option count="+monthOptionCount.size());

		System.out.println("*************Operations on Year****************");
		//Operation on Year dropdown
		WebElement year=c.findElement(By.id("year"));
		System.out.println("Id date dropdown displayed?="+year.isDisplayed());
		System.out.println("Id date dropdown enabled?="+year.isEnabled());
		System.out.println("Id date dropdown selected?="+year.isSelected());
		List<WebElement> yearOptionCount=c.findElements(By.cssSelector(".large_form>*:nth-child(5)>*:nth-child(2)>span>span>*:nth-child(3)>option"));
		System.out.println("Date option count="+yearOptionCount.size());
		
		
		
		
	}

}
