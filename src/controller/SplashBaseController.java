package controller;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class SplashBaseController extends AnchorPane {

    protected final ImageView splashImage;

    public SplashBaseController() {

        splashImage = new ImageView();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(400.0);
        setPrefWidth(600.0);

        
        splashImage.setFitHeight(180.0);
        splashImage.setFitWidth(180.0);
        splashImage.setLayoutX(75.0);
        splashImage.setLayoutY(75.0);
        splashImage.setPickOnBounds(true);
        splashImage.setPreserveRatio(true);
        splashImage.setManaged(true);
        
        splashImage.fitWidthProperty().bind(widthProperty().subtract(30));
        splashImage.fitHeightProperty().bind(heightProperty().subtract(100));

        getChildren().add(splashImage);
        
        //file:./src/view/background.jpg
        Image image = new Image(getClass().getResourceAsStream("background.jpg"));
        splashImage.setImage(image);

    }
}
