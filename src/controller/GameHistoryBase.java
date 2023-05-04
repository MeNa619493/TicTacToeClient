package controller;

import java.io.File;
import java.util.ArrayList;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.ScrollPane;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import static javafx.scene.paint.Color.color;
import static javafx.scene.paint.Color.color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class GameHistoryBase extends AnchorPane {

    ArrayList<String> gameNames = new ArrayList<>();
    File[] files;

    protected final Label label;
    protected final ScrollPane scrollPane;
    protected final ListView gamesListView;

    public GameHistoryBase(Stage primaryStage) {

        label = new Label();
        scrollPane = new ScrollPane();
        gamesListView = new ListView();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(400.0);
        setPrefWidth(600.0);

        AnchorPane.setLeftAnchor(label, 16.0);
        AnchorPane.setTopAnchor(label, 16.0);
        label.setText("History");
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

        gamesListView.setPrefHeight(321.0);
        gamesListView.setPrefWidth(498.0);

        scrollPane.setContent(gamesListView);

        getChildren().add(label);
        getChildren().add(scrollPane);

        setStyle("-fx-background-image: url('file:./src/Photo/bg3.jpg');"
                + "-fx-background-size: cover;"
                + "-fx-background-position: center center;");

        gamesListView.setStyle("-fx-background-color: #232832;");
        scrollPane.setStyle("-fx-color: #232832;");

        gamesListView.setCellFactory(new GameCellFactory());
        populateDataIntoListView();

        gamesListView.setOnMouseClicked((MouseEvent event) -> {
            System.out.println("list view clicked");
            int selectedItem = gamesListView.getSelectionModel().getSelectedIndex();
            System.out.println("clicked " + selectedItem);
            System.out.println("files = " + files.length);
            System.out.println(files[selectedItem].getName());
            VideoHistoryClass videoHistoryRoot = new VideoHistoryClass(files[selectedItem].getName());
            Scene videoHistoryScene = new Scene(videoHistoryRoot);
            videoHistoryScene.getStylesheets().add("file:./src/Photo/buttonStyle.css");
            primaryStage.setScene(videoHistoryScene);
        });
    }

    private boolean isFolderExist() {
        File dir = new File(".\\src\\records");
        files = dir.listFiles();
        if (dir.exists() && files.length > 0) {
            return true;
        }
        return false;
    }

    private void populateDataIntoListView() {
        if (isFolderExist()) {
            for (int i = 0; i < files.length; i++) {
                if (files[i].isFile()) {
                    gameNames.add(ModifyStringToView(files[i].getName()));
                }
            }
            gamesListView.getItems().addAll(gameNames);
        }
    }

    private String ModifyStringToView(String str) {
        String fileNameWithOutExt = str.replaceFirst("[.][^.]+$", "");
        String[] splited = fileNameWithOutExt.split(" ");
        String modifiedDate = splited[4].replaceAll("-", ":");
        return splited[0] + " " + splited[1] + " " + splited[2] + " " + splited[3] + " " + modifiedDate;
    }
}
