import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class hotel {
	
	@FindBy (xpath="//*[@id=\"dp\"]/div[3]/div[3]/div/div[2]/div[1]")
	
	WebElement cellule_1;
	
	@FindBy (xpath="//input[@id=\"name\"]")
	
	WebElement case_name;
	
	@FindBy (xpath="//input[@value=\"Save\"]")
	
	WebElement bouton_save;
	
	@FindBy (xpath="//div[@class=\"scheduler_default_event_delete\"]")
	
	WebElement bouton_croix;

	@FindBy (xpath="//div[@class='scheduler_default_cell scheduler_default_cell_business'][2]")

	WebElement new_case;
	
	@FindBy (xpath="//div[@class=\"scheduler_default_message\"][contains(.,\"Update\")]")

	WebElement message_update;
	
	@FindBy (xpath="//div[@class=\"scheduler_default_message\"][contains(.,\"Deleted\")]")

	WebElement message_delete;
	
	
	public String Titledisplayed(WebDriver driver) {
		return(driver.getTitle());		
	}
	
	public void cellclick() {
		cellule_1.click();
	}
	
	public void nomResa() {
		case_name.sendKeys("resa1");
	}
	
	public void saveClick() {
		bouton_save.click();
	}
	
	public void dragAndDrop(WebDriver driver) {
		Actions a = new Actions(driver);
		a.dragAndDrop(driver.findElement(By.xpath("//*[@id=\"dp\"]/div[3]/div[3]/div/div[2]/div[1]")),driver.findElement(By.xpath("//*[@id=\"dp\"]/div[3]/div[3]/div/div[2]/div[44]")) )
		.build()
		.perform();
	}
	
	public void clickandHold(WebDriver driver) {
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//*[@id=\"dp\"]/div[3]/div[3]/div/div[2]/div[1]")))
		.clickAndHold(driver.findElement(By.xpath("//*[@id=\"dp\"]/div[3]/div[3]/div/div[2]/div[1]")))
		.moveToElement(driver.findElement(By.xpath("//*[@id=\"dp\"]/div[3]/div[3]/div/div[2]/div[44]")))
		.release(driver.findElement(By.xpath("//*[@id=\"dp\"]/div[3]/div[3]/div/div[2]/div[44]")))
		.build()
		.perform();
	}
	
	public void clickcroix(WebDriver driver) throws Exception {
		Actions a = new Actions(driver);
		a.moveToElement(new_case);
		Thread.sleep(2000);
		a.moveToElement(driver.findElement(By.xpath("//div[@class='scheduler_default_event scheduler_default_event_line0']"))).build().perform();
		a.moveToElement(driver.findElement(By.xpath("//div[@class='scheduler_default_event_delete']"))).click().build().perform();
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
