/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoeclient;

import controller.SplashBaseController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author Mina
 */
public class TicTacToeClient extends Application {

    @Override
    public void start(Stage primaryStage) {
        chooseXOBase ChooseXOroot = new chooseXOBase();
        mainBase rootMain = new mainBase();
        Scene MainScene = new Scene(rootMain);
        Scene chooseXOScene = new Scene(ChooseXOroot);
        primaryStage.setScene(MainScene);
        primaryStage.show();
        primaryStage.setResizable(false);
        rootMain.btnPlayVsFriend.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                primaryStage.setScene(chooseXOScene);
            }
        });
        ChooseXOroot.btnEndGame.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                primaryStage.setScene(MainScene);
            }
        });
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
