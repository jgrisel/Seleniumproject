package JPETSTORE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageLogin extends BandeauMenu {
	
	@FindBy (xpath="//p/input[@name=\"username\"]") 
	 private WebElement username_field;
	@FindBy(xpath ="//p/input[@name=\"password\"]") 
	private WebElement password_field;
	@FindBy(xpath = "//input[@name=\"signon\"]") 
	private WebElement submit_button;

	public PageAccueil logIn(WebDriver driver, String username, String password) {
		username_field.clear();
		username_field.sendKeys(username);
		password_field.clear();
		password_field.sendKeys(password);
		submit_button.click();
		return PageFactory.initElements(driver, PageAccueil.class);
		}
	

}
