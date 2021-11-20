package com.loel.App.quotes;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;

public class MainController implements Initializable {
	QuotesDB quotesDB = new QuotesDB();
	@FXML
	ListView<String> authorList = new ListView<>();

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		try {
			quotesDB.quotes();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void selectAuthor() {
		ObservableList<String> names = FXCollections.observableArrayList();
		for (Author a : quotesDB.getList()) {
			names.add(a.getName());
		}
		authorList.setItems(names);
	}
}
