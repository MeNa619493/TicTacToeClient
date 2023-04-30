package tictactoeclient;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class mainBase extends AnchorPane {

    
    protected final Button btnPlayVsComputer;
    protected final Button btnPlayVsFriend;
    protected final Button btnPlayOverTheNetwork;
    protected final Button btnGameHistory;
    

    public mainBase() {

        
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
        btnGameHistory.setPrefWidth(116.0);
        btnGameHistory.setText("Game History");
        btnGameHistory.setFont(new Font("System Bold", 14.0));

      

      
        getChildren().add(btnPlayVsComputer);
        getChildren().add(btnPlayVsFriend);
        getChildren().add(btnPlayOverTheNetwork);
        getChildren().add(btnGameHistory);
       
        setStyle("-fx-background-image: url('file:./src/Photo/bg.jpg');"
                + "-fx-background-size: cover;"
                + "-fx-background-position: center center;");
        
    }
}
