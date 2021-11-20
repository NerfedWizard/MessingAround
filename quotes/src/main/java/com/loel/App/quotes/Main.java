package com.loel.App.quotes;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application {
	@FXML
	static Scene scene;
	@FXML
	static Stage mainStage;

	@Override
	public void start(Stage primaryStage) {
		mainStage = primaryStage;
		try {

			mainStage.setTitle("Choose to Inspire");
			AnchorPane root = (AnchorPane) FXMLLoader.load(getClass().getResource("MainController.fxml"));
			scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws Exception {
		launch(args);
	}
}
//@FXML
//static Scene scene;
//@FXML
//static Stage logStage;
//
//@Override
//public void start(Stage primaryStage) {
//	logStage = primaryStage;
//	try {
//
//		logStage.setTitle("Login");
//		AnchorPane root = (AnchorPane) FXMLLoader.load(getClass().getResource("FirstTest.fxml"));
//		scene = new Scene(root);
//		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
//		primaryStage.setScene(scene);
//		primaryStage.show();
//
//	} catch (Exception e) {
//		e.printStackTrace();
//	}
//}

/**
 * @param args
 */
//public static void main(String[] args) {
//	MySQLAccess.startDB();
//	launch(args);
//}