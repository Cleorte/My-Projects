import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.fxml.FXMLLoader;
import java.io.IOException;

public class App extends Application {
    public static void main(String[] args) {
        launch(args);

    }

    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
        primaryStage.setTitle("betaCalculator");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
}