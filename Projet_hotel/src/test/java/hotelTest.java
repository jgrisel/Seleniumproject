
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class hotelTest {
	
	hotel monHotel;
	
	@Test
	public void test1() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jgrisel\\eclipse-workspace\\Projet_hotel\\src\\main\\resources\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/TutorialHtml5HotelPhp/");
		driver.manage().window().maximize();
		
		monHotel = PageFactory.initElements(driver, hotel.class);
		monHotel.Titledisplayed(driver);
		assertEquals("HTML5 Hotel Room Booking (JavaScript/PHP)", monHotel.Titledisplayed(driver));
		
		monHotel.cellclick();
		
		driver.switchTo().frame(0);
		
		monHotel.nomResa();
		
		monHotel.saveClick();
		
		driver.switchTo().defaultContent();
		
		monHotel.clickcroix(driver);
		
		driver.quit();
	
	}
	
	@Test
	public void test2() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jgrisel\\eclipse-workspace\\Projet_hotel\\src\\main\\resources\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/TutorialHtml5HotelPhp/");
		driver.manage().window().maximize();
		
		monHotel = PageFactory.initElements(driver, hotel.class);
		monHotel.Titledisplayed(driver);
		assertEquals("HTML5 Hotel Room Booking (JavaScript/PHP)", monHotel.Titledisplayed(driver));
		
		monHotel.cellclick();
		
		driver.switchTo().frame(0);
		
		monHotel.nomResa();
		
		monHotel.saveClick();
		
		driver.switchTo().defaultContent();	
		
		monHotel.dragAndDrop(driver);
		
		Thread.sleep(2000);
		
		monHotel.Verifdisplayed(monHotel.message_update);
		
		assertTrue(monHotel.Verifdisplayed(monHotel.message_update));
		
		Thread.sleep(7000);
		
		assertFalse(monHotel.Verifdisplayed(monHotel.message_update));
		
		monHotel.clickcroix(driver);
		
		driver.quit();
	}
	
	@Test
	public void test3() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jgrisel\\eclipse-workspace\\Projet_hotel\\src\\main\\resources\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/TutorialHtml5HotelPhp/");
		driver.manage().window().maximize();
		
		monHotel = PageFactory.initElements(driver, hotel.class);
		monHotel.Titledisplayed(driver);
		assertEquals("HTML5 Hotel Room Booking (JavaScript/PHP)", monHotel.Titledisplayed(driver));
		
		monHotel.cellclick();
		
		driver.switchTo().frame(0);
		
		monHotel.nomResa();
		
		monHotel.saveClick();
		
		driver.switchTo().defaultContent();	
		
		monHotel.dragAndDrop(driver);
		
		Thread.sleep(2000);
		
		monHotel.Verifdisplayed(monHotel.message_update);
		
		assertTrue(monHotel.Verifdisplayed(monHotel.message_update));
		
		Thread.sleep(7000);
		
		assertFalse(monHotel.Verifdisplayed(monHotel.message_update));
		
		monHotel.clickcroix(driver);
		
		Thread.sleep(2000);
		
		monHotel.Verifdisplayed(monHotel.message_delete);
		
		assertTrue(monHotel.Verifdisplayed(monHotel.message_delete));
		
		Thread.sleep(7000);
		
		assertFalse(monHotel.Verifdisplayed(monHotel.message_delete));
		
		driver.quit();
	}
}
