import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.io.FileInputStream;
import java.util.Properties;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class ChallengeTest {
	PageForm maPage;
	
	@Test
	public void test() throws Exception {
		//Initialisation du driver
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\jgrisel\\eclipse-workspace\\Projet_challenge\\src\\main\\resources\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		//initialiser le fichier.properties
		Properties propertyJDD = new Properties();
	    propertyJDD.load(new FileInputStream("C:\\Users\\jgrisel\\eclipse-workspace\\Projet_challenge\\src\\main\\resources\\JDD.properties\\JDD.properties"));
	    
	    //aller sur le site du challenge
	    driver.get(propertyJDD.getProperty("URL"));
	    driver.manage().window().maximize();
	    
	  //Initialisation de ma page
	  	maPage = PageFactory.initElements(driver, PageForm.class); 
	  	
	  //v�rification du titre de la page
	  	assertEquals("Rpa Challenge",maPage.Titledisplayed(driver));
	  	
	  //s�lectionner langue roumain
	  	
	  	maPage.LangSelect(driver);
	  	
	  //cliquer sur bouton Start
	    maPage.StartButton(driver);
	    
	   //v�rification chrono d�marr�
	   WebElement bouton_Round = driver.findElement(By.xpath("//button[contains(.,\"Round 1\")]"));
	   assertTrue(bouton_Round.isDisplayed());
	    
	    //Remplir formulaire 1
	    maPage.Form1(driver, propertyJDD);
	    
	    //Verification formulaire 1
	    
	    //acc�der au formulaire 2
	    maPage.SubmitButton(driver);
	    
	  //v�rification acc�s formulaire 2
	   WebElement bouton_Round2 = driver.findElement(By.xpath("//button[contains(.,\"Round 2\")]"));
	    assertTrue(bouton_Round2.isDisplayed());
	        
	  //Remplir formulaire 2
	    maPage.Form2(driver, propertyJDD);
	    
	  //acc�der au formulaire 3
	    maPage.SubmitButton(driver);
	    
	  //v�rification acc�s formulaire 3
	  WebElement bouton_Round3 = driver.findElement(By.xpath("//button[contains(.,\"Round 3\")]"));
	   assertTrue(bouton_Round3.isDisplayed());
	    
	  //Remplir formulaire 3
	    maPage.Form3(driver, propertyJDD);
	  
	  //acc�der au formulaire 4
	    maPage.SubmitButton(driver);
	    
	  //v�rification acc�s formulaire 4
	    WebElement bouton_Round4 = driver.findElement(By.xpath("//button[contains(.,\"Round 4\")]"));
	   assertTrue(bouton_Round4.isDisplayed()); 
	    
	  //Remplir formulaire 4
	    maPage.Form4(driver, propertyJDD);
	    
	    //acc�der au formulaire 5
	    maPage.SubmitButton(driver);
	    
	  //v�rification acc�s formulaire 5
	    WebElement bouton_Round5 = driver.findElement(By.xpath("//button[contains(.,\"Round 5\")]"));
	    assertTrue(bouton_Round5.isDisplayed()); 
	    
	   //Remplir formulaire 5
	    maPage.Form5(driver, propertyJDD);
	    
	   //acc�der au formulaire 6
	    maPage.SubmitButton(driver);
	    
	  //v�rification acc�s formulaire 6
	    WebElement bouton_Round6 = driver.findElement(By.xpath("//button[contains(.,\"Round 6\")]"));
	   assertTrue(bouton_Round6.isDisplayed());   
	  
	  //Remplir formulaire 6
	    maPage.Form6(driver, propertyJDD);
	    
	   //acc�der au formulaire 7
	    maPage.SubmitButton(driver);
	    
	  //v�rification acc�s formulaire 7
	   WebElement bouton_Round7 = driver.findElement(By.xpath("//button[contains(.,\"Round 7\")]"));
	   assertTrue(bouton_Round7.isDisplayed());
	    
	  //Remplir formulaire 7
	    maPage.Form7(driver, propertyJDD);
	    
	   //acc�der au formulaire 8
	    maPage.SubmitButton(driver);
	    
	  //v�rification acc�s formulaire 8
	   WebElement bouton_Round8 = driver.findElement(By.xpath("//button[contains(.,\"Round 8\")]"));
	   assertTrue(bouton_Round8.isDisplayed()); 
	    
	    //Remplir formulaire 8
	    maPage.Form8(driver, propertyJDD);
	    
	   //acc�der au formulaire 9
	    maPage.SubmitButton(driver);
	    
	  //v�rification acc�s formulaire 9
	   WebElement bouton_Round9 = driver.findElement(By.xpath("//button[contains(.,\"Round 9\")]"));
	   assertTrue(bouton_Round9.isDisplayed());
	    
	  //Remplir formulaire 9
	    maPage.Form9(driver, propertyJDD);
	    
	   //acc�der au formulaire 10
	    maPage.SubmitButton(driver);
	    
	  //v�rification acc�s formulaire 10
	   WebElement bouton_Round10 = driver.findElement(By.xpath("//button[contains(.,\"Round 10\")]"));
	   assertTrue(bouton_Round10.isDisplayed());
	    
	  //Remplir formulaire 10
	    maPage.Form10(driver, propertyJDD);
	    
	  //terminer le challenge
	    maPage.SubmitButton(driver);
	    
	  //v�rification challenge � 100 %
	   WebElement rate = driver.findElement(By.xpath("//div[contains(text(),\"100% \")]"));
	   assertTrue(rate.isDisplayed());
	   
	   maPage.takeSnapShot(driver,".\\src\\test\\target\\target\\snapshots\\resultat.png");
	    
	}
}
