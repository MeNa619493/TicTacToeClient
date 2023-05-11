package controller;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
//import org.json.JSONException;
//import org.json.JSONObject;
import utilities.Navigation;
import utilities.SocketHelper;

public class signUpBase extends AnchorPane {

    private SocketHelper socketClient = SocketHelper.getInstance();
    boolean sign;
    String replyMsg;
    Navigation nav = Navigation.getInstance();

    protected final Text text;
    protected final Text text0;
    protected final Button btnSignUp;
    protected final Button btnUPHome;
    protected final Text text1;
    protected final Text text2;
    protected final TextField tfUpUserName;
    protected final TextField tfUpEmail;
    protected final PasswordField tfUpPassword;
    protected final PasswordField tfUpConPassword;

    public signUpBase() {
        sign = false;

        text = new Text();
        text0 = new Text();
        btnSignUp = new Button();
        btnUPHome = new Button();
        text1 = new Text();
        text2 = new Text();
        tfUpUserName = new TextField();
        tfUpEmail = new TextField();
        tfUpPassword = new PasswordField();
        tfUpConPassword = new PasswordField();

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

        btnSignUp.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override

            public void handle(ActionEvent event) {
                String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
                Pattern pattern = Pattern.compile(regex);
                Matcher matcher = pattern.matcher(tfUpEmail.getText());
                String name = tfUpUserName.getText().trim();
                String email = tfUpEmail.getText().trim();
                String password = tfUpPassword.getText().trim();
                String passwordConfirm = tfUpConPassword.getText().trim();
                if (name.isEmpty() || email.isEmpty()
                        || password.isEmpty() || passwordConfirm.isEmpty()) {

                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("ERROR");
                    alert.setHeaderText("Empty Field");
                    alert.setContentText("please Enter your Username password and Email.");
                    alert.showAndWait();

                } else if (!matcher.matches()) {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("ERROR");

                    alert.setContentText("please Enter vaild Email.");
                    alert.showAndWait();

                } else if (password.length() < 5) {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("ERROR");
                    alert.setHeaderText("pasword Error");
                    alert.setContentText("Pasword must not less than 5.");
                    alert.showAndWait();

                } else if (!password.equals(passwordConfirm)) {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("ERROR");
                    alert.setHeaderText("pasword Error");
                    alert.setContentText("The passwords does't matches.");
                    alert.showAndWait();
                }

                socketClient.getPrintStream().println("SignUp###" + name + "###" + email + "###" + password);

                new Thread(() -> {
                    try {

                        replyMsg = socketClient.getDataInputStream().readLine();
                        StringTokenizer token = new StringTokenizer(replyMsg, "###");
                        String msg = token.nextToken();
                        if (replyMsg.equals("already signed-up")) {
                            //show alert to user
                        } else if (replyMsg.equals("Registered Successfully")) {
                            Platform.runLater(() -> {
                                nav.navigatToScene(new signInBase());
                            });
                        }

                    } catch (IOException ex) {
                        serverClosed();
                        socketClient.closeSocket();
                        Logger.getLogger(signInBase.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }).start();

            }
        });

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
        tfUpUserName.setStyle("-fx-background-color: #323741; -fx-text-fill: White;");

        tfUpEmail.setLayoutX(209.0);
        tfUpEmail.setLayoutY(102.0);
        tfUpEmail.setPrefHeight(32.0);
        tfUpEmail.setPrefWidth(355.0);
        tfUpEmail.setPromptText("Enter Your Email");
        tfUpEmail.setStyle("-fx-background-color: #323741; -fx-text-fill: White;");

        tfUpPassword.setLayoutX(209.0);
        tfUpPassword.setLayoutY(152.0);
        tfUpPassword.setPrefHeight(32.0);
        tfUpPassword.setPrefWidth(355.0);
        tfUpPassword.setPromptText("Enter Your Password");
        tfUpPassword.setStyle("-fx-background-color: #323741; -fx-text-fill: White;");

        tfUpConPassword.setLayoutX(209.0);
        tfUpConPassword.setLayoutY(212.0);
        tfUpConPassword.setPrefHeight(32.0);
        tfUpConPassword.setPrefWidth(355.0);
        tfUpConPassword.setPromptText("Enter Your Password");
        tfUpConPassword.setStyle("-fx-background-color: #323741; -fx-text-fill: White;");

        getChildren().add(text);
        getChildren().add(text0);
        getChildren().add(btnSignUp);
        getChildren().add(btnUPHome);
        getChildren().add(text1);
        getChildren().add(text2);
        getChildren().add(tfUpUserName);
        getChildren().add(tfUpEmail);
        getChildren().add(tfUpPassword);
        getChildren().add(tfUpConPassword);

        setStyle("-fx-background-image: url('file:./src/Photo/bg3.jpg');"
                + "-fx-background-size: cover;"
                + "-fx-background-position: center center;");
        btnSignUp.setId("myButton");
        btnUPHome.setId("myButton");

        btnUPHome.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                nav.navigatToScene(new mainBase());
            }
        });

    }

    private void serverClosed() {
        System.out.println("Server Colsed");

        Platform.runLater(() -> {
            ButtonType yes = new ButtonType("Yes");
            Alert alert = new Alert(Alert.AlertType.NONE);
            alert.setTitle("Server Issue");
            alert.getDialogPane().getButtonTypes().add(yes);
            alert.setHeaderText("There is issue in connection, The Available friends page will be closed");
            alert.showAndWait();
            nav.navigatToScene(new mainBase());
        });
    }
}
