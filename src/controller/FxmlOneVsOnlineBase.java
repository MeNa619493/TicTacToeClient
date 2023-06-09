package controller;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import static javax.swing.UIManager.get;
import utilities.Navigation;
import utilities.SocketHelper;
import utilities.StreamHelper;

public class FxmlOneVsOnlineBase extends AnchorPane {

    SocketHelper socket = SocketHelper.getInstance();
    PrintStream ps;
    DataInputStream dis;
    Thread thread;
    private Boolean isUserTurn = true;
    private boolean isWinner = false;
    GameState state = GameState.NONE;
    Integer compScore = 0;
    Integer userScore = 0;
    int x;
    String currentPlayer = "X";
    ArrayList<Button> btns;
    Button[][] board = new Button[3][3];
    ArrayList<Button> available = new ArrayList();
    Image imgX;
    Image imgO;
    private Navigation nav = Navigation.getInstance();

    protected final Text text;
    protected final ImageView playerScore;
    protected final Text text0;
    protected final ImageView computerScore;
    protected final StackPane stackPane;
    protected final ImageView imageView;
    protected final GridPane gridPane;
    protected final ColumnConstraints columnConstraints;
    protected final ColumnConstraints columnConstraints0;
    protected final ColumnConstraints columnConstraints1;
    protected final RowConstraints rowConstraints;
    protected final RowConstraints rowConstraints0;
    protected final RowConstraints rowConstraints1;
    protected final Button btn9;
    protected final Button btn8;
    protected final Button btn7;
    protected final Button btn6;
    protected final Button btn5;
    protected final Button btn4;
    protected final Button btn3;
    protected final Button btn2;
    protected final Button btn1;
    public final Button btnEndGame;

