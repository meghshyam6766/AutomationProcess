package webPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import SeleniumUtility.SeleniumUtility;

public class orangeHrmCreate extends SeleniumUtility {
	public orangeHrmCreate(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(name="firstName")
	private WebElement firstNameInput;
	@FindBy(name="lastName")
	private WebElement lastNameInput;
	@FindBy(name="firstName")
	private WebElement addFirstName;
	@FindBy(xpath="//button[@type='submit']")
	private WebElement saveButton;
	
	public void createEmployee(String firstName, String lastName) {
		typeInput(firstNameInput,firstName);
		typeInput(lastNameInput,lastName);
		performClick(saveButton);
		
	}
}
