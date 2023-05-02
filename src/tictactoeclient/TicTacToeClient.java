/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoeclient;

import controller.FxmlOneVsComBase;
import controller.FxmlOneVsComputerLowBase;
import controller.FxmlOneVsOneBase;
import controller.FxmlOneVsOnlineBase;
import controller.mainBase;
import controller.chooseXOBase;
import controller.FxmlSplashBase;
import controller.SignBase;
import controller.computerLevelBase;
import controller.signInBase;
import controller.signUpBase;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Mina
 */
public class TicTacToeClient extends Application {

    public int xoFlag;

    @Override
    public void start(Stage primaryStage) {
        //root-------------------------------------------------------------------------------
        FxmlSplashBase fxmlSplashBase = new FxmlSplashBase();
        mainBase rootMain = new mainBase();
        chooseXOBase OneVsOneChooseXOroot = new chooseXOBase();
        chooseXOBase OneVsCompChooseXOroot = new chooseXOBase();
        chooseXOBase OneVsCompLowChooseXOroot = new chooseXOBase();
        SignBase signRoot = new SignBase();
        signInBase signInRoot = new signInBase();
        signUpBase signUpRoot = new signUpBase();
        computerLevelBase computerLevelRoot = new computerLevelBase();
        FxmlOneVsComputerLowBase oneVsComLowRoot = new FxmlOneVsComputerLowBase();
        FxmlOneVsOneBase oneVsOneRoot = new FxmlOneVsOneBase();
        FxmlOneVsComBase oneVsComRoot = new FxmlOneVsComBase();
        FxmlOneVsOnlineBase oneVsOnlineRoot = new FxmlOneVsOnlineBase();
        //scene------------------------------------------------------------------------------
        Scene splashScene = new Scene(fxmlSplashBase);
        Scene MainScene = new Scene(rootMain);
        Scene oneVsOneChooseXOScene = new Scene(OneVsOneChooseXOroot);
        Scene OneVsComChooseXOScene = new Scene(OneVsCompChooseXOroot);
        Scene OneVsComLowChooseXOScene = new Scene(OneVsCompLowChooseXOroot);
        Scene oneVsOneScene = new Scene(oneVsOneRoot);
        Scene oneVsComScene = new Scene(oneVsComRoot);
        Scene oneVsOnlineScene = new Scene(oneVsOnlineRoot);
        Scene signScene = new Scene(signRoot);
        Scene signInScene = new Scene(signInRoot);
        Scene signUpScene = new Scene(signUpRoot);
        Scene computerLevelScene = new Scene(computerLevelRoot);
        Scene oneVsComLowScene = new Scene(oneVsComLowRoot);
        //scene conect to button--------------------------------------------------------------
        MainScene.getStylesheets().add("file:./src/Photo/buttonStyle.css");
        oneVsOneChooseXOScene.getStylesheets().add("file:./src/Photo/buttonStyle.css");
        OneVsComChooseXOScene.getStylesheets().add("file:./src/Photo/buttonStyle.css");
        oneVsOneScene.getStylesheets().add("file:./src/Photo/buttonStyle.css");
        oneVsComScene.getStylesheets().add("file:./src/Photo/buttonStyle.css");
        oneVsOnlineScene.getStylesheets().add("file:./src/Photo/buttonStyle.css");
        signScene.getStylesheets().add("file:./src/Photo/buttonStyle.css");
        signInScene.getStylesheets().add("file:./src/Photo/buttonStyle.css");
        signUpScene.getStylesheets().add("file:./src/Photo/buttonStyle.css");
        computerLevelScene.getStylesheets().add("file:./src/Photo/buttonStyle.css");
        oneVsComLowScene.getStylesheets().add("file:./src/Photo/buttonStyle.css");
        OneVsComLowChooseXOScene.getStylesheets().add("file:./src/Photo/buttonStyle.css");
        //spalsh--------------------------------------------------------------------------------
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
        //navgtion----------------------------------------------------------------------------------
        rootMain.btnPlayVsComputer.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                primaryStage.setScene(oneVsOneChooseXOScene);
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
                primaryStage.setScene(computerLevelScene);
            }
        });
        rootMain.btnPlayOverTheNetwork.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                primaryStage.setScene(signScene);
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
        OneVsOneChooseXOroot.btnChooseO.setOnAction(new EventHandler<ActionEvent>() {
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
        OneVsCompChooseXOroot.btnChooseO.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                xoFlag = 2;
                primaryStage.setScene(oneVsComScene);
            }
        });

        OneVsCompLowChooseXOroot.btnChooseX.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                xoFlag = 1;
                primaryStage.setScene(oneVsComLowScene);
            }
        });
        OneVsCompLowChooseXOroot.btnChooseO.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                xoFlag = 2;
                primaryStage.setScene(oneVsComLowScene);
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
        signRoot.btnSignIn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                primaryStage.setScene(signInScene);
            }
        });
        signRoot.btnSignUp.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                primaryStage.setScene(signUpScene);
            }
        });
        computerLevelRoot.btnHigh.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                primaryStage.setScene(OneVsComChooseXOScene);
            }
        });
        computerLevelRoot.btnLow.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                primaryStage.setScene(OneVsComLowChooseXOScene);
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
