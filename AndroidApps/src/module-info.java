module AndroidApps {
	requires javafx.controls;
	requires javafx.fxml;
	requires java.sql;
	requires lombok;
	requires javafx.base;
	
	opens application to javafx.graphics, javafx.fxml;
}
