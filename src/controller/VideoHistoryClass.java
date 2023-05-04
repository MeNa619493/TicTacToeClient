package controller;

import static java.lang.System.in;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.event.ActionEvent;
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
import utilities.Navigation;
import utilities.StreamHelper;

public class VideoHistoryClass extends AnchorPane {

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
    protected final Button btnEndVideo; 
    int x = 1;
    Image imgX;
    Image imgO;
    String fileName;
    Navigation nav = Navigation.getInstance();

    public VideoHistoryClass(String fileName) {

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
        btnEndVideo = new Button();

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
        text.setText("");
        text.setFont(new Font(24.0));

        AnchorPane.setLeftAnchor(playerScore, 65.0);
        AnchorPane.setTopAnchor(playerScore, 48.1015625);
        playerScore.setFill(javafx.scene.paint.Color.WHITE);
        playerScore.setLayoutX(75.0);
        playerScore.setLayoutY(74.0);
        playerScore.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        playerScore.setStrokeWidth(0.0);
        playerScore.setText("X");
        playerScore.setFont(new Font(24.0));

        AnchorPane.setRightAnchor(text0, 24.0);
        AnchorPane.setTopAnchor(text0, 16.0);
        text0.setFill(javafx.scene.paint.Color.valueOf("#0070fc"));
        text0.setLayoutX(504.0);
        text0.setLayoutY(40.0);
        text0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text0.setStrokeWidth(0.0);
        text0.setText("");
        text0.setFont(new Font(24.0));

        AnchorPane.setRightAnchor(computerScore, 80.0);
        AnchorPane.setTopAnchor(computerScore, 48.1015625);
        computerScore.setFill(javafx.scene.paint.Color.WHITE);
        computerScore.setLayoutX(483.0);
        computerScore.setLayoutY(75.0);
        computerScore.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        computerScore.setStrokeWidth(0.0);
        computerScore.setText("O");
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
        btn10.setStyle("-fx-background-color: transparent;");
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

        AnchorPane.setBottomAnchor(btnEndVideo, 20.0);
        AnchorPane.setRightAnchor(btnEndVideo, 20.0);
        btnEndVideo.setLayoutX(514.0);
        btnEndVideo.setLayoutY(12.0);
        btnEndVideo.setMnemonicParsing(false);
        btnEndVideo.setText("End Video");
        btnEndVideo.setFont(new Font(14.0));

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
        getChildren().add(btnEndVideo);
        setStyle("-fx-background-image: url('file:./src/Photo/bgGp.jpg');"
                + "-fx-background-size: cover;"
                + "-fx-background-position: center center;");
        btnEndVideo.setId("myButton");
        ArrayList<Button> buttonList = new ArrayList<Button>();
        buttonList.add(btn00);
        buttonList.add(btn01);
        buttonList.add(btn02);
        buttonList.add(btn10);
        buttonList.add(btn11);
        buttonList.add(btn12);
        buttonList.add(btn20);
        buttonList.add(btn21);
        buttonList.add(btn22);

        String dir = ".\\src\\records\\";
        this.fileName = fileName;
        String[] dataArray = StreamHelper.readFile(dir + fileName);
       int [] buttonPositions = new int[dataArray.length - 2]; 
            for (int i = 2; i < dataArray.length; i++) {
                buttonPositions[i - 2] = Integer.parseInt(dataArray[i]);
            }
        Thread th = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i : buttonPositions) {
                    try {
                        Thread.sleep(1000);
                        Platform.runLater(new Runnable() {
                            @Override
                            public void run() {
                                draw(buttonList.get(i-1));
                            }
                        });
                    } catch (InterruptedException ex) {
                        Logger.getLogger(VideoHistoryClass.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        });
        th.start();
        
        btnEndVideo.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                th.stop();
                nav.navigatToScene(new GameHistoryBase());
            }
        });
        text.setText(dataArray[0]);
        text0.setText(dataArray[1]);
    }

    public void draw(Button btn) {
        imgX = new Image("file:./src/Photo/x2.png");
        imgO = new Image("file:./src/Photo/o2.png");
        ImageView viewX;
        viewX = new ImageView(imgX);
        viewX.setPreserveRatio(true);
        ImageView viewO;
        viewO = new ImageView(imgO);
        viewO.setPreserveRatio(true);
        
            if (x % 2 != 0) {
                btn.setGraphic(viewX);
            } else {
                btn.setGraphic(viewO);
            }
            x++;
    }
}
