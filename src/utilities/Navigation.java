/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

import controller.WatchVideoController;
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
    public void navigatToWatchVideo(String gameState){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/view/FxmlWatchVideo.fxml"));
            Parent root = (Parent)fxmlLoader.load();        
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
    
}
