package com.loel.App.quotes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

/**
 * Rough draft for making the app for jones to see quotes
 *
 */
public class App {


	public void quotes() throws SQLException {
		List<Author> list = new ArrayList<>();
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
				System.out.println(s);
			}
		}
	}
}
