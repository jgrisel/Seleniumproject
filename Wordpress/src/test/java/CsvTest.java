import java.io.FileReader;
import java.io.IOException;

import java.util.List;

import org.junit.Test;

import com.opencsv.CSVReader;
import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.exceptions.CsvException;
import java.util.Arrays;


	public class CsvTest {
		@Test
		public void main() throws IOException, CsvException  {

	        //String fileName = "\\src\\main\\resources\\challenge.csv";
	        try (CSVReader reader = new CSVReader(new FileReader("src\\main\\resources\\csvfile.csv"))) {
	        	List<String[]> r = reader.readAll();
	            r.forEach(x -> System.out.println(Arrays.toString(x)));
	        }
		}	
		
		 public static void main(String[] args) throws IOException {

		        String fileName = "src\\main\\resources\\csvfile.csv";

		        List<CSV> beans = new CsvToBeanBuilder(new FileReader(fileName))
		                .withType(CSV.class)
		                .build()
		                .parse();

		        beans.forEach(System.out::println);

		    }
	}
