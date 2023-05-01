/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoeclient;

import controller.OneVsComputerController;
import controller.SplashBaseController;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import utilities.Navigation;

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
        rootMain.btnPlayVsComputer.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try{
                    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/view/FxmlOneVsComputer.fxml"));
                    Parent root = (Parent)fxmlLoader.load();        
                    Scene scene = new Scene(root);
                    primaryStage.setScene(scene);
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        });
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
