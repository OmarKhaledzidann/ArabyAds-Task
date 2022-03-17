package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.PageBase;

public class ProductsPage extends PageBase {

	public ProductsPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(id = "add-to-cart-sauce-labs-onesie")
	WebElement SauceLabsOnesie;

	@FindBy(className = "shopping_cart_link")
	WebElement ShoppingCartIcon;

	@FindBy(className = "product_sort_container")
	WebElement sortList;

	public void addLowestProductsToCart() throws InterruptedException {
		selectitemFromList(sortList, "lohi");

		clickButton(SauceLabsOnesie);
	}

	public void viewMyCartPage() throws InterruptedException {

		clickButton(ShoppingCartIcon);

	}

}
