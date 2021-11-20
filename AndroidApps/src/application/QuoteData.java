package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * Rough draft for making the app for jones to see quotes
 *
 */
@AllArgsConstructor
@NoArgsConstructor
public class QuoteData {
	private List<Author> list;

	public void quotes() throws SQLException {
		list = new ArrayList<>();
		try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/funtimes", "root", "root");
				PreparedStatement preparedStatement = conn.prepareStatement("select *from quotes_first");) {
			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				String author = rs.getString(1);
				String quote = rs.getString(2);
				list.add(new Author(author, quote));
			}
		}
		for (Author s : list) {
			if (s.getName().equals("Lao Tzu")) {
				System.out.println(s.toString());
			}
		}
	}

	public List<Author> getList() {
		return list;
	}
}
