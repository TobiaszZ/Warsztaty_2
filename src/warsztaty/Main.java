package warsztaty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
	// NEW => JAVA project => odznaczamy use defoult i wynieramy mejsce sklonowania
	// stworzonego przez nas repozytorium.
	// dadanie jara prawym na projekt build path =>> configure =>> liberys =>> add
	// external jar
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (Connection conn = DBUtils.getConnerction()) {

			
			
			
			
		} catch (SQLException e) {

			e.printStackTrace();

		}
	}
}
