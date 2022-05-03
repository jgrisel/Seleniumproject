package org.projet_selenium;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import JPETSTORE.PageAccueil;
import JPETSTORE.PageIndex;
import JPETSTORE.PageListProduit;
import JPETSTORE.PageLogin;
import JPETSTORE.PageResultatRecherche;

public class tableauTest {
	@Test
	public void test() throws FileNotFoundException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jgrisel\\eclipse-workspace\\projet_selenium\\src\\main\\resources\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://petstore.octoperf.com/");
		driver.manage().window().maximize();
		
		
		
		PageIndex page_index = PageFactory.initElements(driver,PageIndex.class);
		
		page_index.Titledisplayed(driver);
		assertEquals("JPetStore Demo", driver.getTitle());
		
		PageAccueil page_accueil = page_index.clicEnterButton(driver);
		
		boolean verif1 = page_accueil.SignIndisplayed(driver);
		assertTrue(verif1);
		System.out.println("verif 1 est : " + verif1);
		
		PageLogin page_login = page_accueil.clicSignInButton(driver);
		
		PageAccueil page_accueil_Log_In = page_login.logIn(driver,"j2ee","j2ee");
		
		boolean verif2 = PageAccueil.Connectiondisplayed();
		assertTrue(PageAccueil.Connectiondisplayed());
		System.out.println("verif 2 est : " + verif2);
		
		page_accueil_Log_In.clicRecherche();
		
		PageResultatRecherche page_res_recherche = page_accueil_Log_In.clicSearchButton(driver);
		
		page_res_recherche.retournerNumeroDeLigne(driver,"Dalmation");
		System.out.println(page_res_recherche.retournerNumeroDeLigne(driver,"Dalmation"));
		
		page_res_recherche.getCellule(driver, "Dalmation", 2);
		assertTrue(page_res_recherche.Verifdisplayed(page_res_recherche.cellIwant));
		
		PageListProduit page_list_produit = page_res_recherche.clicCellButton(driver);
		
		driver.quit();
	}
}
