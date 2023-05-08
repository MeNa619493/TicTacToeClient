package controller;

import java.io.IOException;
import java.net.Socket;
import java.util.StringTokenizer;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import utilities.SocketClient;

public class AvailableFriendBase extends AnchorPane {

    private SocketClient socketClient = SocketClient.getInstance();
    private Socket serverSocket = socketClient.getSocket();
    private StringTokenizer token;
    private ObservableList<String> friendsList;
    private Thread thread;
    boolean isListUpdated = false;
    private Alert alert;
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

        friendsListView.setCellFactory(new OnlineFriendCellFactory());

        friendsList = FXCollections.observableArrayList();
        friendsListView.setItems(friendsList);

        socketClient.getPrintStream().println("playerlist");
        isListUpdated = true;

        thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    do {
                        try {
                            String data = socketClient.getDataInputStream().readLine();
                            if (data.equals("null")) {
                                break;
                            }
                            switch (data) {
                                case "requestPlaying":
                                    //recievedRequest();
                                    break;
                                case "decline":
                                    //refuseAlert();
                                    break;
                                case "gameOn":
                                    //navigate
                                    break;
                                default:
                                    System.out.println("default" + data);
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
        System.out.println("data in read online list :" + data);
        token = new StringTokenizer(data, "###");
        String username = token.nextToken();
        if(!signInBase.username.equals(username)){
            if (!friendsList.contains(username)) {
                System.out.println("Add to list");
                friendsList.add(username);
            }
        }
    }



}
