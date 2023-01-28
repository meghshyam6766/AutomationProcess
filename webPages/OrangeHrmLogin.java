package webPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import SeleniumUtility.SeleniumUtility;

public class OrangeHrmLogin extends SeleniumUtility {
		
			public OrangeHrmLogin(WebDriver driver) {
				PageFactory.initElements(driver, this);
			
			}
			@FindBy(xpath="//input[@placeholder='Username']")
			private WebElement usernameInputField;
			@FindBy(xpath="//input[@placeholder='Password']")
			private WebElement passwordInputField;
			@FindBy(className="orangehrm-login-button")
			private WebElement loginButton;
			
			public void loginInOrangeHrm(String username,String password) {
				typeInput(usernameInputField, username);
				typeInput(passwordInputField, password);
				loginButton.click();}
			
				public String hrmLoginPageTitle() {
					return getPageTitle();
			}
				public void tearDown() {
					// TODO Auto-generated method stub
					driver.quit();
				}
}