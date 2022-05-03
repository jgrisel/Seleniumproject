package JPETSTORE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageListCategorie extends BandeauMenu{
	
	@FindBy (xpath="//a[@href[contains(.,\"workingItemId=EST-1\")]]")
	WebElement bouton_Add_To_Cart;

	public PageShoppingCart clicAddToCartButton(WebDriver driver) {
		bouton_Add_To_Cart.click();
		return PageFactory.initElements(driver, PageShoppingCart.class);
		}
}
