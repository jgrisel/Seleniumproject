import java.io.FileReader;
import java.io.IOException;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import java.util.Arrays;


public class CsvTest {
	@Test
	public static void main() throws Exception  {

        String fileName = "C:\\Users\\jgrisel\\eclipse-workspace\\CSVFile\\src\\main\\resources\\challenge.csv";
        try (CSVReader reader = new CSVReader(new FileReader(fileName))) {
        	List<String[]> r = reader.readAll();
            r.forEach(x -> System.out.println(Arrays.toString(x)));
        }
	}	
}
