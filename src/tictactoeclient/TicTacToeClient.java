/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoeclient;

import controller.mainBase;
import controller.FxmlSplashBase;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Mina
 */
public class TicTacToeClient extends Application {

    @Override
    public void start(Stage primaryStage) {
        FxmlSplashBase fxmlSplashBase = new FxmlSplashBase();
        mainBase rootMain = new mainBase(primaryStage);
        
        Scene splashScene = new Scene(fxmlSplashBase);
        Scene MainScene = new Scene(rootMain);
        
        MainScene.getStylesheets().add("file:./src/Photo/buttonStyle.css");
        

        try {
            primaryStage.setScene(splashScene);
            primaryStage.setResizable(false);
            primaryStage.show();
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(TicTacToeClient.class.getName()).log(Level.SEVERE, null, ex);
        }
        primaryStage.setScene(MainScene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
