import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Region;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.util.Duration;

public class AlertDemo extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        boolean condition1 = true;
        boolean condition2 = false;

        // When "player a" asks to play:
        if (condition1) {
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Game Request");
            alert.setHeaderText("Player A is requesting to play a game with you.");
            alert.setContentText("Do you accept?");
            
            // Set IDs for the various nodes
            Region region = (Region) alert.getDialogPane().lookup(".alert");
            region.setId("my-alert");
            alert.getDialogPane().lookup(".header-panel").setId("my-header");
            alert.getDialogPane().lookup(".content.label").setId("my-content");
            
            alert.show();

            // Apply CSS styles based on the IDs
            region.setBackground(new Background(new BackgroundFill(Color.web("#0d379e"), null, null)));
            alert.getDialogPane().lookup("#my-header").setStyle("-fx-background-color: #0d379e; -fx-text-fill: white;");
            alert.getDialogPane().lookup("#my-content").setStyle("-fx-text-fill: white;");

            // Automatically close after 30 seconds
            Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(30), e -> alert.close()));
            timeline.play();
        }

        // When "mina" is busy:
        if (condition2) {
            Alert alert = new Alert(AlertType.WARNING);
            alert.setTitle("Busy Status");
            alert.setHeaderText("Mina is currently busy.");
            alert.setContentText("Please try again later.");
            alert.showAndWait();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
