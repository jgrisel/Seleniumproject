package JpetstoreJava;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class JpetstoreSteps {
	
	WebDriver driver;


	@Given("j'accede a l'URL de JpetStore")
	public void j_accede_a_l_URL_de_JpetStore() {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.get("https://petstore.octoperf.com/actions/Catalog.action");
	}

	@Given("Je clique sur le bouton Login")
	public void je_clique_sur_le_bouton_Login() {
		driver.findElement(By.xpath("//a[contains(.,'Sign In')]")).click();

	}

	@Given("Je saisis dans le champ username {string}")
	public void je_saisis_dans_le_champ_username(String username) throws InterruptedException {
		driver.findElement(By.xpath("//p/input[@name=\"username\"]")).clear();
		driver.findElement(By.xpath("//p/input[@name=\"username\"]")).sendKeys(username);	
	}

	@Given("Je saisis dans le champs password {string}")
	public void je_saisis_dans_le_champs_password(String password) {
		driver.findElement(By.xpath("//p/input[@name=\"password\"]")).clear();
		driver.findElement(By.xpath("//p/input[@name=\"password\"]")).sendKeys(password);
	}
	
	@Given("Je clique sur le bouton Login2")
	public void je_clique_sur_le_bouton_Login2() {
		driver.findElement(By.xpath("//input[@name=\"signon\"]")).click();	
	}
	
	@Then("Je suis connecte")
	public void je_suis_connecte() {
		boolean verif1 = driver.findElement(By.xpath("//a[@href=\"/actions/Account.action?signoff=\"]")).isDisplayed();
		assertTrue(verif1);
	}

	@Then("Le message accueil suivant est lisible {string}")
	public void Le_message_accueil_suivant_est_lisible(String user) {
		assertEquals((user),
                driver.findElement(By.xpath("//div[@id='WelcomeContent' and contains(., 'Welcome ABC!')]")).getText());
        assertTrue(
                driver.findElement(By.xpath("//div[@id='MenuContent']/a[contains(@href, 'signoff')]")).isDisplayed());
        driver.quit();

	}
}
