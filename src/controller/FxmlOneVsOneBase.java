package controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
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
import javafx.stage.Stage;
import utilities.Navigation;

public class FxmlOneVsOneBase extends AnchorPane {

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
    protected final Button btn22;
    protected final Button btn21;
    protected final Button btn20;
    protected final Button btn12;
    protected final Button btn11;
    protected final Button btn10;
    protected final Button btn02;
    protected final Button btn01;
    protected final Button btn00;
    public final Button btnEndGame;
    public final Button btnReset;
    int x =1;
    int y = 1;
    int flag = 0;
    Image imgX;
    Image imgO;
    int playerScoorNum;
    int computerScoreNum;
    

    public FxmlOneVsOneBase(Stage primaryStage) {
        
        playerScoorNum = 0;
        computerScoreNum = 0;
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
        btn22 = new Button();
        btn21 = new Button();
        btn20 = new Button();
        btn12 = new Button();
        btn11 = new Button();
        btn10 = new Button();
        btn02 = new Button();
        btn01 = new Button();
        btn00 = new Button();
        btnEndGame = new Button();
        btnReset = new Button();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(415.0);
        setPrefWidth(604.0);
        setStyle("-fx-background-color: #FFFFFF;");

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
        text0.setText("Friend Score");
        text0.setFont(new Font(24.0));

        AnchorPane.setRightAnchor(computerScore, 80.0);
        AnchorPane.setTopAnchor(computerScore, 48.1015625);
        computerScore.setFill(javafx.scene.paint.Color.WHITE);
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

        GridPane.setColumnIndex(btn22, 2);
        GridPane.setRowIndex(btn22, 2);
        btn22.setMnemonicParsing(false);
        btn22.setPrefHeight(100.0);
        btn22.setPrefWidth(108.0);
        btn22.setStyle("-fx-background-color: transparent;");
        btn22.setFont(new Font("Phosphate Inline", 46.0));

        GridPane.setColumnIndex(btn21, 1);
        GridPane.setRowIndex(btn21, 2);
        btn21.setMnemonicParsing(false);
        btn21.setPrefHeight(100.0);
        btn21.setPrefWidth(108.0);
        btn21.setStyle("-fx-background-color: transparent;");
        btn21.setTextFill(javafx.scene.paint.Color.valueOf("#ffe591"));
        btn21.setFont(new Font("Phosphate Inline", 46.0));

        GridPane.setRowIndex(btn20, 2);
        btn20.setMnemonicParsing(false);
        btn20.setPrefHeight(100.0);
        btn20.setPrefWidth(109.0);
        btn20.setStyle("-fx-background-color: transparent;");
        btn20.setFont(new Font("Phosphate Inline", 46.0));

        GridPane.setColumnIndex(btn12, 2);
        GridPane.setRowIndex(btn12, 1);
        btn12.setMnemonicParsing(false);
        btn12.setPrefHeight(100.0);
        btn12.setPrefWidth(111.0);
        btn12.setStyle("-fx-background-color: transparent;");
        btn12.setFont(new Font("Phosphate Inline", 46.0));

        GridPane.setColumnIndex(btn11, 1);
        GridPane.setRowIndex(btn11, 1);
        btn11.setMnemonicParsing(false);
        btn11.setPrefHeight(100.0);
        btn11.setPrefWidth(107.0);
        btn11.setStyle("-fx-background-color: transparent;");
        btn11.setFont(new Font("Phosphate Inline", 46.0));

        GridPane.setRowIndex(btn10, 1);
        btn10.setMnemonicParsing(false);
        btn10.setPrefHeight(100.0);
        btn10.setPrefWidth(107.0);
        btn10.setStyle("-fx-background-color: transparent;;");
        btn10.setFont(new Font("Phosphate Inline", 46.0));

        GridPane.setColumnIndex(btn02, 2);
        btn02.setMnemonicParsing(false);
        btn02.setPrefHeight(100.0);
        btn02.setPrefWidth(110.0);
        btn02.setStyle("-fx-background-color: transparent;");
        btn02.setFont(new Font("Phosphate Inline", 46.0));

        GridPane.setColumnIndex(btn01, 1);
        btn01.setMnemonicParsing(false);
        btn01.setPrefHeight(100.0);
        btn01.setPrefWidth(106.0);
        btn01.setStyle("-fx-background-color: transparent;");
        btn01.setFont(new Font("Phosphate Inline", 46.0));

        btn00.setMnemonicParsing(false);
        btn00.setPrefHeight(100.0);
        btn00.setPrefWidth(106.0);
        btn00.setStyle("-fx-background-color: transparent;");
        btn00.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        btn00.setWrapText(true);
        btn00.setFont(new Font("Phosphate Inline", 50.0));

        AnchorPane.setBottomAnchor(btnEndGame, 20.0);
        AnchorPane.setRightAnchor(btnEndGame, 20.0);
        btnEndGame.setLayoutX(514.0);
        btnEndGame.setLayoutY(12.0);
        btnEndGame.setMnemonicParsing(false);
        btnEndGame.setText("End Game");
        btnEndGame.setFont(new Font(14.0));

        AnchorPane.setBottomAnchor(btnReset, 20.0);
        AnchorPane.setRightAnchor(btnReset, 470.0);
        btnReset.setLayoutX(20.0);
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
        gridPane.getChildren().add(btn22);
        gridPane.getChildren().add(btn21);
        gridPane.getChildren().add(btn20);
        gridPane.getChildren().add(btn12);
        gridPane.getChildren().add(btn11);
        gridPane.getChildren().add(btn10);
        gridPane.getChildren().add(btn02);
        gridPane.getChildren().add(btn01);
        gridPane.getChildren().add(btn00);
        stackPane.getChildren().add(gridPane);
        getChildren().add(stackPane);
        getChildren().add(btnEndGame);
        getChildren().add(btnReset);
        setStyle("-fx-background-image: url('file:./src/Photo/bgGp.jpg');"
                + "-fx-background-size: cover;"
                + "-fx-background-position: center center;");
        btnEndGame.setId("myButton");
        btnReset.setId("myButton");
        btn00.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                draw(btn00);
            }
        });

        btn01.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                draw(btn01);
            }
        });
        btn02.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                draw(btn02);
            }
        });
        btn10.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                draw(btn10);
            }
        });
        btn11.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                draw(btn11);
            }
        });
        btn12.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                draw(btn12);
            }
        });
        btn20.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                draw(btn20);

            }
        });
        btn21.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                draw(btn21);
            }
        });
        btn22.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                draw(btn22);
            }
        });
        btnReset.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                resetLayout();
                x = 1;
            }
        });
        btnEndGame.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                resetLayout();
                x = 1;
            }
        });
        GridPane.setHalignment(btn00, javafx.geometry.HPos.CENTER);
        GridPane.setValignment(btn00, javafx.geometry.VPos.CENTER);
        GridPane.setHalignment(btn01, javafx.geometry.HPos.CENTER);
        GridPane.setValignment(btn01, javafx.geometry.VPos.CENTER);
        GridPane.setHalignment(btn02, javafx.geometry.HPos.CENTER);
        GridPane.setValignment(btn02, javafx.geometry.VPos.CENTER);
        GridPane.setHalignment(btn10, javafx.geometry.HPos.CENTER);
        GridPane.setValignment(btn10, javafx.geometry.VPos.CENTER);
        GridPane.setHalignment(btn11, javafx.geometry.HPos.CENTER);
        GridPane.setValignment(btn11, javafx.geometry.VPos.CENTER);
        GridPane.setHalignment(btn12, javafx.geometry.HPos.CENTER);
        GridPane.setValignment(btn12, javafx.geometry.VPos.CENTER);
        GridPane.setHalignment(btn20, javafx.geometry.HPos.CENTER);
        GridPane.setValignment(btn20, javafx.geometry.VPos.CENTER);
        GridPane.setHalignment(btn21, javafx.geometry.HPos.CENTER);
        GridPane.setValignment(btn21, javafx.geometry.VPos.CENTER);
        GridPane.setHalignment(btn22, javafx.geometry.HPos.CENTER);
        GridPane.setValignment(btn22, javafx.geometry.VPos.CENTER);
        btnReset.setDisable(true);
        playerScore.setText("" + playerScoorNum);
        computerScore.setText("" + computerScoreNum);
        
        btnEndGame.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                mainBase rootMain = new mainBase(primaryStage);
                Scene MainScene = new Scene(rootMain);
                MainScene.getStylesheets().add("file:./src/Photo/buttonStyle.css");
                primaryStage.setScene(MainScene);
            }
        });
    }

    public void draw(Button btn) {
        imgX = new Image("file:./src/Photo/x2.png");
        imgO = new Image("file:./src/Photo/o2.png");
        ImageView viewX;
        viewX = new ImageView(imgX);
        //viewX.setFitHeight(70);
        viewX.setPreserveRatio(true);
        ImageView viewO;
        viewO = new ImageView(imgO);
        //viewO.setFitHeight(70);
        viewO.setPreserveRatio(true);
        if (btn.getText() == "") {
            if (x % 2 != 0) {
                btn.setGraphic(viewX);
                btn.setTextFill(Color.TRANSPARENT);
                btn.setText("X");
            } else {
                btn.setGraphic(viewO);
                btn.setTextFill(Color.TRANSPARENT);
                btn.setText("O");
            }
            x++;
            checkWinner();
        }
    }

    public void checkWinner() {
        if (btn00.getText().equals(btn01.getText()) && btn00.getText().equals(btn02.getText()) && btn00.getText() != "" && btn01.getText() != "" && btn02.getText() != "") {
            endApp();
            showResultVideo();
            btnReset.setDisable(false);

        } else if (btn10.getText().equals(btn11.getText()) && btn10.getText().equals(btn12.getText()) && btn10.getText() != "" && btn11.getText() != "" && btn12.getText() != "") {
            endApp();
            showResultVideo();
            btnReset.setDisable(false);
        } else if (btn20.getText().equals(btn21.getText()) && btn20.getText().equals(btn22.getText()) && btn20.getText() != "" && btn21.getText() != "" && btn22.getText() != "") {
            endApp();
            showResultVideo();
            btnReset.setDisable(false);
        } else if (btn00.getText().equals(btn10.getText()) && btn00.getText().equals(btn20.getText()) && btn00.getText() != "" && btn10.getText() != "" && btn20.getText() != "") {
            endApp();
            showResultVideo();
            btnReset.setDisable(false);
        } else if (btn01.getText().equals(btn11.getText()) && btn01.getText().equals(btn21.getText()) && btn01.getText() != "" && btn11.getText() != "" && btn21.getText() != "") {
            endApp();
            showResultVideo();
            btnReset.setDisable(false);
        } else if (btn02.getText().equals(btn12.getText()) && btn02.getText().equals(btn22.getText()) && btn02.getText() != "" && btn12.getText() != "" && btn22.getText() != "") {
            endApp();
            showResultVideo();
            btnReset.setDisable(false);
        } else if (btn00.getText().equals(btn11.getText()) && btn00.getText().equals(btn22.getText()) && btn00.getText() != "" && btn11.getText() != "" && btn22.getText() != "") {
            endApp();
            showResultVideo();
            btnReset.setDisable(false);
        } else if (btn02.getText().equals(btn11.getText()) && btn02.getText().equals(btn20.getText()) && btn01.getText() != "" && btn11.getText() != "" && btn20.getText() != "") {
            endApp();
            showResultVideo();
            btnReset.setDisable(false);
        } else {
            if (checkNull() == 1) {
                showDrawVideo();
                btnReset.setDisable(false);
            }
        }

    }

    private void showResultVideo() {
        Navigation nav = new Navigation();
        --x;
        if (x % 2 != 0) {
            nav.navigatToWatchVideo("win");
            playerScore.setText("" + (++playerScoorNum));
        } else {
            nav.navigatToWatchVideo("lose");
            computerScore.setText("" + (++computerScoreNum));
        }
    }

    private void showDrawVideo() {
        Navigation nav = new Navigation();
        nav.navigatToWatchVideo("tie");

    }

