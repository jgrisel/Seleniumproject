package JPETSTORE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageListProduit extends BandeauMenu {
	
	@FindBy (xpath="//a[contains(.,\"FI-SW-01\")]")
	WebElement bouton_Product1;
	@FindBy (xpath="//td[.=\"Angelfish\"]")
	static
	WebElement produit_AngelFish;
	
	
	public PageListCategorie clicProduct1Button(WebDriver driver) {
		bouton_Product1.click();
		return PageFactory.initElements(driver, PageListCategorie.class);
		}
	public static boolean Produitdisplayed() {
		boolean presence;
		if (produit_AngelFish.isDisplayed()) {
			presence = true;
		}
			else {
	            presence=false;
	        }
	        return presence;
	    }
}
