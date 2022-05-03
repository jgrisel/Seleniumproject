import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class PageConnexion {
	
@FindBy (xpath="//input[@id=\"user_login\"]")
	
	WebElement champ_login;

@FindBy (xpath="//input[@id=\"user_pass\"]")

WebElement champ_password;

@FindBy (xpath="//input[@id=\"wp-submit\"]")

WebElement bouton_connexion;

public PageAccueil connexion(WebDriver driver) {
	champ_login.sendKeys("wordpress");
	champ_password.sendKeys("wordpress");
	bouton_connexion.click();
	return PageFactory.initElements(driver, PageAccueil.class);
	}

}
