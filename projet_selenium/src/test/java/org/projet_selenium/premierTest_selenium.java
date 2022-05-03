package org.projet_selenium;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class premierTest_selenium {
	
		@ignore
		public void test() {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\jgrisel\\eclipse-workspace\\projet_selenium\\src\\main\\resources\\driver\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.get("https://latavernedutesteur.fr");
			driver.getTitle();
			System.out.println("Page title is : " + driver.getTitle());
			assertEquals("La taverne du testeur", driver.getTitle());
			
			driver.quit();
		}
		@ignore
		public void test1() {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\jgrisel\\eclipse-workspace\\projet_selenium\\src\\main\\resources\\driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://latavernedutesteur.fr");
			driver.getTitle();
			System.out.println("Page title is : " + driver.getTitle());
			assertEquals("La taverne du testeur", driver.getTitle());
			driver.quit();
		}
		@SuppressWarnings("unused")
		@Test
		public void test3() {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\jgrisel\\eclipse-workspace\\projet_selenium\\src\\main\\resources\\driver\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			//aller sur l'URL du site Petstore et vérifier le titre
			driver.get("https://petstore.octoperf.com/");
			driver.getTitle();
			System.out.println("Page title is : " + driver.getTitle());
			assertEquals("JPetStore Demo", driver.getTitle());
			//cliquer sur le bouton Enter
			driver.findElement(By.xpath("//a[contains(.,'Enter the Store')]")).click();
			//Se connecter au site en tant que j2ee/j2ee
			driver.findElement(By.xpath("//a[contains(.,'Sign In')]")).click();
			driver.findElement(By.xpath("//p/input[@name=\"username\"]")).sendKeys("j2ee");
			driver.findElement(By.xpath("//p/input[@name=\"password\"]")).clear();
			driver.findElement(By.xpath("//p/input[@name=\"password\"]")).sendKeys("j2ee");
			driver.findElement(By.xpath("//input[@name=\"signon\"]")).click();
			//vérifier la connection en tant que ABC et la présence du bouton sign out
			driver.findElement(By.xpath("//div[contains(text(),\"ABC\")]")).isDisplayed();
			driver.findElement(By.xpath("//a[contains(.,\"Sign Out\")]")).isDisplayed();
			//Sélectionner la catégorie "Fish"
			driver.findElement(By.xpath("//img[@src=\"../images/fish_icon.gif\"]")).click();
			//Vérifier que la liste des produits "Fish" est affichée
			driver.findElement(By.xpath("//td[.=\"Angelfish\"]")).isDisplayed();
			driver.findElement(By.xpath("//td[.=\"Tiger Shark\"]")).isDisplayed();
			driver.findElement(By.xpath("//td[.=\"Koi\"]")).isDisplayed();
			driver.findElement(By.xpath("//td[.=\"Goldfish\"]")).isDisplayed();
			//Sélectionner dans le produit "Angelfish" et vérifier que les articles correspondants s'affichent
			driver.findElement(By.xpath("//a[contains(.,\"FI-SW-01\")]")).click();
			driver.findElement(By.xpath("//a[@href[contains(.,\"workingItemId=EST-1\")]]")).isDisplayed();
			//Ajouter le premier article au panier et vérifier que le panier s'affiche
			driver.findElement(By.xpath("//a[@href[contains(.,\"workingItemId=EST-1\")]]")).click();
			driver.findElement(By.xpath("//h2[.=\"Shopping Cart\"]")).isDisplayed();
			//Passer la quantité du produit à deux dans le panier
			driver.findElement(By.xpath("//input[@size=\"3\"]")).click();
			driver.findElement(By.xpath("//input[@size=\"3\"]")).clear();
			driver.findElement(By.xpath("//input[@size=\"3\"]")).sendKeys("2");
			driver.findElement(By.xpath("//input[@name=\"updateCartQuantities\"]")).click();
			//vérifier que le prix total est égal au double du prix unitaire
			String prixUnitaire = driver.findElement(By.xpath("//td[.=\"$16.50\"]")).getText();
			String prixTotal = driver.findElement(By.xpath("//td[.=\"$33.00\"]")).getText();
			assertEquals(prixUnitaire,"$16.50");
			assertEquals(prixTotal,"$33.00");
			prixUnitaire = prixUnitaire.replaceAll("[$]","");
			prixTotal = prixTotal.replaceAll("[$]","");
			float prixUnitairemodif1 = Float.parseFloat(prixUnitaire);
			float prixTotalmodif1 = Float.parseFloat(prixTotal);
			assertTrue(prixTotalmodif1 == prixUnitairemodif1*2);
			driver.quit();
		}
}
