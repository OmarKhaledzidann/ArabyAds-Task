package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.PageBase;

public class CheckoutInformationPage extends PageBase {

	public CheckoutInformationPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(id = "first-name")
	WebElement firstNameTxt;

	@FindBy(id = "last-name")
	WebElement lastNameTxt;

	@FindBy(id = "postal-code")
	WebElement postalCodeTxt;

	@FindBy(id = "continue")
	WebElement continueBtn;

	public void submittingCheckoutInfo(String fName, String lName, String Code) throws InterruptedException {
		setTextElement(firstNameTxt, fName);

		setTextElement(lastNameTxt, lName);

		setTextElement(postalCodeTxt, Code);

		clickButton(continueBtn);
	}

}
