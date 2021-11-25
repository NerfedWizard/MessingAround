module AndroidApps {
	requires javafx.controls;
	requires javafx.fxml;
	requires java.sql;
	requires lombok;
	requires javafx.base;
	requires json.simple;

	opens application to javafx.graphics, javafx.fxml;
}