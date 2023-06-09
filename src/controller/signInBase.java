package controller;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.SocketException;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import utilities.Navigation;
import utilities.SocketHelper;

public class signInBase extends AnchorPane {

    protected final Text text;
    protected final Text text0;
    protected final Button btnSignIn;
    protected final Button btnHome;
    protected final TextField tfInEmail;
    protected final PasswordField tfInPassword;
    public static String username;
    private Navigation nav = Navigation.getInstance();
    private SocketHelper socketClient = SocketHelper.getInstance();
    private Thread thread;

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
        btnSignIn.setFont(new Font(24.0));
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
        tfInEmail.setStyle("-fx-background-color: #323741;-fx-text-fill:#ffffff;");

        tfInPassword.setLayoutX(201.0);
        tfInPassword.setLayoutY(202.0);
        tfInPassword.setPrefHeight(32.0);
        tfInPassword.setPrefWidth(355.0);
        tfInPassword.setPromptText("Enter Your Password");
        tfInPassword.setStyle("-fx-background-color: #323741;-fx-text-fill:#ffffff;");

        getChildren().add(text);
        getChildren().add(text0);
        getChildren().add(btnSignIn);
        getChildren().add(btnHome);
        getChildren().add(tfInEmail);
        getChildren().add(tfInPassword);
        setStyle("-fx-background-image: url('file:./src/Photo/bgGp.jpg');"
                + "-fx-background-size: cover;"
                + "-fx-background-position: center center;");

        btnSignIn.setId("myButton");
        btnHome.setId("myButton");

        btnHome.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                nav.navigatToScene(new mainBase());
            }
        });

        btnSignIn.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String email = tfInEmail.getText().trim();
                String password = tfInPassword.getText().trim();
                if (email.isEmpty() || password.isEmpty()) {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("ERROR");
                    alert.setHeaderText("Empty Field");
                    alert.setContentText("please Enter your Username password and Email.");
                    alert.showAndWait();
                } else {
                    socketClient.getPrintStream().println("SignIn###" + email + "###" + password);
                    thread = new Thread(() -> {
                        try {
                            System.out.println("waiting for server response");
                            String replyMsg = socketClient.getDataInputStream().readLine();
                            System.out.println(replyMsg);
                            StringTokenizer token = new StringTokenizer(replyMsg, "###");
                            String msg = token.nextToken();
                            if (replyMsg.equals("Login Successful")) {
                                username = socketClient.getDataInputStream().readLine();
                                System.out.println("my username = " + username);
                                Platform.runLater(() -> {
                                    nav.navigatToScene(new AvailableFriendBase());
                                });
                            } else if (replyMsg.equals("Invalid Email or Password")) {
                                Platform.runLater(() -> {
                                    Alert alert = new Alert(Alert.AlertType.ERROR);
                                    alert.setTitle("ERROR");
                                    alert.setContentText("Invalid Email or Password.");
                                    alert.showAndWait();
                                });
                            } else if (replyMsg.equals("User Already Signed in")) {
                                Platform.runLater(() -> {
                                    Alert alert = new Alert(Alert.AlertType.ERROR);
                                    alert.setTitle("ERROR");
                                    alert.setContentText("Please try another account.");
                                    alert.showAndWait();
                                });
                            }
                        } catch (SocketException e) {
                            serverClosed();
                            e.printStackTrace();
                        } catch (IOException ex) {
                            serverClosed();
                            ex.printStackTrace();
                        }
                    });
                    thread.start();
                }
            }
        });

    }

    private void serverClosed() {
        System.out.println("Server Colsed");
        socketClient.closeSocket();
        Platform.runLater(() -> {
            ButtonType yes = new ButtonType("Yes");
            Alert alert = new Alert(Alert.AlertType.NONE);
            alert.setTitle("Server Issue");
            alert.getDialogPane().getButtonTypes().add(yes);
            alert.setHeaderText("There is issue in connection, The Game page will be closed");
            alert.showAndWait();
            nav.navigatToScene(new mainBase());
            thread.stop();
        });
    }
}
