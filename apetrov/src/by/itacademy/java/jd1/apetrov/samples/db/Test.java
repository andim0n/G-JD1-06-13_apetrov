package by.itacademy.java.jd1.apetrov.samples.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {

	private static String url = "jdbc:postgresql://localhost:5432/cars";
	private static String username = "postgres";
	private static String password = "11"; // "1"

	public static void main(final String[] args) {
		selectAllBrands();
		createNewBrand();
		selectAllBrands();
	}

	private static void selectAllBrands() {
		// create DB connection
		try (Connection connection = DriverManager.getConnection(url, username, password);
				// use connection, create statement
				Statement statement = connection.createStatement();
				// execute query
				ResultSet resultset = statement.executeQuery("select * from brand");) {

			// read result line by line
			while (resultset.next()) {
				// parse result line
				int id = resultset.getInt("id");
				String name = resultset.getString("name");
				System.out.printf("Brand id=%s, name=%s\n", id, name);
			}

			// close connection
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private static void createNewBrand() {
		// create DB connection
		try (Connection connection = DriverManager.getConnection(url, username, password);
				// use connection, create statement
				PreparedStatement preparedStatement = connection.prepareStatement(
						"insert into brand (name) values(?)",
						Statement.RETURN_GENERATED_KEYS);) {

			preparedStatement.setString(1, "brand_" + System.currentTimeMillis());
			// execute query
			preparedStatement.executeUpdate();
			ResultSet rs = preparedStatement.getGeneratedKeys();
			if (rs.next()) {
				// Retrieve the auto generated key(s).
				int generatedId = rs.getInt(1);
				System.out.println(" brand inserted with id:" + generatedId);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}