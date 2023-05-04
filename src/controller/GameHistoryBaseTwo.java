package controller;

import java.io.File;
import java.util.ArrayList;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class GameHistoryBaseTwo extends AnchorPane {
    ArrayList <String> gameNames = new ArrayList<>();
    File[] files;
    protected final ScrollPane scrollPane;
    protected final VBox vBox;
    protected final Label label;
    protected final ListView gamesListView;

    public GameHistoryBaseTwo() {

        scrollPane = new ScrollPane();
        vBox = new VBox();
        label = new Label();
        gamesListView = new ListView();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(400.0);
        setPrefWidth(600.0);

        scrollPane.setPrefHeight(400.0);
        scrollPane.setPrefWidth(600.0);
        scrollPane.setVbarPolicy(javafx.scene.control.ScrollPane.ScrollBarPolicy.ALWAYS);

        vBox.setPrefHeight(399.0);
        vBox.setPrefWidth(581.0);

        label.setText("History");
        label.setTextFill(javafx.scene.paint.Color.valueOf("#cf2a27"));
        label.setFont(new Font(33.0));
        VBox.setMargin(label, new Insets(0.0, 0.0, 0.0, 16.0));

        gamesListView.setPrefHeight(352.0);
        gamesListView.setPrefWidth(581.0);
        VBox.setMargin(gamesListView, new Insets(16.0, 16.0, 0.0, 16.0));
        scrollPane.setContent(vBox);

        vBox.getChildren().add(label);
        vBox.getChildren().add(gamesListView);
        getChildren().add(scrollPane);
        
        vBox.setStyle("-fx-background-color: black;"
                + "-fx-background-size: cover;"
                + "-fx-background-position: center center;");
        
        gamesListView.setStyle("-fx-background-image: url('file:./src/Photo/bgGp.jpg');");
        
        gamesListView.setCellFactory(new GameCellFactory());
        populateDataIntoListView();
    }
    
    private boolean isFolderExist(){
        File dir = new File("C:\\Users\\Mina\\Documents\\NetBeansProjects\\TicTacToeClient\\src\\records");
        files = dir.listFiles();
        if(dir.exists() && files.length > 0){
            return true;
        }
        return false;
    }
    
    private void populateDataIntoListView(){
        if(isFolderExist()){
            for (int i = 0; i < files.length; i++) {
                if (files[i].isFile()) {
                    gameNames.add(ModifyStringToView(files[i].getName()));
                } 
            }
            gamesListView.getItems().addAll(gameNames);
        }
    }
    
    private String ModifyStringToView(String str){
        String fileNameWithOutExt = str.replaceFirst("[.][^.]+$", "");
        String[] splited = fileNameWithOutExt.split(" ");
        String modifiedDate = splited[4].replaceAll("-", ":");
        return splited[0]+" "+splited[1]+" "+ splited[2]+" "+splited[3]+" "+modifiedDate;
    }
}
