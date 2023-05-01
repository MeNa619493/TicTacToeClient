package controller;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;

public class FxmlSplashBase extends BorderPane {

    protected final ImageView imBackGround;

    public FxmlSplashBase() {

        imBackGround = new ImageView();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(400.0);
        setPrefWidth(600.0);

        BorderPane.setAlignment(imBackGround, javafx.geometry.Pos.CENTER);
        imBackGround.setFitHeight(150.0);
        imBackGround.setFitWidth(200.0);
        imBackGround.setPickOnBounds(true);
        imBackGround.setPreserveRatio(true);
        setCenter(imBackGround);

        setStyle("-fx-background-image: url('file:./src/Photo/logo.png');"
                + "-fx-background-size: cover;"
                + "-fx-background-position: center center;");
        

    }
}
