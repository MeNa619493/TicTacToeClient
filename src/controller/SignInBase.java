package controller;

import java.net.URL;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public  class SignInBase extends AnchorPane {

    protected final TextField textField;
    protected final Text text;
    protected final TextField textField0;
    protected final Button signInBtn;
    protected final Button signUpBtn;
    protected final Button homeBtn;
    protected final Text text0;

    public SignInBase() {

        textField = new TextField();
        text = new Text();
        textField0 = new TextField();
        signInBtn = new Button();
        signUpBtn = new Button();
        homeBtn = new Button();
        text0 = new Text();

        setId("AnchorPane");
        setPrefHeight(402.0);
        setPrefWidth(502.0);
        getStyleClass().add("mainFxmlClass");
        getStylesheets().add("/sign/style.css");

        textField.setLayoutX(162.0);
        textField.setLayoutY(104.0);
        textField.setPrefHeight(29.0);
        textField.setPrefWidth(247.0);
        textField.setStyle("-fx-border-width: 2px; -fx-border-color: black;");

        text.setLayoutX(60.0);
        text.setLayoutY(124.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Email");
        text.setWrappingWidth(95.47004878520966);
        text.setFont(new Font("Eras Medium ITC", 21.0));

        textField0.setLayoutX(162.0);
        textField0.setLayoutY(170.0);
        textField0.setPrefHeight(29.0);
        textField0.setPrefWidth(247.0);
        textField0.setStyle("-fx-border-width: 2px; -fx-border-color: black;");

        signInBtn.setLayoutX(200.0);
        signInBtn.setLayoutY(233.0);
        signInBtn.setMnemonicParsing(false);
      //  signInBtn.setOnAction(this::SignIn);
        signInBtn.setPrefHeight(44.0);
        signInBtn.setPrefWidth(100.0);
        signInBtn.setStyle("-fx-background-color: white; -fx-border-radius: 0; -fx-border-color: black; -fx-border-width: 2px 5px 5px 2px; -fx-width: 99px; -fx-height: 41px;");
        signInBtn.getStyleClass().add("btn");
       // signInBtn.getStylesheets().add("/sign/../../../tic_tac_toe/src/tic_tac_toe/style.css");
        signInBtn.setText("Sign In");
        signInBtn.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        signInBtn.setTextOverrun(javafx.scene.control.OverrunStyle.WORD_ELLIPSIS);
        signInBtn.setFont(new Font(18.0));

        signUpBtn.setLayoutX(370.0);
        signUpBtn.setLayoutY(320.0);
        signUpBtn.setMnemonicParsing(false);
        //signUpBtn.setOnAction(this::switchToSignUp);
        signUpBtn.setPrefHeight(44.0);
        signUpBtn.setPrefWidth(100.0);
        signUpBtn.setStyle("-fx-background-color: white; -fx-border-radius: 0; -fx-border-color: black; -fx-border-width: 2px 5px 5px 2px; -fx-width: 99px; -fx-height: 41px;");
        signUpBtn.getStyleClass().add("btn");
        ///signUpBtn.getStylesheets().add("/sign/../../../tic_tac_toe/src/tic_tac_toe/style.css");
        signUpBtn.setText("Sign Up");
        signUpBtn.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        signUpBtn.setTextOverrun(javafx.scene.control.OverrunStyle.WORD_ELLIPSIS);
        signUpBtn.setFont(new Font(18.0));

        homeBtn.setLayoutX(32.0);
        homeBtn.setLayoutY(318.0);
        homeBtn.setMnemonicParsing(false);
        //homeBtn.setOnAction(this::switchToWinning);
        homeBtn.setPrefHeight(44.0);
        homeBtn.setPrefWidth(100.0);
        homeBtn.setStyle("-fx-background-color: white; -fx-border-radius: 0; -fx-border-color: black; -fx-border-width: 2px 5px 5px 2px; -fx-width: 99px; -fx-height: 41px;");
        homeBtn.getStyleClass().add("btn");
        //homeBtn.getStylesheets().add("/sign/../../../tic_tac_toe/src/tic_tac_toe/style.css");
        homeBtn.setText("Home");
        homeBtn.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        homeBtn.setTextOverrun(javafx.scene.control.OverrunStyle.WORD_ELLIPSIS);
        homeBtn.setFont(new Font(18.0));

        text0.setLayoutX(52.0);
        text0.setLayoutY(186.0);
        text0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text0.setStrokeWidth(0.0);
        text0.setText("Password");
        text0.setWrappingWidth(96.80341047048569);
        text0.setFont(new Font("Eras Medium ITC", 20.0));

        getChildren().add(textField);
        getChildren().add(text);
        getChildren().add(textField0);
        getChildren().add(signInBtn);
        getChildren().add(signUpBtn);
        getChildren().add(homeBtn);
        getChildren().add(text0);
 setStyle("-fx-background-image:url('file:///C:/Users/USER/Documents/NetBeansProjects/Sign/src/sign/tic%20tac%20toe.jpg');-fx-background-size:cover;");
    }

   // protected abstract void SignIn(javafx.event.ActionEvent actionEvent);

    //protected abstract void switchToSignUp(javafx.event.ActionEvent actionEvent);

    //protected abstract void switchToWinning(javafx.event.ActionEvent actionEvent);

}
