package JPETSTORE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BandeauMenu {
	
	@FindBy (xpath="//a[contains(.,'Sign In')]")
	WebElement bouton_SignIn;
	
	@FindBy (xpath="//a[@href=\"/actions/Account.action?signoff=\"]")
	static
	WebElement bouton_SignOut;
	
	@FindBy (xpath="//a[contains(text(),\"My Account\")]")
	static
	WebElement bouton_MyAccount;
	
	@FindBy (xpath="//input[@name=\"keyword\"]")
	static
	WebElement barre_Recherche;
	
	@FindBy (xpath="//input[@type=\"submit\"]")
	static
	WebElement bouton_Search;
	
	
	public PageMyAccount clicMyAccountButton(WebDriver driver) {
		bouton_MyAccount.click();
		return PageFactory.initElements(driver, PageMyAccount.class);
	}
	
	public void clicRecherche() {
		barre_Recherche.click();
		barre_Recherche.sendKeys("Dalmation");
	}
	public PageResultatRecherche clicSearchButton(WebDriver driver) {
		bouton_Search.click();
		return PageFactory.initElements(driver, PageResultatRecherche.class);
		
	}
	
	public boolean Verifdisplayed(WebElement x) {
		boolean presence;
		if (x.isDisplayed() ) 
		{
			presence = true;
		}
			else {
		           presence=false;
		       }
		       return presence;
		   }
}
