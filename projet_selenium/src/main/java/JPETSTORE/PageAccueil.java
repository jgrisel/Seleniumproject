package JPETSTORE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageAccueil extends BandeauMenu {
	
	@FindBy (xpath="//img[@src=\"../images/fish_icon.gif\"]") 
	 private WebElement bouton_Fish;
	@FindBy (xpath="//div[contains(text(),\"ABC\")]") 
	 private static WebElement login_ABC;
	
	public PageLogin clicSignInButton(WebDriver driver) {
		bouton_SignIn.click();
		return PageFactory.initElements(driver, PageLogin.class);
		}
	
	public PageListProduit clicFishButton(WebDriver driver) {
		bouton_Fish.click();
		return PageFactory.initElements(driver, PageListProduit.class);
		}
	public boolean SignIndisplayed(WebDriver d) {
		return d.findElement(By.xpath("//a[contains(.,'Sign In')]")).isDisplayed();
	}
	
	public static boolean Connectiondisplayed() {
		boolean presence;
		if (login_ABC.isDisplayed() 
		&& bouton_SignOut.isDisplayed()) {
			presence = true;
		}
			else {
	            presence=false;
	        }
	        return presence;
	    }
}
