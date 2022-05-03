package JPETSTORE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageShoppingCart extends BandeauMenu {

	@FindBy (xpath="//input[@size=\"3\"]")
	WebElement champ_quantite;
	@FindBy (xpath="//input[@name=\"updateCartQuantities\"]")
	WebElement bouton_update_quantite;
	@FindBy (xpath="//h2[.=\"Shopping Cart\"]")
	WebElement Titre_Cart;
	
	
	public void change_quantite_cart(String n) {
		champ_quantite.click();
		champ_quantite.clear();
		champ_quantite.sendKeys(n);
		bouton_update_quantite.click();
	}
	
	public PageAccueil clicSignOutButton(WebDriver driver) {
		bouton_SignOut.click();
		return PageFactory.initElements(driver, PageAccueil.class);
		}
	
	public boolean checkPrice(WebDriver d) {
		String prixUnitaire = d.findElement(By.xpath("//td[.=\"$16.50\"]")).getText();
		String prixTotal = d.findElement(By.xpath("//td[.=\"$33.00\"]")).getText();
		prixUnitaire = prixUnitaire.replaceAll("[$]","");
		prixTotal = prixTotal.replaceAll("[$]","");
		float prixUnitairemodif1 = Float.parseFloat(prixUnitaire);
		float prixTotalmodif1 = Float.parseFloat(prixTotal);
		return (prixTotalmodif1/prixUnitairemodif1 == 2);
	}
		
	public boolean cartdisplayed() {
		boolean presence;
		if (Titre_Cart.isDisplayed()) {
			presence = true;
		}
			else {
		       presence=false;
		       }
		       return presence;		
	}	
}
