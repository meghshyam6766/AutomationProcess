package assignmentDay9;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utilities.SeleniumUtility;

public class demoAutomation extends SeleniumUtility {
	public static void main(String[] args) {
		
	setUp("Chrome","https://demo.automationtesting.in/Register.html");
	SeleniumUtility c=new SeleniumUtility();
	WebElement FirstName=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
	FirstName.sendKeys("Meghasham",Keys.TAB);
	driver.switchTo().activeElement().sendKeys("Patil",Keys.TAB);	
	driver.switchTo().activeElement().sendKeys("Plot no.8 Savitri Nagar Jalgaon",Keys.TAB);
	driver.switchTo().activeElement().sendKeys("patilmeghshyam140@gmail.com",Keys.TAB);
	driver.switchTo().activeElement().sendKeys("9403841359",Keys.TAB);
	driver.findElement(By.xpath("//input[@value='Male']")).click();
	driver.findElement(By.id("checkbox1")).click();
	driver.findElement(By.id("msdd")).click();
	driver.findElement(By.cssSelector("multi-select>div>ul>*:nth-child(2)>a")).click();
	//Skills Dropdown by SelectTag
	WebElement drop=driver.findElement(By.id("Skills"));
	Select s1=new Select(drop);
	s1.selectByValue("Adobe InDesign");
	//country
//	WebElement drop2=driver.findElement(By.id("countries"));
	//Select s6=new Select(drop2);
	//s6.selectByIndex(0);
	
	//Country Dropdwon by SelectTag
	WebElement drop1=driver.findElement(By.id("country"));
	Select s2=new Select(drop1);
	s2.selectByValue("India");
	//year Dropdown
	WebElement yearDrop=driver.findElement(By.id("yearbox"));
	Select s3=new Select(yearDrop);
	s3.selectByValue("1996");
	//Month Dropdown
	WebElement monthDrop=driver.findElement(By.xpath("//select[@placeholder='Month']"));
	Select s4=new Select(monthDrop);
	s4.selectByValue("January");
	//Date Dropdown
	WebElement dateDrop=driver.findElement(By.id("daybox"));
	Select s5=new Select(dateDrop);
	s5.selectByValue("10");
	driver.findElement(By.id("firstpassword")).sendKeys("qwertyuiop",Keys.TAB);
	driver.switchTo().activeElement().sendKeys("qwertyuiop");
	driver.findElement(By.id("submitbtn")).click();
	
	
	
	}
}
