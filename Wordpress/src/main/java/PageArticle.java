import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageArticle {
	
	@FindBy (xpath="//h1[@aria-label=\"Saisissez le titre\"]")

	WebElement champ_titre;	
	
	@FindBy (xpath="//p[@data-title=\"Paragraphe\"]")

	WebElement champ_texte;	
	
	@FindBy (xpath="//button[@class=\"components-button editor-post-publish-panel__toggle editor-post-publish-button__button is-primary\"]")

	WebElement bouton_publier;	
	
	@FindBy (xpath="//button[@class='components-button editor-post-publish-button editor-post-publish-button__button is-primary']")

	WebElement bouton_valider;	
	
	
	public void EcrireArticle(WebDriver driver) {
		champ_titre.sendKeys("monArticle");
		champ_titre.sendKeys(Keys.ENTER);
		champ_texte.sendKeys("blalbabla");
		champ_texte.sendKeys(Keys.ENTER);
		bouton_publier.click();
		bouton_valider.click();	
	}
	}
