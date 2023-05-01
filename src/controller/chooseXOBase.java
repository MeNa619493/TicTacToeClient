package controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class chooseXOBase extends AnchorPane {

    protected final Text tvChoose;
    public final Button btnChooseX;
    public final Button btnChooseO;
    public final Button btnEndGame;
    protected final ImageView ivLine;

    public chooseXOBase() {

        tvChoose = new Text();
        btnChooseX = new Button();
        btnChooseO = new Button();
        btnEndGame = new Button();
        ivLine = new ImageView();

        setId("AnchorPane");
        setPrefHeight(400.0);
        setPrefWidth(600.0);
        setStyle("-fx-background-color: transparent;");

        tvChoose.setFill(javafx.scene.paint.Color.web("#0070fc"));
        tvChoose.setLayoutX(221.0);
        tvChoose.setLayoutY(80.0);
        tvChoose.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        tvChoose.setStrokeWidth(0.0);
        tvChoose.setText("Choose");
        tvChoose.setFont(new Font("System Bold", 48.0));

        btnChooseX.setLayoutX(125.0);
        btnChooseX.setLayoutY(131.0);
        btnChooseX.setMnemonicParsing(false);
        btnChooseX.setPrefHeight(135.0);
        btnChooseX.setPrefWidth(168.0);
        btnChooseX.setStyle("-fx-background-color: transparent;");

        btnChooseO.setLayoutX(325.0);
        btnChooseO.setLayoutY(131.0);
        btnChooseO.setMnemonicParsing(false);
        btnChooseO.setPrefHeight(135.0);
        btnChooseO.setPrefWidth(168.0);
        btnChooseO.setStyle("-fx-background-color: transparent;");

        btnEndGame.setLayoutX(500.0);
        btnEndGame.setLayoutY(350.0);
        btnEndGame.setMnemonicParsing(false);
        btnEndGame.setText("End Game");
        btnEndGame.setFont(new Font("System Bold", 12.0));

        ivLine.setFitHeight(150.0);
        ivLine.setFitWidth(10.0);
        ivLine.setLayoutX(298.0);
        ivLine.setLayoutY(124.0);
        ivLine.setPickOnBounds(true);
        ivLine.setPreserveRatio(true);

        getChildren().add(tvChoose);
        getChildren().add(btnChooseX);
        getChildren().add(btnChooseO);
        getChildren().add(btnEndGame);
        getChildren().add(ivLine);
        Image imgX = new Image("file:./src/Photo/x.png");
        ImageView viewX = new ImageView(imgX);
        viewX.setFitHeight(120);
        viewX.setPreserveRatio(true);
        btnChooseX.setGraphic(viewX);

        Image imgO = new Image("file:./src/Photo/o.png");
        ImageView viewO = new ImageView(imgO);
        viewO.setFitHeight(120);
        viewO.setPreserveRatio(true);
        btnChooseO.setGraphic(viewO);
        setStyle("-fx-background-image: url('file:./src/Photo/bg3.jpg');"
                + "-fx-background-size: cover;"
                + "-fx-background-position: center center;");
        btnEndGame.setId("myButton");
        Image imgLine = new Image("file:./src/Photo/line.png", true);
        ivLine.setImage(imgLine);
        
    }
}
