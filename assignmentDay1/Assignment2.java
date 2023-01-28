package assignmentDay1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		
		WebDriver c=new ChromeDriver();
		c.get("http://www.facebook.com");
		String PageTitle=c.getTitle();
		System.out.println("Verification of title="+PageTitle.equals("Facebook – log in or sign up"));
		
		System.out.println("PageTitle is:"+PageTitle);
		c.close();
	
	
			
	
	}

}
