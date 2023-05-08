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
            alert.show();

            // Set the background color and text color using CSS styling
            Region region = (Region) alert.getDialogPane().lookup(".alert");
            region.setBackground(new Background(new BackgroundFill(Color.web("#0d379e"), null, null)));
          //if put styling on the alerts 
          // alert.getDialogPane().lookup(".header-panel").setStyle("-fx-background-color: #0d379e; -fx-text-fill: white;");
           // alert.getDialogPane().lookup(".content.label").setStyle("-fx-text-fill: white;");

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
