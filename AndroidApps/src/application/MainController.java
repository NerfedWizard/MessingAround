package application;

import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextArea;

public class MainController implements Initializable {

	@FXML
	TextArea showQuote;
	@FXML
	ChoiceBox<String> chbx;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		choiceBoxList();
	}
	public void lucky() {

		int end = 0;
		Random rand = new Random();
		String choice = chbx.getValue();
		HashMap<String, List<String>> category = JSONQuoteReader.mapped.get(choice);
		List<String> authorNames = new ArrayList<>(category.keySet());
		int nameIndex = rand.nextInt(authorNames.size());
		end = category.get(authorNames.get(nameIndex)).size();
		int index = rand.nextInt(end);
		showQuote.setText(
				"-" + authorNames.get(nameIndex) + "-\n\n" + category.get(authorNames.get(nameIndex)).get(index));
	}

	public void choiceBoxList() {
		ObservableList<String> cursors = FXCollections.observableArrayList(JSONQuoteReader.set);
		chbx.setItems(cursors);
	}
}
