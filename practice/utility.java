package practice;

import org.openqa.selenium.chrome.ChromeDriver;

import utilities.SeleniumUtility;

public class utility extends SeleniumUtility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SeleniumUtility.setUp("Chrome", "https://www.youtube.com/watch?v=iTWUfWvpdIE");
		SeleniumUtility c=new SeleniumUtility();
	System.out.println(c.getPageTitle());
	}

}
