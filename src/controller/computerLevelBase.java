package controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import utilities.Navigation;

public class computerLevelBase extends AnchorPane {
    
    Navigation nav = Navigation.getInstance();

    protected final Button btnLow;
    protected final Button btnHigh;
    protected final Button btnMedium;
    protected final Button btnEndGame;
    protected final Text text;

    public computerLevelBase() {

        btnLow = new Button();
        btnHigh = new Button();
        btnMedium=new Button();
        btnEndGame = new Button();
        text = new Text();

        setId("AnchorPane");
        setPrefHeight(400.0);
        setPrefWidth(600.0);

        btnLow.setLayoutX(164.0);
        btnLow.setLayoutY(120.0);
        btnLow.setMnemonicParsing(false);
        btnLow.setPrefHeight(51.0);
        btnLow.setPrefWidth(293.0);
        btnLow.setText("Low");
        btnLow.setFont(new Font("System Bold", 24.0));

        btnHigh.setLayoutX(164.0);
        btnHigh.setLayoutY(253.0);
        btnHigh.setMnemonicParsing(false);
        btnHigh.setPrefHeight(51.0);
        btnHigh.setPrefWidth(293.0);
        btnHigh.setText("High");
        btnHigh.setFont(new Font("System Bold", 24.0));
        
        btnMedium.setLayoutX(164.0);
        btnMedium.setLayoutY(186.0);
        btnMedium.setMnemonicParsing(false);
        btnMedium.setPrefHeight(51.0);
        btnMedium.setPrefWidth(293.0);
        btnMedium.setText("Medium");
        btnMedium.setFont(new Font("System Bold", 24.0));
        
        btnEndGame.setLayoutX(462.0);
        btnEndGame.setLayoutY(353.0);
        btnEndGame.setMnemonicParsing(false);
        btnEndGame.setPrefHeight(32.0);
        btnEndGame.setPrefWidth(120.0);
        btnEndGame.setText("End Game");
        btnEndGame.setFont(new Font("System Bold", 12.0));

        text.setFill(javafx.scene.paint.Color.valueOf("#0070fc"));
        text.setLayoutX(207.0);
        text.setLayoutY(77.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Chosoe Your Level");
        text.setFont(new Font("System Bold", 24.0));

        getChildren().add(btnLow);
        getChildren().add(btnHigh);
        getChildren().add(btnEndGame);
        getChildren().add(text);
        getChildren().add(btnMedium);
        setStyle("-fx-background-image: url('file:./src/Photo/bg3.jpg');"
                + "-fx-background-size: cover;"
                + "-fx-background-position: center center;");
        btnLow.setId("myButton");
        btnHigh.setId("myButton");
        btnEndGame.setId("myButton");
        btnMedium.setId("myButton");
        
        btnHigh.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                nav.navigatToChooseXO(false, true);
            }
        });
        
        btnLow.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                nav.navigatToChooseXO(false, false);
            }
        });
        
        btnEndGame.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                nav.navigatToScene(new mainBase());
            }
        });
        
        btnMedium.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                nav.navigatToChooseXO(true, false);
            }
        });
    }
}
