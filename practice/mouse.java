package practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class mouse {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver c=new ChromeDriver();
		c.manage().window().maximize();
		c.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		c.get("https://www.globalsqa.com/demo-site/draganddrop/");
		WebElement frame = c.findElement(By.cssSelector(".demo-frame.lazyloaded"));
		c.switchTo().frame(frame);

		Actions action=new Actions(c);
//		WebDriverWait wait=new WebDriverWait(c,20);
	//	wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".menu-custom-main-menu-container>ul>*:nth-child(4)")));
		
		List<WebElement> list=c.findElements(By.cssSelector("ul#gallery>li"));
		WebDriverWait wait=new WebDriverWait(c,20);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".ui-widget>div")));
			
		WebElement trash=c.findElement(By.cssSelector(".ui-widget>div"));
		//action.dragAndDrop(list.get(0), trash).build().perform();;
	for(int i=0;i<list.size();i++) {
		dragAndDrop(action,list.get(i),trash);
		
	}
	}
	
	static void dragAndDrop(Actions action,WebElement list1,WebElement trash1)
	{   action.dragAndDrop(list1, trash1).build().perform();

}
}