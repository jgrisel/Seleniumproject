import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import org.junit.Test;

import com.opencsv.bean.CsvToBeanBuilder;

public class CsvTest2 {
	@Test
	 public void main() throws IOException {

	        String fileName = "src\\main\\resources\\csvfile.csv";

	        List<CSV> beans = new CsvToBeanBuilder(new FileReader(fileName))
	                .withType(CSV.class)
	                .build()
	                .parse();

	        beans.forEach(System.out::println);

	    }
}

