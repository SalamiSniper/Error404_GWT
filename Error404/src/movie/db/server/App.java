package movie.db.server;

import java.sql.*;

public class App {

	public static void main(String [] args) {
		
		Query query = new Query();
		try {
			query.getAllData().getFirst();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
		
}
