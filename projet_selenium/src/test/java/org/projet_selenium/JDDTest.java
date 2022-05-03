package org.projet_selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class JDDTest {
	@Test
	public void Test() throws FileNotFoundException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jgrisel\\eclipse-workspace\\projet_selenium\\src\\main\\resources\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	Properties propertyJDD = new Properties();
    propertyJDD.load(new FileInputStream("C:\\Users\\jgrisel\\eclipse-workspace\\projet_selenium\\src\\main\\resources\\JDD.properties\\JDD.properties"));
    driver.get(propertyJDD.getProperty("URL"));
    WebElement recherche = driver.findElement(By.xpath("//input[@type=\"search\"]"));
    recherche.sendKeys(propertyJDD.getProperty("words"));
	}	
}
	
