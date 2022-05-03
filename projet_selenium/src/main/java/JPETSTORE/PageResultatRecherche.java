package JPETSTORE;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class PageResultatRecherche extends BandeauMenu {
	public WebElement cellIwant;
	

	public int retournerNumeroDeLigne(WebDriver driver,String s){
		int ligneCourante = 1;
		List<WebElement> l_lignes = driver.findElements(By.xpath("//table/tbody/tr"));
		for(WebElement ligne : l_lignes){
		List<WebElement> l_cell = ligne.findElements(By.xpath("td"));
		for(WebElement cell:l_cell){
		if(cell.getText().equals(s)){
		return ligneCourante;
		}
		}
		ligneCourante++;
		}
		return -1;
		}
	
	public WebElement getCellule(WebDriver driver, String s, int col){
		int numraw = retournerNumeroDeLigne(driver, s);
		cellIwant = driver.findElement(By.xpath("//table/tbody/tr["+numraw+"]/td["+col+"]" + "/b/a"));
		return cellIwant;
		}
	

	public PageListProduit clicCellButton(WebDriver driver) {
		cellIwant.click();
		return PageFactory.initElements(driver, PageListProduit.class);
		}
	
}
