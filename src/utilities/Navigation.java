/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

import controller.FxmlOneVsComBase;
import controller.PushIpXmlClass;
import controller.VideoHistoryClass;
import controller.WatchVideoController;
import controller.chooseXOBase;
import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author Mina
 */
public class Navigation {

    private static Navigation instance = null;
    private Stage primaryStage;

    private Navigation() {
    }

    public static synchronized Navigation getInstance() {
        if (instance == null) {
            instance = new Navigation();
        }

        return instance;
    }

    public void setPrimaryStage(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    public void navigatToWatchVideo(String gameState) {
        try {
            PushIpXmlClass pushIp = new PushIpXmlClass();
            pushIp.getStylesheets().add("file:./src/Photo/buttonStyle.css");
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/view/FxmlWatchVideo.fxml"));
            Parent root = (Parent) fxmlLoader.load();
            WatchVideoController controller = fxmlLoader.getController();
            controller.setGameState(gameState);
            Scene RegisterScene = new Scene(root);
            fxmlLoader.setController(controller);

            Stage window = new Stage();
            window.initModality(Modality.APPLICATION_MODAL);
            window.setScene(RegisterScene);
            window.setMinHeight(280);
            window.setMinWidth(500);
            window.setResizable(false);
            window.show();

            window.setOnCloseRequest((event) -> {
                WatchVideoController.mediaPlayer.stop();
            });

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void navigatToScene(Parent parent) {
        Scene computerLevelScene = new Scene(parent);
        computerLevelScene.getStylesheets().add("file:./src/Photo/buttonStyle.css");
        primaryStage.setScene(computerLevelScene);
    }

    public void navigatToChooseXO(boolean isGoingToOneVsOne, boolean isHard) {
        chooseXOBase OneVsOneChooseXOroot = new chooseXOBase(isGoingToOneVsOne, isHard);
        Scene oneVsOneChooseXOScene = new Scene(OneVsOneChooseXOroot);
        primaryStage.setScene(oneVsOneChooseXOScene);
        oneVsOneChooseXOScene.getStylesheets().add("file:./src/Photo/buttonStyle.css");
    }

    public void navigatToOneVsComp(boolean isHard) {
        FxmlOneVsComBase oneVsComRoot = new FxmlOneVsComBase(isHard);
        Scene oneVsComScene = new Scene(oneVsComRoot);
        primaryStage.setScene(oneVsComScene);
        oneVsComScene.getStylesheets().add("file:./src/Photo/buttonStyle.css");
    }

    public void navigateToGameReplay(String fileName) {
        VideoHistoryClass videoHistoryRoot = new VideoHistoryClass(fileName);
        Scene videoHistoryScene = new Scene(videoHistoryRoot);
        primaryStage.setScene(videoHistoryScene);
        videoHistoryScene.getStylesheets().add("file:./src/Photo/buttonStyle.css");
    }

}
