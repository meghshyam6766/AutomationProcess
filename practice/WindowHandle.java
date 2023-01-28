package practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import utilities.SeleniumUtility;

public class WindowHandle extends SeleniumUtility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		setUp("Chrome", "https://etrain.info/in");
		//String homeWinId=driver.getWindowHandle();
		SeleniumUtility c=new SeleniumUtility();
		driver.findElement(By.xpath("//div[p[text()='Connect With Us']]/div/a[2]")).click();
		Set<String> allWinId=driver.getWindowHandles();
		Iterator<String> itr=allWinId.iterator();
		String homeWinId=itr.next();
		String twitterId=itr.next();
		
		System.out.println("Ids="+allWinId);
		//allWinId.remove(homeWinId);
		System.out.println(allWinId);
		driver.switchTo().window(twitterId);
		driver.findElement(By.className("nsm7Bb-HzV7m-LgbsSe-BPrWId")).click();
		
	}

}
