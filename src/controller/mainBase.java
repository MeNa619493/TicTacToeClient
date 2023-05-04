package controller;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class mainBase extends AnchorPane {

    protected final Button btnPlayVsComputer;
    protected final Button btnPlayVsFriend;
    protected final Button btnPlayOverTheNetwork;
    protected final Button btnGameHistory;
    
    public mainBase(Stage primaryStage) {

        btnPlayVsComputer = new Button();
        btnPlayVsFriend = new Button();
        btnPlayOverTheNetwork = new Button();
        btnGameHistory = new Button();
        
        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(400.0);
        setPrefWidth(600.0);

        btnPlayVsComputer.setLayoutX(154.0);
        btnPlayVsComputer.setLayoutY(132.0);
        btnPlayVsComputer.setMnemonicParsing(false);
        btnPlayVsComputer.setPrefHeight(51.0);
        btnPlayVsComputer.setPrefWidth(293.0);
        btnPlayVsComputer.setText("Play VS Computer");
        btnPlayVsComputer.setFont(new Font("System Bold", 24.0));

        btnPlayVsFriend.setLayoutX(154.0);
        btnPlayVsFriend.setLayoutY(201.0);
        btnPlayVsFriend.setMnemonicParsing(false);
        btnPlayVsFriend.setPrefHeight(51.0);
        btnPlayVsFriend.setPrefWidth(293.0);
        btnPlayVsFriend.setText("Play VS Friend");
        btnPlayVsFriend.setFont(new Font("System Bold", 24.0));

        btnPlayOverTheNetwork.setLayoutX(154.0);
        btnPlayOverTheNetwork.setLayoutY(272.0);
        btnPlayOverTheNetwork.setMnemonicParsing(false);
        btnPlayOverTheNetwork.setText("Play Over The Network");
        btnPlayOverTheNetwork.setFont(new Font("System Bold", 24.0));

        btnGameHistory.setLayoutX(470.0);
        btnGameHistory.setLayoutY(354.0);
        btnGameHistory.setMnemonicParsing(false);
        btnGameHistory.setPrefHeight(32.0);
        btnGameHistory.setPrefWidth(120.0);
        btnGameHistory.setText("Game History");
        btnGameHistory.setFont(new Font("System Bold", 12.0));
      
        getChildren().add(btnPlayVsComputer);
        getChildren().add(btnPlayVsFriend);
        getChildren().add(btnPlayOverTheNetwork);
        getChildren().add(btnGameHistory);
       
        setStyle("-fx-background-image: url('file:./src/Photo/bg3.jpg');"
                + "-fx-background-size: cover;"
                + "-fx-background-position: center center;");
        btnPlayVsComputer.setId("myButton");
        btnPlayVsFriend.setId("myButton");
        btnPlayOverTheNetwork.setId("myButton");
        btnGameHistory.setId("myButton");
        
        btnPlayVsFriend.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                chooseXOBase OneVsOneChooseXOroot = new chooseXOBase(primaryStage, true, false);
                Scene oneVsOneChooseXOScene = new Scene(OneVsOneChooseXOroot);
                primaryStage.setScene(oneVsOneChooseXOScene);
                oneVsOneChooseXOScene.getStylesheets().add("file:./src/Photo/buttonStyle.css");
            }
        });
        
        btnPlayVsComputer.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                computerLevelBase computerLevelRoot=new computerLevelBase(primaryStage);
                Scene computerLevelScene = new Scene(computerLevelRoot);
                computerLevelScene.getStylesheets().add("file:./src/Photo/buttonStyle.css");
                primaryStage.setScene(computerLevelScene);
            }
        });
        
        btnPlayOverTheNetwork.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                SignBase signRoot=new SignBase(primaryStage);
                Scene signScene = new Scene(signRoot);
                signScene.getStylesheets().add("file:./src/Photo/buttonStyle.css");
                primaryStage.setScene(signScene);
            }
        });
        
        btnGameHistory.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                GameHistoryBase gameHistory = new GameHistoryBase();
                Scene gameHistoryScene = new Scene(gameHistory);
                gameHistoryScene.getStylesheets().add("file:./src/Photo/buttonStyle.css");
                primaryStage.setScene(gameHistoryScene);
            }
        });
    }
}
