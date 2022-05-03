package org.projet_selenium;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class deuxiemeTest {
	@Test
	public void testImplicit() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jgrisel\\eclipse-workspace\\projet_selenium\\src\\main\\resources\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://katalon-demo-cura.herokuapp.com/");
		driver.findElement(By.xpath("//a[@id=\"menu-toggle\"]")).click();
		driver.findElement(By.xpath("//a[@href=\"profile.php#login\"]")).click();
		
		driver.findElement(By.xpath("//input[@id='txt-username']")).click();
		driver.findElement(By.xpath("//input[@id='txt-username']")).sendKeys("John Doe");
		driver.findElement(By.xpath("//input[@id='txt-password']")).click();
		driver.findElement(By.xpath("//input[@id='txt-password']")).sendKeys("ThisIsNotAPassword");
		driver.findElement(By.xpath("//button[@id='btn-login']")).click();
		driver.findElement(By.xpath("//a[@id=\"menu-toggle\"]")).click();
		driver.findElement(By.xpath("//a[@href=\"authenticate.php?logout\"]")).click();
		driver.quit();
	}
}
