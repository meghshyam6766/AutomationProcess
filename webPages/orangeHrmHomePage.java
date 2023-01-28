package webPages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import SeleniumUtility.SeleniumUtility;

public class orangeHrmHomePage extends SeleniumUtility {
	public orangeHrmHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//span[text()='PIM']")
	private WebElement clickOnPim;
	@FindBy(xpath="//button[text()=' Add ']")
	private WebElement clickOnAdd;
	@FindBy(xpath="//div[div[label[text()='Employee Name']]]/div[2]/div/div/input")
	private WebElement empSearchName;
	@FindBy(xpath="//button[text()=' Search ']")
	private WebElement searchButton;
	@FindBy(css="div>.oxd-text--span")
	private WebElement actualRes; 
	@FindBy(xpath="//a[text()='Employee List']")
	private WebElement clickOnEmployeeList;
	public void orangeHrmPim() {
		performClick(clickOnPim);
	}
	public void orangeHrmAdd() {
		performClick(clickOnAdd);
	}
	public void empSearch(String empSearch) {
		typeInput(empSearchName,empSearch);
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		performClick(searchButton);
	}
	public WebElement resultElement() {
		
		return actualRes;
	}
	public void employeeListClick() {
		performClick(clickOnEmployeeList);
	}
	
}
