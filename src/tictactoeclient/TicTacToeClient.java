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
import controller.FxmlOneVsComBase;
import controller.FxmlOneVsOneBase;
import controller.FxmlOneVsOnlineBase;
import controller.mainBase;
import controller.chooseXOBase;
import controller.FxmlSplashBase;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;
import utilities.Navigation;

/**
 *
 * @author Mina
 */
public class TicTacToeClient extends Application {

    public int xoFlag;

    @Override
    public void start(Stage primaryStage) {
        FxmlSplashBase fxmlSplashBase = new FxmlSplashBase();
        mainBase rootMain = new mainBase();
        chooseXOBase OneVsOneChooseXOroot = new chooseXOBase();
        chooseXOBase OneVsCompChooseXOroot = new chooseXOBase();
        chooseXOBase OneVsOnlineChooseXOroot = new chooseXOBase();
        FxmlOneVsOneBase oneVsOneRoot = new FxmlOneVsOneBase();
        FxmlOneVsComBase oneVsComRoot = new FxmlOneVsComBase();
        FxmlOneVsOnlineBase oneVsOnlineRoot = new FxmlOneVsOnlineBase();
        Scene splashScene = new Scene(fxmlSplashBase);
        Scene MainScene = new Scene(rootMain);
        Scene oneVsOneChooseXOScene = new Scene(OneVsOneChooseXOroot);
        Scene OneVsComChooseXOScene = new Scene(OneVsCompChooseXOroot);
        Scene OneVsOnlineChooseXOScene = new Scene(OneVsOnlineChooseXOroot);
        Scene oneVsOneScene = new Scene(oneVsOneRoot);
        Scene oneVsComScene = new Scene(oneVsComRoot);
        Scene oneVsOnlineScene = new Scene(oneVsOnlineRoot);
        MainScene.getStylesheets().add("file:./src/Photo/buttonStyle.css");
        oneVsOneChooseXOScene.getStylesheets().add("file:./src/Photo/buttonStyle.css");
        OneVsComChooseXOScene.getStylesheets().add("file:./src/Photo/buttonStyle.css");
        OneVsOnlineChooseXOScene.getStylesheets().add("file:./src/Photo/buttonStyle.css");
        oneVsOneScene.getStylesheets().add("file:./src/Photo/buttonStyle.css");
        oneVsComScene.getStylesheets().add("file:./src/Photo/buttonStyle.css");
        oneVsOnlineScene.getStylesheets().add("file:./src/Photo/buttonStyle.css");
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
        primaryStage.show();

        rootMain.btnPlayVsFriend.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                primaryStage.setScene(oneVsOneChooseXOScene);
            }
        });
        rootMain.btnPlayVsComputer.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                primaryStage.setScene(OneVsComChooseXOScene);
            }
        });
        rootMain.btnPlayOverTheNetwork.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                primaryStage.setScene(OneVsOnlineChooseXOScene);
            }
        });
        OneVsOneChooseXOroot.btnEndGame.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                primaryStage.setScene(MainScene);
            }
        });
        OneVsOneChooseXOroot.btnChooseX.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                xoFlag = 1;
                primaryStage.setScene(oneVsOneScene);
            }
        });
        OneVsOneChooseXOroot.btnChooseX.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                xoFlag = 2;
                primaryStage.setScene(oneVsOneScene);
            }
        });
        OneVsCompChooseXOroot.btnEndGame.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                primaryStage.setScene(MainScene);
            }
        });
        OneVsCompChooseXOroot.btnChooseX.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                xoFlag = 1;
                primaryStage.setScene(oneVsComScene);
            }
        });
        OneVsCompChooseXOroot.btnChooseX.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                xoFlag = 2;
                primaryStage.setScene(oneVsComScene);
            }
        });
         OneVsOnlineChooseXOroot.btnEndGame.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                primaryStage.setScene(MainScene);
            }
        });
        OneVsOnlineChooseXOroot.btnChooseX.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                xoFlag = 1;
                primaryStage.setScene(oneVsOnlineScene);
            }
        });
        OneVsOnlineChooseXOroot.btnChooseX.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                xoFlag = 2;
                primaryStage.setScene(oneVsOnlineScene);
            }
        });
        oneVsOneRoot.btnEndGame.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                primaryStage.setScene(MainScene);
            }
        });
        oneVsComRoot.btnEndGame.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                primaryStage.setScene(MainScene);
            }
        });
        oneVsOnlineRoot.btnEndGame.setOnAction(new EventHandler<ActionEvent>() {
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
