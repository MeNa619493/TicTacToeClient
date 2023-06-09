package controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import utilities.Navigation;

public  class SignBase extends AnchorPane {

    Navigation nav = Navigation.getInstance();
    
    public final Button btnSignUp;
    public final Button btnSignIn;
    public final Button btnSignHome;

    public SignBase() {

        btnSignUp = new Button();
        btnSignIn = new Button();
        btnSignHome = new Button();

        setId("AnchorPane");
        setPrefHeight(400.0);
        setPrefWidth(600.0);

        btnSignUp.setLayoutX(154.0);
        btnSignUp.setLayoutY(110.0);
        btnSignUp.setMnemonicParsing(false);
        btnSignUp.setPrefHeight(51.0);
        btnSignUp.setPrefWidth(293.0);
        btnSignUp.setText("Sign Up");
        btnSignUp.setFont(new Font(24.0));
        btnSignUp.setFont(new Font("System Bold", 24.0));

        btnSignIn.setLayoutX(154.0);
        btnSignIn.setLayoutY(190.0);
        btnSignIn.setMnemonicParsing(false);
        btnSignIn.setPrefHeight(51.0);
        btnSignIn.setPrefWidth(293.0);
        btnSignIn.setText("Sign In");
        btnSignIn.setFont(new Font(24.0));
        btnSignIn.setFont(new Font("System Bold", 24.0));

        btnSignHome.setLayoutX(457.0);
        btnSignHome.setLayoutY(349.0);
        btnSignHome.setMnemonicParsing(false);
        btnSignHome.setPrefHeight(32.0);
        btnSignHome.setPrefWidth(120.0);
        btnSignHome.setText("Home");
        btnSignHome.setFont(new Font("System Bold", 12.0));

        getChildren().add(btnSignUp);
        getChildren().add(btnSignIn);
        getChildren().add(btnSignHome);
        setStyle("-fx-background-image: url('file:./src/Photo/bgGp.jpg');"
                + "-fx-background-size: cover;"
                + "-fx-background-position: center center;");
        btnSignUp.setId("myButton");
        btnSignIn.setId("myButton");
        btnSignHome.setId("myButton");
        
        btnSignIn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                nav.navigatToScene(new signInBase());
            }
        });
        
        btnSignUp.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
               nav.navigatToScene(new signUpBase());
            }
        });
        
        btnSignHome.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                nav.navigatToScene(new mainBase());
            }
        });
    }
}
