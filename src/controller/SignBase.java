package controller;

import java.net.URL;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;

public  class SignBase extends AnchorPane {

    protected final Button signUpBtn;
    protected final Button signInBtn;
    protected final Button homeBtn;

    public SignBase() {

        signUpBtn = new Button();
        signInBtn = new Button();
        homeBtn = new Button();

        setId("AnchorPane");
        setPrefHeight(402.0);
        setPrefWidth(502.0);
        getStyleClass().add("mainFxmlClass");
       // getStylesheets().add("/sign/style.css");

        signUpBtn.setLayoutX(194.0);
        signUpBtn.setLayoutY(116.0);
        signUpBtn.setMnemonicParsing(false);
       // signUpBtn.setOnAction(this::switchToSignUp);
        signUpBtn.setPrefHeight(44.0);
        signUpBtn.setPrefWidth(100.0);
        signUpBtn.setStyle("-fx-background-color: white; -fx-border-radius: 0; -fx-border-color: black; -fx-border-width: 2px 5px 5px 2px; -fx-width: 99px; -fx-height: 41px;");
        signUpBtn.getStyleClass().add("btn");
        //signUpBtn.getStylesheets().add("/sign/../../../tic_tac_toe/src/tic_tac_toe/style.css");
        signUpBtn.setText("Sign Up");
        signUpBtn.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        signUpBtn.setTextOverrun(javafx.scene.control.OverrunStyle.WORD_ELLIPSIS);
        signUpBtn.setFont(new Font("System", 19.0));

        signInBtn.setLayoutX(194.0);
        signInBtn.setLayoutY(202.0);
        signInBtn.setMnemonicParsing(false);
       // signInBtn.setOnAction(this::switchToSignIn);
        signInBtn.setPrefHeight(44.0);
        signInBtn.setPrefWidth(100.0);
        signInBtn.setStyle("-fx-background-color: white;-fx-border-radius: 0; -fx-border-color: black; -fx-border-width: 2px 5px 5px 2px;  -fx-width: 99px; -fx-height: 41px;");
        signInBtn.getStyleClass().add("btn");
        //signInBtn.getStylesheets().add("/sign/../../../../GitHub/TicTacToeClient/src/tictactoeclient/style.css");
        signInBtn.setText("Sign In");
        signInBtn.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        signInBtn.setTextOverrun(javafx.scene.control.OverrunStyle.WORD_ELLIPSIS);
         signInBtn.setFont(new Font("System", 19.0));

        homeBtn.setLayoutX(369.0);
        homeBtn.setLayoutY(321.0);
        homeBtn.setMnemonicParsing(false);
       // homeBtn.setOnAction(this::switchToWinning);
        homeBtn.setPrefHeight(44.0);
        homeBtn.setPrefWidth(100.0);
        homeBtn.setStyle("-fx-background-color: white; -fx-border-radius: 0; -fx-border-color: black; -fx-border-width: 2px 5px 5px 2px;  -fx-width: 99px; -fx-height: 41px;");
        homeBtn.getStyleClass().add("btn");
        //homeBtn.getStylesheets().add("/sign/../../../tic_tac_toe/src/tic_tac_toe/style.css");
        homeBtn.setText("Home");
        homeBtn.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        homeBtn.setTextOverrun(javafx.scene.control.OverrunStyle.WORD_ELLIPSIS);
        homeBtn.setFont(new Font("System", 19.0));

        getChildren().add(signUpBtn);
        getChildren().add(signInBtn);
        getChildren().add(homeBtn);
        setStyle("-fx-background-image:url('file:///C:/Users/USER/Documents/NetBeansProjects/Sign/src/sign/tic%20tac%20toe.jpg');-fx-background-size:cover;");
    }

   // protected abstract void switchToSignUp(javafx.event.ActionEvent actionEvent);

   // protected abstract void switchToSignIn(javafx.event.ActionEvent actionEvent);

    //protected abstract void switchToWinning(javafx.event.ActionEvent actionEvent);

}