//    private void winerDialog() {
//        Alert alert = new Alert(Alert.AlertType.WARNING);
//        alert.setTitle("Winner");
//        --x;
//        if (x % 2 != 0) {
//            alert.setContentText("winer is X");
//            alert.showAndWait();
//        } else {
//            alert.setContentText("winer is O");
//            alert.showAndWait();
//        }
//    }
//
//    private void drawDialog() {
//        Alert alert = new Alert(Alert.AlertType.WARNING);
//        alert.setTitle("Draw");
//        alert.setContentText("No One Win (Draw)");
//        alert.showAndWait();
//    }
    public void endApp() {
        btn00.setDisable(true);
        btn01.setDisable(true);
        btn02.setDisable(true);
        btn10.setDisable(true);
        btn11.setDisable(true);
        btn12.setDisable(true);
        btn20.setDisable(true);
        btn21.setDisable(true);
        btn22.setDisable(true);
    }

    public int checkNull() {
        if (btn00.getText() != "" && btn01.getText() != "" && btn02.getText() != "" && btn10.getText() != "" && btn11.getText() != "" && btn12.getText() != "" && btn20.getText() != "" && btn21.getText() != "" && btn22.getText() != "") {
            flag = 1;
        }
        return flag;
    }

    public void resetLayout() {
        btn00.setText("");
        btn01.setText("");
        btn02.setText("");
        btn10.setText("");
        btn11.setText("");
        btn12.setText("");
        btn20.setText("");
        btn21.setText("");
        btn22.setText("");
        btn00.setGraphic(null);
        btn01.setGraphic(null);
        btn02.setGraphic(null);
        btn10.setGraphic(null);
        btn11.setGraphic(null);
        btn12.setGraphic(null);
        btn20.setGraphic(null);
        btn21.setGraphic(null);
        btn22.setGraphic(null);
        btn00.setDisable(false);
        btn01.setDisable(false);
        btn02.setDisable(false);
        btn10.setDisable(false);
        btn11.setDisable(false);
        btn12.setDisable(false);
        btn20.setDisable(false);
        btn21.setDisable(false);
        btn22.setDisable(false);
    }
}
