package org.projet_selenium;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class fluentWaitTest {
	@SuppressWarnings("unused")
	@Test
	public void testFluent() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jgrisel\\eclipse-workspace\\projet_selenium\\src\\main\\resources\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				 .withTimeout(Duration.ofSeconds(30))
				 .pollingEvery(Duration.ofMillis(250))
				 .ignoring(NoSuchElementException.class);
		driver.get("https://katalon-demo-cura.herokuapp.com/");
		driver.findElement(By.xpath("//a[@id=\"menu-toggle\"]")).click();
		driver.findElement(By.xpath("//a[@href=\"profile.php#login\"]")).click();
		WebElement Sendname = wait.until(new Function<WebDriver, WebElement>() {
		public WebElement apply(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@id='txt-username']"));
		}
		});
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
