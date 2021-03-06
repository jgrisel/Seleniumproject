package JPETSTORE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class PageMyAccount {
	
	@FindBy (xpath="//input[@value=\"Save Account Information\"]")
	WebElement bouton_Save;
	@FindBy (xpath="//input[@name=\"account.listOption\"]")
	WebElement checkbox_list;
	@FindBy (xpath="//input[@name=\"account.bannerOption\"]")
	WebElement checkbox_banner;
	@FindBy (xpath="//select[@name=\"account.languagePreference\"]")
	WebElement menu_l;
	@FindBy (xpath="//select[@name=\"account.favouriteCategoryId\"]")
	WebElement menu_c;
	@FindBy (xpath="//select/option[@value=\"japanese\"]")
	WebElement valeur_Japanese;
	@FindBy (xpath="//select/option[@value=\"REPTILES\"]")
	WebElement valeur_Reptiles;
	Select select1;
	Select select2;
	
	public void select() {
			select1 = new Select(menu_l);
			select2 = new Select(menu_c);
			menu_l.click();
			select1.selectByValue("japanese");
			menu_c.click();
			select2.selectByValue("REPTILES");
			menu_c.click();
	}
	
	public void checkbox() {
		checkbox_list.click();
		bouton_Save.click();
	}
	
	public boolean checkBoxListVerif() {
		boolean selected;
		if(!checkbox_list.isSelected()) {
			selected=true;
		}
		else {
            selected=false;
        }
        return selected;
    }
	public boolean checkBoxBannerVerif() {
		boolean selected;
		if(checkbox_banner.isSelected()) {
			selected=true;
		}
		else {
            selected=false;
        }
        return selected;
    }
	public boolean selectVerif() {
		boolean verif;
		if(select1.getFirstSelectedOption().getText().matches("japanese") && select2.getFirstSelectedOption().getText().matches("REPTILES")) {
			verif=true;
		}
		else {
            verif=false;
        }
        return verif;
	}
}
