package controller;

import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class signInBase extends AnchorPane {

    protected final Text text;
    protected final Text text0;
    protected final Button btnSignIn;
    protected final Button btnHome;
    protected final TextField tfInEmail;
    protected final PasswordField tfInPassword;

    public signInBase() {

        text = new Text();
        text0 = new Text();
        btnSignIn = new Button();
        btnHome = new Button();
        tfInEmail = new TextField();
        tfInPassword = new PasswordField();

        setId("AnchorPane");
        setPrefHeight(400.0);
        setPrefWidth(600.0);

        text.setFill(javafx.scene.paint.Color.valueOf("#0070fc"));
        text.setLayoutX(50.0);
        text.setLayoutY(140.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Email");
        text.setFont(new Font("System Bold", 24.0));

        text0.setFill(javafx.scene.paint.Color.valueOf("#0070fc"));
        text0.setLayoutX(50.0);
        text0.setLayoutY(228.0);
        text0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text0.setStrokeWidth(0.0);
        text0.setText("password");
        text0.setFont(new Font("System Bold", 24.0));

        btnSignIn.setLayoutX(154.0);
        btnSignIn.setLayoutY(278.0);
        btnSignIn.setMnemonicParsing(false);
        btnSignIn.setPrefHeight(51.0);
        btnSignIn.setPrefWidth(293.0);
        btnSignIn.setText("Sign In");
        btnSignIn.setFont(new Font("System Bold", 24.0));

        btnHome.setLayoutX(467.0);
        btnHome.setLayoutY(359.0);
        btnHome.setMnemonicParsing(false);
        btnHome.setPrefHeight(32.0);
        btnHome.setPrefWidth(120.0);
        btnHome.setText("Home");
        btnHome.setFont(new Font("System Bold", 12.0));

        tfInEmail.setLayoutX(201.0);
        tfInEmail.setLayoutY(114.0);
        tfInEmail.setPrefHeight(32.0);
        tfInEmail.setPrefWidth(355.0);
        tfInEmail.setPromptText("Enter Your Email");
        tfInEmail.setStyle("-fx-background-color: #323741; -fx-text-fill: White;");

        tfInPassword.setLayoutX(201.0);
        tfInPassword.setLayoutY(202.0);
        tfInPassword.setPrefHeight(32.0);
        tfInPassword.setPrefWidth(355.0);
        tfInPassword.setPromptText("Enter Your Password");
        tfInPassword.setStyle("-fx-background-color: #323741; -fx-text-fill: White;");

        getChildren().add(text);
        getChildren().add(text0);
        getChildren().add(btnSignIn);
        getChildren().add(btnHome);
        getChildren().add(tfInEmail);
        getChildren().add(tfInPassword);

        setStyle("-fx-background-image: url('file:./src/Photo/bg3.jpg');"
                + "-fx-background-size: cover;"
                + "-fx-background-position: center center;");
        btnSignIn.setId("myButton");
        btnHome.setId("myButton");
    }
}
