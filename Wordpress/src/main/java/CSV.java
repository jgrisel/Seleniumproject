

	import com.opencsv.bean.CsvBindByPosition;

	public class CSV {

	    @CsvBindByPosition(position = 0)
	    private String firstName;

	    @CsvBindByPosition(position = 1)
	    private String lastName;

	    @CsvBindByPosition(position = 2)
	    private String enterprise;

	    @CsvBindByPosition(position = 3)
	    private String job;
	    
	    @CsvBindByPosition(position = 4)
	    private String adress;
	    
	    @CsvBindByPosition(position = 5)
	    private String email;
	    
	    @CsvBindByPosition(position = 6)
	    private String phoneNumber;

	   public String toString() {
		   return "firtsName=" +firstName+", lastName="+lastName+", enterprise="+enterprise+", job="+job+", adress="+adress+", email="+email+", phoneNumber="+phoneNumber;
	   }
	}
