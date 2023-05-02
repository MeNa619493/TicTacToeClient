package controller;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public  class signUpBase extends AnchorPane {

    protected final Text text;
    protected final Text text0;
    public final Button btnSignUp;
    public final Button btnUPHome;
    protected final Text text1;
    protected final Text text2;
    protected final TextField tfUpUserName;
    protected final TextField tfUpPassword;
    protected final TextField tfUpEmail;
    protected final TextField tfUpConPassword;

    public signUpBase() {

        text = new Text();
        text0 = new Text();
        btnSignUp = new Button();
        btnUPHome = new Button();
        text1 = new Text();
        text2 = new Text();
        tfUpUserName = new TextField();
        tfUpPassword = new TextField();
        tfUpEmail = new TextField();
        tfUpConPassword = new TextField();

        setId("AnchorPane");
        setPrefHeight(400.0);
        setPrefWidth(600.0);

        text.setFill(javafx.scene.paint.Color.valueOf("#0070fc"));
        text.setLayoutX(40.0);
        text.setLayoutY(234.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Confirm Password");
        text.setWrappingWidth(123.9140625);
        text.setFont(new Font("System Bold", 14.0));

        text0.setFill(javafx.scene.paint.Color.valueOf("#0070fc"));
        text0.setLayoutX(40.0);
        text0.setLayoutY(178.0);
        text0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text0.setStrokeWidth(0.0);
        text0.setText("password");
        text0.setFont(new Font("System Bold", 24.0));

        btnSignUp.setLayoutX(164.0);
        btnSignUp.setLayoutY(288.0);
        btnSignUp.setMnemonicParsing(false);
        btnSignUp.setPrefHeight(51.0);
        btnSignUp.setPrefWidth(293.0);
        btnSignUp.setText("Sign Up");
        btnSignUp.setFont(new Font("System Bold", 24.0));

        btnUPHome.setLayoutX(514.0);
        btnUPHome.setLayoutY(354.0);
        btnUPHome.setMnemonicParsing(false);
        btnUPHome.setPrefHeight(32.0);
        btnUPHome.setPrefWidth(72.0);
        btnUPHome.setText("Home");
        btnUPHome.setFont(new Font("System Bold", 10.0));

        text1.setFill(javafx.scene.paint.Color.valueOf("#0070fc"));
        text1.setLayoutX(40.0);
        text1.setLayoutY(74.0);
        text1.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text1.setStrokeWidth(0.0);
        text1.setText("User Name");
        text1.setFont(new Font("System Bold", 24.0));

        text2.setFill(javafx.scene.paint.Color.valueOf("#0070fc"));
        text2.setLayoutX(40.0);
        text2.setLayoutY(126.0);
        text2.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text2.setStrokeWidth(0.0);
        text2.setText("Email");
        text2.setFont(new Font("System Bold", 24.0));

        tfUpUserName.setLayoutX(209.0);
        tfUpUserName.setLayoutY(50.0);
        tfUpUserName.setPrefHeight(32.0);
        tfUpUserName.setPrefWidth(355.0);
        tfUpUserName.setPromptText("Enter Your User Name");
        tfUpUserName.setStyle("-fx-background-color: #323741;");

        tfUpPassword.setLayoutX(209.0);
        tfUpPassword.setLayoutY(154.0);
        tfUpPassword.setPrefHeight(32.0);
        tfUpPassword.setPrefWidth(355.0);
        tfUpPassword.setPromptText("Enter Your Password");
        tfUpPassword.setStyle("-fx-background-color: #323741;");

        tfUpEmail.setLayoutX(209.0);
        tfUpEmail.setLayoutY(102.0);
        tfUpEmail.setPrefHeight(32.0);
        tfUpEmail.setPrefWidth(355.0);
        tfUpEmail.setPromptText("Enter Your Email");
        tfUpEmail.setStyle("-fx-background-color: #323741;");

        tfUpConPassword.setLayoutX(209.0);
        tfUpConPassword.setLayoutY(213.0);
        tfUpConPassword.setPrefHeight(32.0);
        tfUpConPassword.setPrefWidth(355.0);
        tfUpConPassword.setPromptText("Confirm your Password");
        tfUpConPassword.setStyle("-fx-background-color: #323741;");

        getChildren().add(text);
        getChildren().add(text0);
        getChildren().add(btnSignUp);
        getChildren().add(btnUPHome);
        getChildren().add(text1);
        getChildren().add(text2);
        getChildren().add(tfUpUserName);
        getChildren().add(tfUpPassword);
        getChildren().add(tfUpEmail);
        getChildren().add(tfUpConPassword);
        setStyle("-fx-background-image: url('file:./src/Photo/bgGp.jpg');"
                + "-fx-background-size: cover;"
                + "-fx-background-position: center center;");
        
        btnSignUp.setId("myButton");
        btnUPHome.setId("myButton");
    }
}
