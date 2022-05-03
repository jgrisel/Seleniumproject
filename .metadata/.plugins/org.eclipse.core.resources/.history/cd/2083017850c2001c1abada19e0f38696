import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.opencsv.CSVReader;
import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.exceptions.CsvException;

import junit.framework.TestCase;

public class SeleniumTest  {
	
	WebDriver driver;
	Select select;
	
@FindBy (xpath="//button[@type=\"submit\"]")
WebElement button_chercher;
WebDriverWait wait;

@Before

public void setup() throws Exception {

	//Initialisation du driver
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\jgrisel\\eclipse-workspace\\hotelwebbappselenium\\src\\main\\resources\\driver\\geckodriver.exe");
	driver = new FirefoxDriver();
	driver.get("http://localhost:8080/HotelWebapp");
    
    //aller sur le site du PROJET
    driver.manage().window().maximize();
    
}

@After
	public void teardown() {
		driver.quit();
	}

@Test
	public void testVilleParis() throws FileNotFoundException, IOException, CsvException, InterruptedException {
	wait = new WebDriverWait(driver, 15); // Explicit wait
	select = new Select(driver.findElement(By.name("ville")));
	select.selectByVisibleText("Paris");
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//option[@value=\"Paris\"]")));
	Actions a = new Actions(driver);
	a.moveToElement(driver.findElement(By.xpath("//button[@type=\"submit\"]")))
	.click().build().perform();
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[contains(text(),\"Hôtels disponibles à Paris\")]")));
	WebElement table = driver.findElement(By.xpath("//tbody"));
    // Now get all the TR elements from the table
    List<WebElement> allRows = table.findElements(By.tagName("tr"));
    List<String> result = new ArrayList<>();
    // And iterate over them, getting the cells
    for (WebElement row : allRows) {
        List<WebElement> cells = row.findElements(By.tagName("td"));
        // Print the contents of each cell
        for (WebElement cell : cells) {           
            result.add(cell.getText());
        }
    }
    System.out.println(result);

    Scanner sc = new Scanner(new File("src/main/resources/csv.csv"));
    List<String> fileCSV =new ArrayList<>();
    while (sc.hasNext())// returns a boolean value
    {
        fileCSV.add(sc.nextLine());
        System.out.println(fileCSV);
    }
    boolean isEqual = result.equals(fileCSV);
    assertTrue(isEqual);
    System.out.println("Les deux listes sont identiques : "+isEqual);
	 
}


@Test
public void testVilleLondres() throws FileNotFoundException, IOException, CsvException, InterruptedException {
wait = new WebDriverWait(driver, 15); // Explicit wait
select = new Select(driver.findElement(By.name("ville")));
select.selectByVisibleText("Londres");
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//option[@value=\"Londres\"]")));
Actions a = new Actions(driver);
a.moveToElement(driver.findElement(By.xpath("//button[@type=\"submit\"]")))
.click().build().perform();
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[contains(text(),\"Hôtels disponibles à Londres\")]")));
WebElement table = driver.findElement(By.xpath("//tbody"));
// Now get all the TR elements from the table
List<WebElement> allRows = table.findElements(By.tagName("tr"));
List<String> result = new ArrayList<>();
// And iterate over them, getting the cells
for (WebElement row : allRows) {
    List<WebElement> cells = row.findElements(By.tagName("td"));
    // Print the contents of each cell
    for (WebElement cell : cells) {           
        result.add(cell.getText());
    }
}
System.out.println(result);

Scanner sc = new Scanner(new File("src/main/resources/csvl.csv"));
List<String> fileCSV =new ArrayList<>();
while (sc.hasNext())// returns a boolean value
{
    fileCSV.add(sc.nextLine());
    System.out.println(fileCSV);
}
boolean isEqual = result.equals(fileCSV);
assertTrue(isEqual);
System.out.println("Les deux listes sont identiques : "+isEqual);
 
}


@Test
public void testVilleNewYork() throws FileNotFoundException, IOException, CsvException, InterruptedException {
wait = new WebDriverWait(driver, 15); // Explicit wait
select = new Select(driver.findElement(By.name("ville")));
select.selectByVisibleText("New York");
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//option[@value=\"New York\"]")));
Actions a = new Actions(driver);
a.moveToElement(driver.findElement(By.xpath("//button[@type=\"submit\"]")))
.click().build().perform();
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[contains(text(),\"Hôtels disponibles à New York\")]")));
WebElement table = driver.findElement(By.xpath("//tbody"));
// Now get all the TR elements from the table
List<WebElement> allRows = table.findElements(By.tagName("tr"));
List<String> result = new ArrayList<>();
// And iterate over them, getting the cells
for (WebElement row : allRows) {
    List<WebElement> cells = row.findElements(By.tagName("td"));
    // Print the contents of each cell
    for (WebElement cell : cells) {           
        result.add(cell.getText());
    }
}
System.out.println(result);

Scanner sc = new Scanner(new File("src/main/resources/csvn.csv"));
List<String> fileCSV =new ArrayList<>();
while (sc.hasNext())// returns a boolean value
{
    fileCSV.add(sc.nextLine());
    System.out.println(fileCSV);
}
boolean isEqual = result.equals(fileCSV);
assertTrue(isEqual);
System.out.println("Les deux listes sont identiques : "+isEqual);
 
}


@Test
public void testVilleTokyo() throws FileNotFoundException, IOException, CsvException, InterruptedException {
wait = new WebDriverWait(driver, 15); // Explicit wait
select = new Select(driver.findElement(By.name("ville")));
select.selectByVisibleText("Tokyo");
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//option[@value=\"Tokyo\"]")));
Actions a = new Actions(driver);
a.moveToElement(driver.findElement(By.xpath("//button[@type=\"submit\"]")))
.click().build().perform();
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[contains(text(),\"Hôtels disponibles à Tokyo\")]")));
WebElement table = driver.findElement(By.xpath("//tbody"));
// Now get all the TR elements from the table
List<WebElement> allRows = table.findElements(By.tagName("tr"));
List<String> result = new ArrayList<>();
// And iterate over them, getting the cells
for (WebElement row : allRows) {
    List<WebElement> cells = row.findElements(By.tagName("td"));
    // Print the contents of each cell
    for (WebElement cell : cells) {           
        result.add(cell.getText());
    }
}
System.out.println(result);

Scanner sc = new Scanner(new File("src/main/resources/csvt.csv"));
List<String> fileCSV =new ArrayList<>();
while (sc.hasNext())// returns a boolean value
{
    fileCSV.add(sc.nextLine());
    System.out.println(fileCSV);
}
boolean isEqual = result.equals(fileCSV);
assertTrue(isEqual);
System.out.println("Les deux listes sont identiques : "+isEqual);
 
}
}
	
