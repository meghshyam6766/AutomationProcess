package practice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import utilities.SeleniumUtility;

public class scnshot1 extends SeleniumUtility {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		SeleniumUtility c=new SeleniumUtility();
		c.setUp("Chrome", "https://www.guru99.com/take-screenshot-selenium-webdriver.html");
	//	c.takeScreenshot(".\\Screenshots\\aa.jpg");
		TakesScreenshot ts=((TakesScreenshot)driver);
		File ScFile=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(ScFile,new File(".\\Screenshots\\bb.jpg"));
		
	}

}
