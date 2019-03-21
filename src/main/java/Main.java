import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.FileInputStream;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        FileInputStream file = new FileInputStream("new.fxml");
        FXMLLoader loader = new FXMLLoader();
        primaryStage.setScene(new Scene(loader.load(file)));
        primaryStage.show();
    }
}
