package application;

import java.net.URL;
import java.sql.SQLException;
import java.util.List;
import java.util.Random;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class MainController implements Initializable {
//	@FXML
//	ListView<String> authorView;

//	@FXML
//	TextField searchName;
	@FXML
	TextArea showQuote;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
	}

//	public void searchedAuthors() throws SQLException {
//		QuoteData qd = new QuoteData();
//		qd.quotes();
//		List<Author> list = qd.getList();
////		System.out.println(list);
////		ObservableList<String> names = FXCollections.observableArrayList();
//		for (Author a : list) {
//			if (a.getName().equals(searchName.getText())) {
////				names.add(a.getName());
//				System.out.println(a.getName() + "\n" + a.getQuote());
//				showQuote.setText(a.getName() + "\n" + a.getQuote());
//			}
//		}
//	}

	public void lucky() throws SQLException {
		QuoteData qd = new QuoteData();
		qd.quotes();
		List<Author> list = qd.getList();
		int end = list.size();

		Random rand = new Random();
		int index = rand.nextInt(end);
		showQuote.setText(list.get(index).getName() + "\n" + list.get(index).getQuote());
	}
}
