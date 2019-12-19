package pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class LoginPageObject extends Base {

	public LoginPageObject() {

		PageFactory.initElements(driver, this);

	}

	
	@FindBy(how = How.XPATH, using = "//a[text()='Test Environment']")
	private WebElement testEnvironmentPage;
	
	

	
		public void clickOnTestEnvironmentPage() {
			testEnvironmentPage.sendKeys(Keys.ENTER);
	}


	public String pageTitle() {

		String TekSchoolPageTitle = driver.getTitle();
		return TekSchoolPageTitle;
	}

}











