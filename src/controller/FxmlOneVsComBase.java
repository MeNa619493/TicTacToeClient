package controller;

import static java.lang.Math.floor;
import java.util.ArrayList;
import java.util.Arrays;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
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
import static jdk.nashorn.internal.objects.NativeMath.random;
import utilities.MiniMax;
import utilities.Navigation;
import utilities.StreamHelper;

public class FxmlOneVsComBase extends AnchorPane {

    private boolean isUserTurn = true;
    private boolean isWinner = false;
    private GameState state = GameState.NONE;
    private Levels level;
    Integer compScore = 0;
    Integer userScore = 0;

    String currentPlayer = "X";
    ArrayList<Button> btns;
    Button[][] board = new Button[3][3];
    ArrayList<Button> available = new ArrayList();

    Image imgX;
    Image imgO;

    Navigation nav = Navigation.getInstance();

    protected final Text text;
    protected final Text playerScore;
    protected final Text text0;
    protected final Text computerScore;
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
    protected final Button btnEndGame;
    protected final Button btnReset;

    public FxmlOneVsComBase(Levels level) {

        text = new Text();
        playerScore = new Text();
        text0 = new Text();
        computerScore = new Text();
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
        btnReset = new Button();

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
        text.setLayoutY(40.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Your Score");
        text.setFont(new Font(24.0));

        AnchorPane.setLeftAnchor(playerScore, 65.0);
        AnchorPane.setTopAnchor(playerScore, 48.1015625);
        playerScore.setFill(javafx.scene.paint.Color.WHITE);
        playerScore.setLayoutX(75.0);
        playerScore.setLayoutY(74.0);
        playerScore.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        playerScore.setStrokeWidth(0.0);
        playerScore.setText("1");
        playerScore.setFont(new Font(24.0));

        AnchorPane.setRightAnchor(text0, 24.0);
        AnchorPane.setTopAnchor(text0, 16.0);
        text0.setFill(javafx.scene.paint.Color.valueOf("#0070fc"));
        text0.setLayoutX(504.0);
        text0.setLayoutY(40.0);
        text0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text0.setStrokeWidth(0.0);
        text0.setText("Computer Score");
        text0.setFont(new Font(24.0));

        AnchorPane.setRightAnchor(computerScore, 80.0);
        AnchorPane.setTopAnchor(computerScore, 48.1015625);
        computerScore.setFill(javafx.scene.paint.Color.valueOf("#ffffff"));
        computerScore.setLayoutX(483.0);
        computerScore.setLayoutY(75.0);
        computerScore.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        computerScore.setStrokeWidth(0.0);
        computerScore.setText("1");
        computerScore.setFont(new Font(24.0));

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

        AnchorPane.setBottomAnchor(btnReset, 20.0);
        AnchorPane.setLeftAnchor(btnReset, 20.0);
        btnReset.setLayoutX(51.0);
        btnReset.setLayoutY(12.0);
        btnReset.setMnemonicParsing(false);
        btnReset.setText("New Round");
        btnReset.setFont(new Font(14.0));

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
        getChildren().add(btnReset);
        setStyle("-fx-background-image: url('file:./src/Photo/bgGp.jpg');"
                + "-fx-background-size: cover;"
                + "-fx-background-position: center center;");
        btnEndGame.setId("myButton");
        btnReset.setId("myButton");
        btnReset.setDisable(true);

        this.level = level;

        btnEndGame.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                nav.navigatToScene(new mainBase());
            }
        });

        btnReset.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                playAgain();
            }
        });

        createFile();

        btns = new ArrayList<>(Arrays.asList(btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9));
        intalizeButtons();

        intalizeBorad();
        intalizeAvailablePlaces();
        setTextFields();
    }

    private void createFile() {
        new Thread(() -> {
            StreamHelper.createFile("User", "Computer");
            StreamHelper.writeOnFile("User.");
            StreamHelper.writeOnFile("Computer.");
        }).start();
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

    private void setTextFields() {
        computerScore.setText(compScore.toString());
        playerScore.setText(userScore.toString());
    }

    //easy
    private void computerTurnEasyMode() {
        if (!isWinner) {
            if (available.size() > 0) {
                int index = (int) floor(random(available.size() - 1));
                Button buttonChoosed = available.get(index);
                buttonChoosed.setText(currentPlayer);
                buttonChoosed.setTextFill(Color.TRANSPARENT);
                buttonChoosed.setGraphic(createImageViewO());
                writeOnFile(buttonChoosed);
                isUserTurn = true;
                currentPlayer = "X";
                buttonChoosed.setDisable(true);
                available.remove(buttonChoosed);
                checkWinner();
            }
        }
    }
    
    //meduim
    private void computerTurnMeduimMode() {
        if (!isWinner) {
            if (available.size() > 0) {
                char[][] playBoard = new char[3][3];
                for (int j = 0; j < 3; j++) {
                    for (int i = 0; i < 3; i++) {
                        if (board[j][i].getText().isEmpty()) {
                            playBoard[j][i] = ' ';
                            continue;
                        }
                        playBoard[j][i] = (board[j][i].getText()).charAt(0);
                    }
                }

                int[] res = new int[2];
                res = MiniMax.getBestMove(playBoard, 5);
                int index = res[0] * 3 + res[1];
                Button buttonChoosed = btns.get(index);
                buttonChoosed.setText(currentPlayer);
                buttonChoosed.setTextFill(Color.TRANSPARENT);
                buttonChoosed.setGraphic(createImageViewO());
                writeOnFile(buttonChoosed);
                isUserTurn = true;
                currentPlayer = "X";
                buttonChoosed.setDisable(true);
                available.remove(buttonChoosed);
                checkWinner();
            }
        }
    }

    //hard
    private void computerTurnHardMode() {
        if (!isWinner) {
            if (available.size() > 0) {
                char[][] playBoard = new char[3][3];
                for (int j = 0; j < 3; j++) {
                    for (int i = 0; i < 3; i++) {
                        if (board[j][i].getText().isEmpty()) {
                            playBoard[j][i] = ' ';
                            continue;
                        }
                        playBoard[j][i] = (board[j][i].getText()).charAt(0);
                    }
                }

                int[] res = new int[2];
                res = MiniMax.getBestMove(playBoard, 9);
                int index = res[0] * 3 + res[1];
                Button buttonChoosed = btns.get(index);
                buttonChoosed.setText(currentPlayer);
                buttonChoosed.setTextFill(Color.TRANSPARENT);
                buttonChoosed.setGraphic(createImageViewO());
                writeOnFile(buttonChoosed);
                isUserTurn = true;
                currentPlayer = "X";
                buttonChoosed.setDisable(true);
                available.remove(buttonChoosed);
                checkWinner();
            }
        }
    }

    private Boolean equals(Button a, Button b, Button c) {
        if (!a.getText().isEmpty()
                && a.getText().equals(b.getText())
                && b.getText().equals(c.getText())) {
            if (a.getText().equals("X")) {
                state = GameState.WIN;
            } else {
                state = GameState.LOSE;
            }
            btnReset.setDisable(false);
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
            btnReset.setDisable(false);
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
        setTextFields();
    }

    private class ButtonListener implements EventHandler {

        @Override
        public void handle(Event event) {
            if (!isWinner) {
                if (isUserTurn) {
                    Button buttonPressed = (Button) event.getSource();
                    if (buttonPressed.getText().isEmpty()) {
                        buttonPressed.setText(currentPlayer);
                        buttonPressed.setTextFill(Color.TRANSPARENT);
                        buttonPressed.setGraphic(createImageViewX());
                        writeOnFile(buttonPressed);
                        isUserTurn = false;
                        currentPlayer = "O";
                        buttonPressed.setDisable(true);
                        available.remove(buttonPressed);
                        checkWinner();
                        computerTurn();
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

    private void computerTurn() {
        switch (level) {
            case HARD:
                computerTurnHardMode();
                break;
            case MEDUIM:
                computerTurnMeduimMode();
                break;
            case EASY:
                computerTurnEasyMode();
                break;

        }
    }

    private void playAgain() {
        for (Button btn : btns) {
            btn.setText("");
            btn.setGraphic(null);
            btn.setDisable(false);
        }
        createFile();
        available.clear();
        intalizeAvailablePlaces();
        isUserTurn = true;
        isWinner = false;
        state = GameState.NONE;
        currentPlayer = "X";
    }
}

enum GameState {
    NONE,
    WIN,
    LOSE,
    TIE;
}
