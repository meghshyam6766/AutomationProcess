package scripts;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import SeleniumUtility.SeleniumUtility;
import webPages.OrangeHrmLogin;
import webPages.orangeHrmCreate;
import webPages.orangeHrmDelete;
import webPages.orangeHrmEdit;
import webPages.orangeHrmHomePage;

public class orangeHrmMain extends SeleniumUtility {
	OrangeHrmLogin getOrangeHrmLogin;
	orangeHrmHomePage getorangeHrmHomePage;
	orangeHrmCreate getorangeHrmCreate;
	orangeHrmEdit getorangeHrmEdit;
	orangeHrmDelete getorangeHrmDelete;
	@BeforeTest
	public void startUp() {
		WebDriver driver=setUp("chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		getOrangeHrmLogin=new OrangeHrmLogin(driver);
		getorangeHrmHomePage=new orangeHrmHomePage(driver);
		getorangeHrmCreate = new orangeHrmCreate(driver);
		getorangeHrmEdit =new orangeHrmEdit(driver);
		getorangeHrmDelete=new orangeHrmDelete(driver);
		getOrangeHrmLogin.loginInOrangeHrm("Admin", "admin123");
		getorangeHrmHomePage.orangeHrmPim();
	}
	@Test
	public void orangeHrmCreateFeature() {
		getorangeHrmHomePage.orangeHrmAdd();
		getorangeHrmCreate.createEmployee("QA", "Tester");
		getorangeHrmHomePage.orangeHrmPim();
		
	}
	@Test(dependsOnMethods="orangeHrmCreateFeature")
	public void orangeHrmEditFeature() {
		getorangeHrmHomePage.empSearch("QA");
		String ActualRes=getorangeHrmHomePage.resultElement().getText();
		String ExpectedRes="(1) Record Found";
		Assert.assertEquals(ActualRes, ExpectedRes, "Error");
		getorangeHrmEdit.performClickOptions();
		getorangeHrmEdit.jobSelectList();
		getorangeHrmHomePage.employeeListClick();
		
	}
	@Test(dependsOnMethods="orangeHrmEditFeature")
	public void orangeHrmDeleteFeature() {
		getorangeHrmHomePage.empSearch("QA");
		
		getorangeHrmDelete.deleteCreated();
	}
	@Test(dependsOnMethods="orangeHrmDeleteFeature")
	public void orangeHrmDeleteVerification() {
		getorangeHrmDelete.searchButton();
		String ActualDeleteRes=getorangeHrmHomePage.resultElement().getText();
		String ExpectedDeleteRes="No Records Found";
		Assert.assertEquals(ActualDeleteRes, ExpectedDeleteRes, "Error");
		
	}

//	@AfterTest
	//public void ends() {
		
		//getOrangeHrmLogin.tearDown();
		//}
}