    public FxmlOneVsOnlineBase() {
        text = new Text();
        playerScore = new ImageView();
        text0 = new Text();
        computerScore = new ImageView();
        stackPane = new StackPane();
        imageView = new ImageView();
        gridPane = new GridPane();
        columnConstraints = new ColumnConstraints();
        columnConstraints0 = new ColumnConstraints();
        columnConstraints1 = new ColumnConstraints();
        rowConstraints = new RowConstraints();
        rowConstraints0 = new RowConstraints();
        rowConstraints1 = new RowConstraints();
        btn9 = new Button();
        btn8 = new Button();
        btn7 = new Button();
        btn6 = new Button();
        btn5 = new Button();
        btn4 = new Button();
        btn3 = new Button();
        btn2 = new Button();
        btn1 = new Button();
        btnEndGame = new Button();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(415.0);
        setPrefWidth(604.0);
        setStyle("-fx-background-color: #FFFFFF; -fx-border-color: #000000; -fx-border-radius: 15; -fx-border-insets: 15;");

        AnchorPane.setLeftAnchor(text, 24.0);
        AnchorPane.setTopAnchor(text, 16.0);
        text.setFill(javafx.scene.paint.Color.valueOf("#0070fc"));
        text.setLayoutX(45.0);
        text.setLayoutY(100.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Your Score");
        text.setFont(new Font(24.0));
        text.setTextAlignment(TextAlignment.LEFT);

        playerScore.setLayoutX(25.0);
        playerScore.setLayoutY(50.0);
        playerScore.setFitHeight(25);
        playerScore.setFitWidth(25);

        AnchorPane.setRightAnchor(text0, 24.0);
        AnchorPane.setTopAnchor(text0, 16.0);
        text0.setFill(javafx.scene.paint.Color.valueOf("#0070fc"));
        text0.setLayoutX(504.0);
        text0.setLayoutY(40.0);
        text0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text0.setStrokeWidth(0.0);
        text0.setText("Friend Score");
        text0.setFont(new Font(24.0));
        text0.setTextAlignment(TextAlignment.RIGHT);

        computerScore.setLayoutX(550.0);
        computerScore.setLayoutY(50.0);
        computerScore.setFitHeight(25);
        computerScore.setFitWidth(25);

        if (AvailableFriendBase.XorO == true) {
            imgX = new Image("file:./src/Photo/x2.png");
            imgO = new Image("file:./src/Photo/o2.png");
            playerScore.setImage(imgX);
            computerScore.setImage(imgO);
        } else {
            imgX = new Image("file:./src/Photo/x2.png");
            imgO = new Image("file:./src/Photo/o2.png");
            playerScore.setImage(imgO);
            computerScore.setImage(imgX);
        }

        stackPane.setLayoutX(133.0);
        stackPane.setLayoutY(64.0);
        stackPane.setPrefHeight(309.0);
        stackPane.setPrefWidth(303.0);

        imageView.setFitHeight(318.0);
        imageView.setFitWidth(335.0);
        imageView.setPickOnBounds(true);
        imageView.setImage(new Image(getClass().getResource("/Photo/graph.png").toExternalForm()));

        StackPane.setAlignment(gridPane, javafx.geometry.Pos.CENTER);
        gridPane.setPrefHeight(318.0);
        gridPane.setPrefWidth(302.0);

        columnConstraints.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints.setMaxWidth(112.0);
        columnConstraints.setMinWidth(10.0);
        columnConstraints.setPrefWidth(112.0);

        columnConstraints0.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints0.setMaxWidth(111.0);
        columnConstraints0.setMinWidth(10.0);
        columnConstraints0.setPrefWidth(111.0);

        columnConstraints1.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints1.setMaxWidth(128.0);
        columnConstraints1.setMinWidth(10.0);
        columnConstraints1.setPrefWidth(112.0);

        rowConstraints.setMinHeight(10.0);
        rowConstraints.setPrefHeight(30.0);
        rowConstraints.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints0.setMinHeight(10.0);
        rowConstraints0.setPrefHeight(30.0);
        rowConstraints0.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints1.setMinHeight(10.0);
        rowConstraints1.setPrefHeight(30.0);
        rowConstraints1.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        GridPane.setColumnIndex(btn9, 2);
        GridPane.setRowIndex(btn9, 2);
        btn9.setMnemonicParsing(false);
        btn9.setPrefHeight(100.0);
        btn9.setPrefWidth(108.0);
        btn9.setStyle("-fx-background-color: transparent;");
        btn9.setFont(new Font("Phosphate Inline", 46.0));

        GridPane.setColumnIndex(btn8, 1);
        GridPane.setRowIndex(btn8, 2);
        btn8.setMnemonicParsing(false);
        btn8.setPrefHeight(100.0);
        btn8.setPrefWidth(108.0);
        btn8.setStyle("-fx-background-color: transparent;");
        btn8.setFont(new Font("Phosphate Inline", 46.0));

        GridPane.setRowIndex(btn7, 2);
        btn7.setMnemonicParsing(false);
        btn7.setPrefHeight(100.0);
        btn7.setPrefWidth(109.0);
        btn7.setStyle("-fx-background-color: transparent;");
        btn7.setFont(new Font("Phosphate Inline", 46.0));

        GridPane.setColumnIndex(btn6, 2);
        GridPane.setRowIndex(btn6, 1);
        btn6.setMnemonicParsing(false);
        btn6.setPrefHeight(100.0);
        btn6.setPrefWidth(111.0);
        btn6.setStyle("-fx-background-color: transparent;");
        btn6.setFont(new Font("Phosphate Inline", 46.0));

        GridPane.setColumnIndex(btn5, 1);
        GridPane.setRowIndex(btn5, 1);
        btn5.setMnemonicParsing(false);
        btn5.setPrefHeight(100.0);
        btn5.setPrefWidth(107.0);
        btn5.setStyle("-fx-background-color: transparent;");
        btn5.setFont(new Font("Phosphate Inline", 46.0));

        GridPane.setRowIndex(btn4, 1);
        btn4.setMnemonicParsing(false);
        btn4.setPrefHeight(100.0);
        btn4.setPrefWidth(107.0);
        btn4.setStyle("-fx-background-color: transparent;");
        btn4.setFont(new Font("Phosphate Inline", 46.0));

        GridPane.setColumnIndex(btn3, 2);
        btn3.setMnemonicParsing(false);
        btn3.setPrefHeight(100.0);
        btn3.setPrefWidth(110.0);
        btn3.setStyle("-fx-background-color: transparent;");
        btn3.setFont(new Font("Phosphate Inline", 46.0));

        GridPane.setColumnIndex(btn2, 1);
        btn2.setMnemonicParsing(false);
        btn2.setPrefHeight(100.0);
        btn2.setPrefWidth(106.0);
        btn2.setStyle("-fx-background-color: transparent;");
        btn2.setFont(new Font("Phosphate Inline", 46.0));

        btn1.setMnemonicParsing(false);
        btn1.setPrefHeight(100.0);
        btn1.setPrefWidth(106.0);
        btn1.setStyle("-fx-background-color: transparent;");
        btn1.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        btn1.setWrapText(true);
        btn1.setFont(new Font("Phosphate Inline", 50.0));

        AnchorPane.setBottomAnchor(btnEndGame, 20.0);
        AnchorPane.setRightAnchor(btnEndGame, 20.0);
        btnEndGame.setLayoutX(514.0);
        btnEndGame.setLayoutY(12.0);
        btnEndGame.setMnemonicParsing(false);
        btnEndGame.setText("End Game");
        btnEndGame.setFont(new Font(14.0));

        getChildren().add(text);
        getChildren().add(playerScore);
        getChildren().add(text0);
        getChildren().add(computerScore);
        stackPane.getChildren().add(imageView);
        gridPane.getColumnConstraints().add(columnConstraints);
        gridPane.getColumnConstraints().add(columnConstraints0);
        gridPane.getColumnConstraints().add(columnConstraints1);
        gridPane.getRowConstraints().add(rowConstraints);
        gridPane.getRowConstraints().add(rowConstraints0);
        gridPane.getRowConstraints().add(rowConstraints1);
        gridPane.getChildren().add(btn9);
        gridPane.getChildren().add(btn8);
        gridPane.getChildren().add(btn7);
        gridPane.getChildren().add(btn6);
        gridPane.getChildren().add(btn5);
        gridPane.getChildren().add(btn4);
        gridPane.getChildren().add(btn3);
        gridPane.getChildren().add(btn2);
        gridPane.getChildren().add(btn1);
        stackPane.getChildren().add(gridPane);
        getChildren().add(stackPane);
        getChildren().add(btnEndGame);

        btnEndGame.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                nav.navigatToScene(new AvailableFriendBase());
            }
        });

        text.setText(signInBase.username);
        if (AvailableFriendBase.vsPlayer != null) {
            text0.setText(AvailableFriendBase.vsPlayer);
        } else {
            text0.setText(OnlineFriendCellController.opponant);
        }

        setStyle("-fx-background-image: url('file:./src/Photo/bgGp.jpg');"
                + "-fx-background-size: cover;"
                + "-fx-background-position: center center;");
        btnEndGame.setId("myButton");

        btnEndGame.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ButtonType yes = new ButtonType("Yes");
                ButtonType no = new ButtonType("NO", ButtonBar.ButtonData.CANCEL_CLOSE);
                Alert a = new Alert(Alert.AlertType.NONE);
                a.setTitle("Alert");
                a.getDialogPane().getButtonTypes().addAll(yes, no);
                a.setHeaderText("Are you sure you want to exit the game?");
                a.showAndWait();

                if (a.getResult() == yes) {
                    System.out.println("Send to server to exit");
                    if (AvailableFriendBase.vsPlayer != null) {
                        socket.getPrintStream().println("withdraw###" + AvailableFriendBase.vsPlayer);
                    } else {
                        socket.getPrintStream().println("withdraw###" + OnlineFriendCellController.opponant);
                    }
                    socket.getPrintStream().println("available###" + signInBase.username);
                    thread.stop();
                    nav.navigatToScene(new AvailableFriendBase());
                }
            }
        });

        if (AvailableFriendBase.XorO == true) {
            x = 1;
        } else {
            x = 2;
        }

        createFile();
        btns = new ArrayList<>(Arrays.asList(btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9));
        intalizeButtons();
        intalizeBorad();
        intalizeAvailablePlaces();
        ps = socket.getPrintStream();
        dis = socket.getDataInputStream();
        if (x % 2 == 0) {
            disableButton();
        }

        thread = new Thread(new Runnable() {
            @Override

            public void run() {
                while (true) {

                    try {
                        String data = socket.getDataInputStream().readLine().trim();
                        System.out.println(data);
                        switch (data) {
                            case "game":
                                String buttonFromSever = socket.getDataInputStream().readLine();
                                Platform.runLater(() -> {
                                    recieveButtonPressed(buttonFromSever);
                                });
                                break;
                            case "withdraw":
                                withdraw();
                                break;
                            default:
                        }
                    } catch (SocketException e){
                        serverClosed();
                        e.printStackTrace();
                        break;
                    } catch (IOException ex) {
                        serverClosed();
                        ex.printStackTrace();
                        break;
                    } 
                    try {
                        Thread.sleep(300);
                    } catch (InterruptedException ex) {
                        thread.stop();
                        Logger.getLogger(FxmlOneVsOnlineBase.class.getName()).log(Level.SEVERE, null, ex);
                        break;
                    }

                }
            }
        });
        thread.start();
    }

    private void createFile() {
        String oponent;
        if (AvailableFriendBase.vsPlayer != null) {
            oponent = AvailableFriendBase.vsPlayer;
        } else {
            oponent = OnlineFriendCellController.opponant;
        }
        new Thread(() -> {
            StreamHelper.createFile(signInBase.username, oponent);
            StreamHelper.writeOnFile(signInBase.username + ".");
            StreamHelper.writeOnFile(oponent + ".");
        }).start();
    }

    public void sendButtonPressed(Button buttonPressed) {

        if (AvailableFriendBase.vsPlayer != null) {
            ps.println("play###" + AvailableFriendBase.vsPlayer + "###" + findButtonPlaceFromBoard(buttonPressed));
        } else {
            ps.println("play###" + OnlineFriendCellController.opponant + "###" + findButtonPlaceFromBoard(buttonPressed));
        }
        disableButton();
    }

    public void recieveButtonPressed(String buttonFromSever) {

        if (buttonFromSever != null) {
            int i = Integer.parseInt(buttonFromSever);
            writeOnFile(btns.get(i - 1));
            btns.get(i - 1).setDisable(true);
            System.out.println("removed button index = " + (i - 1));
            available.remove(btns.get(i - 1));
            draw(btns.get(i - 1));
            enableButtons();
        }
        enableButtons();
    }

    private void draw(Button btn) {
        imgX = new Image("file:./src/Photo/x2.png");
        imgO = new Image("file:./src/Photo/o2.png");
        ImageView viewX;
        viewX = new ImageView(imgX);
        viewX.setPreserveRatio(true);
        ImageView viewO;
        viewO = new ImageView(imgO);
        viewO.setPreserveRatio(true);

        if (x % 2 != 0) {
            btn.setGraphic(viewO);
            btn.setTextFill(Color.TRANSPARENT);
            btn.setText("O");
        } else {
            btn.setGraphic(viewX);
            btn.setTextFill(Color.TRANSPARENT);
            btn.setText("X");
        }
        checkWinner();
    }

    public void disableButton() {
        for (Button btn : btns) {
            btn.setDisable(true);
        }
    }

    public void enableButtons() {
        for (Button btn : btns) {
            btn.setDisable(false);
        }
    }

    private int findButtonPlaceFromBoard(Button buttonPressed) {
        int index = 0;
        for (int i = 0; i < btns.size(); i++) {
            if (btns.get(i) == buttonPressed) {
                index = i;
                break;
            }
        }
        return index + 1;
    }

    private ImageView createImageViewX() {
        imgX = new Image("file:./src/Photo/x2.png");
        ImageView viewX = new ImageView(imgX);
        viewX.setPreserveRatio(true);
        return viewX;
    }

    private ImageView createImageViewO() {
        imgO = new Image("file:./src/Photo/o2.png");
        ImageView viewO = new ImageView(imgO);
        viewO.setPreserveRatio(true);
        return viewO;

    }

    private void intalizeButtons() {
        ButtonListener listener = new ButtonListener();
        for (Button btn : btns) {
            btn.setOnAction(listener);
        }
    }

    private void intalizeBorad() {
        int index = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = btns.get(index);
                index++;
            }
        }
    }

    private void intalizeAvailablePlaces() {
        for (Button button : btns) {
            available.add(button);
        }
    }

    private Boolean equals(Button a, Button b, Button c) {
        if (!a.getText().isEmpty()
                && a.getText().equals(b.getText())
                && b.getText().equals(c.getText())) {
            if (x % 2 != 0) {
                if (a.getText().equals("X")) {
                    state = GameState.WIN;
                } else {
                    state = GameState.LOSE;
                }
            } else {
                if (a.getText().equals("O")) {
                    state = GameState.WIN;
                } else {
                    state = GameState.LOSE;
                }
            }

            return true;
        }
        return false;
    }

    private void checkWinner() {
        // horizontal
        for (int i = 0; i < 3; i++) {
            if (equals(board[i][0], board[i][1], board[i][2])) {
                isWinner = true;
            }
        }

        // Vertical
        for (int i = 0; i < 3; i++) {
            if (equals(board[0][i], board[1][i], board[2][i])) {
                isWinner = true;
            }
        }

        // Diagonal
        if (equals(board[0][0], board[1][1], board[2][2])) {
            isWinner = true;
        }
        if (equals(board[2][0], board[1][1], board[0][2])) {
            isWinner = true;
        }

        if (!isWinner && available.isEmpty()) {
            state = GameState.TIE;
        }

        showResultVideo();
    }

    private void showResultVideo() {
        Navigation nav = Navigation.getInstance();
        switch (state) {
            case TIE:
                nav.navigatToWatchVideo("tie");
                break;
            case LOSE:
                compScore++;
                nav.navigatToWatchVideo("lose");
                break;
            case WIN:
                userScore++;
                nav.navigatToWatchVideo("win");
                break;
        }
    }

    private class ButtonListener implements EventHandler {

        @Override
        public void handle(Event event) {
            if (!isWinner) {
                if (isUserTurn) {
                    Button buttonPressed = (Button) event.getSource();
                    if (available.contains(buttonPressed)) {
                        if (x % 2 != 0) {
                            currentPlayer = "X";
                            buttonPressed.setText(currentPlayer);
                            buttonPressed.setTextFill(Color.TRANSPARENT);
                            buttonPressed.setGraphic(createImageViewX());
                            buttonPressed.setDisable(true);
                            available.remove(buttonPressed);
                            sendButtonPressed(buttonPressed);
                            writeOnFile(buttonPressed);
                        } else {
                            currentPlayer = "O";
                            buttonPressed.setText(currentPlayer);
                            buttonPressed.setTextFill(Color.TRANSPARENT);
                            buttonPressed.setGraphic(createImageViewO());
                            buttonPressed.setDisable(true);
                            available.remove(buttonPressed);
                            sendButtonPressed(buttonPressed);
                            writeOnFile(buttonPressed);
                        }
                        checkWinner();
                    }
                }
            }
        }
    }

    private void writeOnFile(Button buttonPressed) {
        new Thread(() -> {
            StreamHelper.writeOnFile(findButtonPlaceFromBoard(buttonPressed) + ".");
        }).start();
    }

    enum GameState {
        NONE,
        WIN,
        LOSE,
        TIE;
    }

    private void withdraw() {
        System.out.println("withdraw");

        socket.getPrintStream().println("available###" + signInBase.username);
        Platform.runLater(() -> {
            ButtonType yes = new ButtonType("Ok");
            Alert a = new Alert(Alert.AlertType.NONE);
            a.setTitle("Alert");
            a.getDialogPane().getButtonTypes().addAll(yes);
            a.setHeaderText("You opponent has withdrawed, you are the winner!!!");
            a.showAndWait();
            thread.stop();
            nav.navigatToScene(new AvailableFriendBase());
        });
    }

    private void serverClosed() {
        System.out.println("Server Colsed");
        socket.closeSocket();
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
