package webPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import SeleniumUtility.SeleniumUtility;

public class orangeHrmDelete extends SeleniumUtility {
	public orangeHrmDelete(WebDriver driver) {
		PageFactory.initElements(driver, this);
	} 

	@FindBy(xpath="//button[@type='submit']")
	private WebElement searchButton;
	@FindBy(css=".oxd-table-card-cell-checkbox>div>label>span")
	private WebElement checkBox;
	@FindBy(css=".oxd-table-cell-actions>*:first-child>i")
	private WebElement deleteButton;
	@FindBy(css=".orangehrm-modal-footer>*:last-child")
	private WebElement confirmDeleteOption;

	public void searchButton() {
		performClick(searchButton);
	}
	public void deleteCreated() {
		performClick(searchButton);
		performClick(checkBox);
		performClick(deleteButton);
		performClick(confirmDeleteOption);
		
	}


}

