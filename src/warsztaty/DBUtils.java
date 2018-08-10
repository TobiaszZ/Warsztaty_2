package warsztaty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtils {
	
	// jar cfe myJar.jar myClass myClass.class
	
	
	
public static Connection getConnerction() {
		// zmienic nazwe bazy danych
	try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/exam2?useSSL=false",
			"root", "coderslab");) {
		
		
		return conn;
		
	}catch (SQLException e) {

		e.printStackTrace();
		return null;
	}
	
	
	
	
	}

}
