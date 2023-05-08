/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.util.Callback;
import utilities.Navigation;

/**
 *
 * @author Mina
 */
public class GameCellController extends ListCell<String> {

    @FXML
    private Label lblGame;

    @FXML
    private Button btnWatch;
    Navigation nav = Navigation.getInstance();

    public GameCellController() {
        loadFXML();
        
        btnWatch.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("clicked: "+getItem());
                System.out.println("list view clicked");
                nav.navigateToGameReplay(ModifyStringToNavigation());
            }
        });
    }
    
    private String ModifyStringToNavigation() {
        String[] splited = getItem().split(" ");
        String modifiedDate = splited[4].replaceAll(":", "-");
        return splited[0] + " " + splited[1] + " " + splited[2] + " " + splited[3] + " " + modifiedDate+".txt";
    }

    private void loadFXML() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/FxmlGameCell.fxml"));
            loader.setController(this);
            loader.setRoot(this);
            loader.load();
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void updateItem(String item, boolean empty) {
        super.updateItem(item, empty);

        if(empty || item == null) {
            setText(null);
            setContentDisplay(ContentDisplay.TEXT_ONLY);
        }
        else {
            lblGame.setText(item);
            setContentDisplay(ContentDisplay.GRAPHIC_ONLY);
        }
    }
}

class GameCellFactory implements Callback<ListView<String>, ListCell<String>> {

    @Override
    public ListCell<String> call(ListView<String> param) {
        return new GameCellController();
    }
}
