import static org.junit.Assert.assertEquals;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.dbunit.IDatabaseTester;
import org.dbunit.JdbcDatabaseTester;
import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.xml.FlatXmlDataSetBuilder;
import org.dbunit.operation.DatabaseOperation;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class Wordpresstest {
	
	private static final String DRIVER = "com.mysql.jdbc.Driver";
	private static final String JDBC_URL = "jdbc:mysql://localhost:3306/wordpress-5.9.2/wordpress/";
	private static final String USER = "wordpress";
	private static final String PASSWORD = "wordpress";
	
	@Test
	public void test() throws Exception {
		//Initialisation du driver
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\jgrisel\\eclipse-workspace\\Projet_challenge\\src\\main\\resources\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		 //aller sur le site
		driver.get("http://localhost/wordpress-5.9.2/wordpress/wp-admin/index.php");
	    driver.manage().window().maximize();
	    
	    PageConnexion page_connexion = PageFactory.initElements(driver,PageConnexion.class);
		
		
		PageAccueil page_accueil = page_connexion.connexion(driver);
		
		
		PageArticle page_article = page_accueil.CreerArticle(driver);
		
		PageFrameArticle page_frame = PageFactory.initElements(driver, PageFrameArticle.class);
		
		page_frame.closeFrame(driver);
		
		page_article.EcrireArticle(driver);
	}
			

}
