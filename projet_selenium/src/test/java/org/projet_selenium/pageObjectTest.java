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
import JPETSTORE.PageListCategorie;
import JPETSTORE.PageListProduit;
import JPETSTORE.PageLogin;
import JPETSTORE.PageShoppingCart;

public class pageObjectTest {
	
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
		
		PageListProduit page_list_produit = page_accueil_Log_In.clicFishButton(driver);
		
		boolean verif3 = PageListProduit.Produitdisplayed();
		assertTrue(PageListProduit.Produitdisplayed());
		System.out.println("verif 3 est : " + verif3);
			
		PageListCategorie page_list_categorie = page_list_produit.clicProduct1Button(driver);
		
		PageShoppingCart page_shopping_cart = page_list_categorie.clicAddToCartButton(driver);
		
		boolean verif4 = page_shopping_cart.cartdisplayed();
		assertTrue(verif4);
		System.out.println("verif 4 est : " + verif4);
		
		page_shopping_cart.change_quantite_cart("2");
		
		page_shopping_cart.checkPrice(driver);
		assertTrue(page_shopping_cart.checkPrice(driver));
		System.out.println( "Le prix total est égal au prix unitaire multiplié par deux : " + page_shopping_cart.checkPrice(driver));
		
		PageAccueil page_accueil_Log_Out = page_shopping_cart.clicSignOutButton(driver);
		
		driver.quit();
					
}
}