import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BandeauMenu {

	public PageArticle CreerArticle(WebDriver driver) throws InterruptedException {
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//*[@id=\"menu-posts\"]/a/div[3]"))).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/ul/li[3]/ul/li[3]/a")).click();
		return PageFactory.initElements(driver, PageArticle.class);
	}
}
