import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageFrameArticle {
	
	@FindBy (xpath="//button[@aria-label=\"Fermez la boite de dialogue\"]")

	WebElement bouton_croix;
	
	public void closeFrame(WebDriver driver) {
		bouton_croix.click();
	}

}
