package webPages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import SeleniumUtility.SeleniumUtility;



public class orangeHrmEdit extends SeleniumUtility{
	public orangeHrmEdit(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css=".oxd-table-card-cell-checkbox>div>label>span>i")
	private WebElement checkBox;
	@FindBy(css=".oxd-table-cell-actions>*:last-child>i")
	private WebElement editButton;
	@FindBy(css=".orangehrm-edit-employee-navigation>*:nth-child(2)>*:nth-child(6)")
	private WebElement jobButton;
	@FindBy(xpath="//div[div[label[text()='Job Title']]]/div[2]/div/div")
	private WebElement jobList;
	@FindBy(xpath="//div[@role='listbox']/div[3]")
	private WebElement jobSelect;
	@FindBy(xpath="//button[@type='submit']")
	private WebElement saveButton;
	@FindBy(xpath="//button[@type='submit']")
	private WebElement searchButton;
	
	
	public void performClickOptions() {
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(searchButton));
		performClick(checkBox);
		performClick(editButton);
		performClick(jobButton);
		
	}
	
	public void jobSelectList() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		performClick(jobList);
		performClick(jobSelect);
		wait.until(ExpectedConditions.elementToBeClickable(saveButton));
		performClick(saveButton);
	}
	
	}
	

