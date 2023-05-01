package controller;

import java.net.URL;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class SignUpBase extends AnchorPane {

    protected final Text text;
    protected final TextField textField;
    protected final TextField textField0;
    protected final Text text0;
    protected final TextField textField1;
    protected final Text text1;
    protected final TextField textField2;
    protected final Button button;
    protected final Text text2;

    public SignUpBase() {

        text = new Text();
        textField = new TextField();
        textField0 = new TextField();
        text0 = new Text();
        textField1 = new TextField();
        text1 = new Text();
        textField2 = new TextField();
        button = new Button();
        text2 = new Text();

        setId("AnchorPane");
        setPrefHeight(400.0);
        setPrefWidth(600.0);
        getStyleClass().add("mainFxmlClass");
        getStylesheets().add("/sign/style.css");

        text.setLayoutX(22.0);
        text.setLayoutY(196.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Password");
        text.setWrappingWidth(96.80341047048569);
        text.setFont(new Font("System", 18.0));

        textField.setLayoutX(110.0);
        textField.setLayoutY(95.0);
        textField.setPrefHeight(29.0);
        textField.setPrefWidth(395.0);
        textField.setPromptText("Enter Your Name");
        textField.setStyle("-fx-border-width: 2px; -fx-border-color: black;");
        textField.setFont(new Font("System", 12.0));

        textField0.setLayoutX(111.0);
        textField0.setLayoutY(178.0);
        textField0.setPrefHeight(31.0);
        textField0.setPrefWidth(395.0);
        textField0.setPromptText("Enter Your Password");
        textField0.setStyle("-fx-border-width: 2px; -fx-border-color: black;");
        textField0.setFont(new Font("System", 12.0));

        text0.setLayoutX(22.0);
        text0.setLayoutY(228.0);
        text0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text0.setStrokeWidth(0.0);
        text0.setText("Confirm Password");
        text0.setWrappingWidth(96.80341047048569);
        text0.setFont(new Font("System", 18.0));

        textField1.setLayoutX(111.0);
        textField1.setLayoutY(220.0);
        textField1.setPrefHeight(23.0);
        textField1.setPrefWidth(395.0);
        textField1.setPromptText("Enter Your Confirm Password");
        textField1.setStyle("-fx-border-width: 2px; -fx-border-color: black;");

        text1.setLayoutX(24.0);
        text1.setLayoutY(155.0);
        text1.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text1.setStrokeWidth(0.0);
        text1.setText("Email");
        text1.setWrappingWidth(95.47004878520966);
        text1.setFont(new Font("System", 19.0));

        textField2.setLayoutX(110.0);
        textField2.setLayoutY(137.0);
        textField2.setPrefHeight(21.0);
        textField2.setPrefWidth(395.0);
        textField2.setPromptText("Enter Your Email");
        textField2.setStyle("-fx-border-width: 2px; -fx-border-color: black;");

        button.setLayoutX(234.0);
        button.setLayoutY(295.0);
        button.setMnemonicParsing(false);
        button.setPrefHeight(44.0);
        button.setPrefWidth(100.0);
        button.setStyle("-fx-background-color: white; -fx-border-radius: 0; -fx-border-color: black; -fx-border-width: 2px 5px 5px 2px;  -fx-width: 99px; -fx-height: 41px;");
        button.getStyleClass().add("btn");
       // button.getStylesheets().add("/sign/../../../tic_tac_toe/src/tic_tac_toe/style.css");
        button.setText("Sign Up");
        button.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        button.setTextOverrun(javafx.scene.control.OverrunStyle.WORD_ELLIPSIS);
        button.setFont(new Font("System", 19.0));

        text2.setLayoutX(26.0);
        text2.setLayoutY(112.0);
        text2.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text2.setStrokeWidth(0.0);
        text2.setText("Name");
        text2.setWrappingWidth(95.47004878520966);
        text2.setFont(new Font("System", 19.0));

        getChildren().add(text);
        getChildren().add(textField);
        getChildren().add(textField0);
        getChildren().add(text0);
        getChildren().add(textField1);
        getChildren().add(text1);
        getChildren().add(textField2);
        getChildren().add(button);
        getChildren().add(text2);
   setStyle("-fx-background-image:url('file:///C:/Users/USER/Documents/NetBeansProjects/Sign/src/sign/tic%20tac%20toe.jpg');-fx-background-size:cover;");
    }
}
