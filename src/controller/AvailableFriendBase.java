package controller;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonBar.ButtonData;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.ScrollPane;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import utilities.SocketClient;
import utilities.SocketHelper;
import javafx.scene.control.Button;
import javafx.scene.control.ListCell;
import javafx.stage.StageStyle;
import javafx.util.Duration;
import utilities.Navigation;

public class AvailableFriendBase extends AnchorPane {

    private SocketHelper socketClient = SocketHelper.getInstance();
    private StringTokenizer token;
    private ObservableList<String> friendsList;
    private Thread thread;
    public Alert alert;
    private Navigation nav = Navigation.getInstance();
    public static int opponentScore;
    public static String opponentUsername;
    protected final Label label;
    protected final ScrollPane scrollPane;
    protected final ListView friendsListView;

    public AvailableFriendBase() {

        label = new Label();
        scrollPane = new ScrollPane();
        friendsListView = new ListView();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(400.0);
        setPrefWidth(600.0);

        AnchorPane.setLeftAnchor(label, 16.0);
        AnchorPane.setTopAnchor(label, 16.0);
        label.setText("Online Friends");
        label.setTextFill(javafx.scene.paint.Color.valueOf("#cf2a27"));
        label.setFont(new Font(33.0));

        AnchorPane.setBottomAnchor(scrollPane, 0.0);
        AnchorPane.setLeftAnchor(scrollPane, 50.0);
        AnchorPane.setRightAnchor(scrollPane, 50.0);
        scrollPane.setHbarPolicy(javafx.scene.control.ScrollPane.ScrollBarPolicy.NEVER);
        scrollPane.setLayoutY(77.0);
        scrollPane.setPrefHeight(323.0);
        scrollPane.setPrefWidth(600.0);
        scrollPane.setVbarPolicy(javafx.scene.control.ScrollPane.ScrollBarPolicy.NEVER);

        friendsListView.setPrefHeight(321.0);
        friendsListView.setPrefWidth(498.0);
        friendsListView.setStyle("-fx-background-color: transparent; -fx-border-color: transparent; -fx-border-width: 0;");
        scrollPane.setContent(friendsListView);

        getChildren().add(label);
        getChildren().add(scrollPane);

        setStyle("-fx-background-image: url('file:./src/Photo/bg3.jpg');"
                + "-fx-background-size: cover;"
                + "-fx-background-position: center center;");

        friendsListView.setStyle("-fx-background-color: #232832;");
        scrollPane.setStyle("-fx-color: #232832;");

        friendsListView.setCellFactory(new OnlineFriendCellFactory(new CustomCellButtonHandler() {
            @Override
            public void perform() {
                // Create the dialog with the message and buttons
                alert = new Alert(Alert.AlertType.NONE);
                alert.setTitle("Success");
                alert.setHeaderText("Empty Field");
                alert.setContentText("Your request had been sent");
                alert.showAndWait();
            }
        }));

        friendsList = FXCollections.observableArrayList();
        friendsListView.setItems(friendsList);

        socketClient.getPrintStream().println("playerlist");

        thread = new Thread(new Runnable() {
            @Override

            public void run() {
                while (true) {
                    do {
                        try {
                            String data = socketClient.getDataInputStream().readLine();
                            System.out.println(data);
                            if (data.equals("finished")) {
                                break;
                            }
                            switch (data) {
                                case "requestPlaying":
                                    recievedRequest();
                                    System.out.println("sssssssssssssssssssadsasdaasd");
                                    break;
                                case "refuse":
                                    //refuseAlert();
                                    break;
                                case "gameStarted":
                                    System.out.println("game accepted");
                                    Platform.runLater(() -> {
                                        alert.close();
                                        System.out.println("navigate");
                                        nav.navigatToScene(new FxmlOneVsOnlineBase());
                                    });
                                    //navigate
                                    break;
                                default:
                                    //System.out.println("default" + data);
                                    getOnlinefriends(data);
                            }
                        } catch (IOException ex) {
                            //serverClosed();
                        }
                    } while (true);

                    try {
                        Thread.sleep(300);
                    } catch (InterruptedException ex) {
                        thread.stop();
                    }

                }
            }
        });
        thread.start();
    }

    private void getOnlinefriends(String data) {
        //System.out.println("data in read online list :" + data);
        token = new StringTokenizer(data, "###");
        String username = token.nextToken();
        if (!signInBase.username.equals(username)) {
            if (!friendsList.contains(username)) {
                //System.out.println("Add to list");
                friendsList.add(username);
            }
        }
    }

    public void recievedRequest() throws IOException {
        String opponot = socketClient.getDataInputStream().readLine();

        System.out.println(opponot);
        Platform.runLater(() -> {
            // Code that updates the UI...

            Label messageLabel = new Label("Do you want play With " + opponot);

            // Create the Yes and No buttons
            ButtonType yesButton = new ButtonType("Yes", ButtonData.YES);
            ButtonType noButton = new ButtonType("No", ButtonData.NO);

            // Create the dialog with the message and buttons
            javafx.scene.control.Dialog<ButtonType> dialog = new javafx.scene.control.Dialog<>();
            dialog.getDialogPane().getButtonTypes().addAll(yesButton, noButton);
            dialog.getDialogPane().setContent(messageLabel);

            // Set the result converter for the dialog
            dialog.setResultConverter(buttonType -> {
                if (buttonType == yesButton) {
                    return ButtonType.YES;
                } else if (buttonType == noButton) {
                    return ButtonType.NO;
                } else {
                    return null;
                }
            });

            // Show the dialog and wait for a response
            dialog.showAndWait().ifPresent(result -> {
                if (result == ButtonType.YES) {
                    socketClient.getPrintStream().println("accept###" + signInBase.username + "###" + opponot);
                    Platform.runLater(() -> {
                        //alert.close();
                        System.out.println("Exiting...");
                        nav.navigatToScene(new FxmlOneVsOnlineBase());
                    });
                } else if (result == ButtonType.NO) {
                    System.out.println("Not exiting.");
                    socketClient.getPrintStream().println("refuse###" + opponot);
                }
            });

        });

    }

}
