package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			AnchorPane root = (AnchorPane) FXMLLoader.load(getClass().getResource("MainApp.fxml"));
			Scene scene = new Scene(root, 335, 600);
			scene.getStylesheets().add(getClass().getResource("MainApp.fxml").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setTitle("Jones' Inspires");
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
/**
 * It's not who you are that holds you back, it's who you think you're not.
 */
