package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Rough draft for making the app for jones to see quotes
 *
 */
public class QuoteData {
	private List<Author> list;

	public void quotes() throws SQLException {
		list = new ArrayList<Author>();
		try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/funtimes", "root", "root");
				PreparedStatement preparedStatement = conn.prepareStatement("select *from quotes_first");) {
			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				String author = rs.getString(1);
				String quote = rs.getString(2);
				list.add(new Author(author, quote));
			}
		}
	}

	public List<Author> getList() {
		return list;
	}
}
