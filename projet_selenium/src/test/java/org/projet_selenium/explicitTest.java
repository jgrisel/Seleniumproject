package org.projet_selenium;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitTest {
	@SuppressWarnings("unused")
	@Test
	public void testExplicit() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jgrisel\\eclipse-workspace\\projet_selenium\\src\\main\\resources\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.get("https://katalon-demo-cura.herokuapp.com/");
		WebElement Menu = wait.until(ExpectedConditions.elementToBeClickable(By.id("menu-toggle")));
		driver.findElement(By.xpath("//a[@id=\"menu-toggle\"]")).click();
		WebElement Login = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href=\"profile.php#login\"]")));
		driver.findElement(By.xpath("//a[@href=\"profile.php#login\"]")).click();
		WebElement Loginform = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='txt-username']")));
		driver.findElement(By.xpath("//input[@id='txt-username']")).click();
		driver.findElement(By.xpath("//input[@id='txt-username']")).sendKeys("John Doe");
		WebElement Passwordform = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='txt-password']")));
		driver.findElement(By.xpath("//input[@id='txt-password']")).click();
		driver.findElement(By.xpath("//input[@id='txt-password']")).sendKeys("ThisIsNotAPassword");
		WebElement Loginbutton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='btn-login']")));
		driver.findElement(By.xpath("//button[@id='btn-login']")).click();
		driver.findElement(By.xpath("//a[@id=\"menu-toggle\"]")).click();
		driver.findElement(By.xpath("//a[@href=\"authenticate.php?logout\"]")).click();
		driver.quit();
	}
}
