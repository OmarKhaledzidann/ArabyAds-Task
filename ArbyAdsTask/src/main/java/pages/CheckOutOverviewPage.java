package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.PageBase;

public class CheckOutOverviewPage extends PageBase {

	public CheckOutOverviewPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(id = "finish")
	WebElement finishBtn;

	public void finishCheckout() throws InterruptedException {
		// scrolltoElement(finishBtn);
		clickButton(finishBtn);
	}

}
