package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage stage) {
		try {
			FXMLLoader fxmload = new FXMLLoader(getClass().getResource("/gui/MainView.fxml"));
			ScrollPane scrollpane = fxmload.load();
			
			scrollpane.setFitToHeight(true);
			scrollpane.setFitToWidth(true);
			
			
			Scene scene = new Scene(scrollpane);
			stage.setScene(scene);
			stage.setTitle("Sample JavaFX application");
			stage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
