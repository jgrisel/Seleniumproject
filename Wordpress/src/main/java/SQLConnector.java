

	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.SQLException;


	public class  SQLConnector {
	    public static void  main(String[] args) throws  ClassNotFoundException, SQLException {
	//Connection URL Syntax: "jdbc:mysql://ipaddress:portnumber/db_name"
	                String dbUrl = "jdbc:mysql://localhost:3306/wordpress";

	//Database Username
	String username = "wordpress";

	//Database Password
	String password = "wordpress";

	//Query to Execute
	String query = "INSERT INTO `wp_options`(`option_value`, `autoload`) VALUES ('1','yes')";

	             //Load mysql jdbc driver
	               Class.forName("com.mysql.jdbc.Driver");

	            //Create Connection to DB
	            java.sql.Connection con = DriverManager.getConnection(dbUrl,username,password);

	          //Create Statement Object
	          java.sql.Statement stmt = con.createStatement();

	        // Execute the SQL Query. Store results in ResultSet
	          int result= stmt.executeUpdate(query);;
	          System.out.println(result+ " rows updated");
	          // While Loop to iterate through all data and print results
	/*while (rs.next()){
	        String myName = rs.getString(1);
	                            String myAge = rs.getString(2);
	                            System. out.println(rs);
	                    } */
	      // closing DB Connection
	      con.close();
	}
	}

