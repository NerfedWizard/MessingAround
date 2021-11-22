package application;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.List;
import java.util.Random;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;

public class MainController implements Initializable {

	@FXML
	TextArea showQuote;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		JSONQuoteReader jqr = new JSONQuoteReader();
		try {
			jqr.quoteReader();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	public void lucky() throws SQLException {
		QuoteData qd = new QuoteData();
		qd.quotes();
		List<Author> list = qd.getList();
		int end = list.size();
		Random rand = new Random();
		int index = rand.nextInt(end);
		showQuote.setText("-" + list.get(index).getName() + "-\n\n" + list.get(index).getQuote());
	}
}
