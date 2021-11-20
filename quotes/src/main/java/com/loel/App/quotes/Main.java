package com.loel.App.quotes;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application{

	

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Jones App");		
	}

	public static void main(String[] args) {

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