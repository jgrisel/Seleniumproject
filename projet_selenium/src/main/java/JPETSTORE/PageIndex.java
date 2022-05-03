package JPETSTORE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageIndex {
	
	@FindBy (xpath="//a[contains(.,'Enter the Store')]") 
	 private WebElement bouton_Enter;
	
	public PageAccueil clicEnterButton(WebDriver driver) {
		bouton_Enter.click();
		return PageFactory.initElements(driver, PageAccueil.class);
		}
	public void Titledisplayed(WebDriver d) {
		d.getTitle();
		System.out.println("Page title is : " + d.getTitle());
	}
}
