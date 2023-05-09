/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.net.Socket;
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
import model.Player;
import utilities.SocketHelper;

/**
 *
 * @author Mina
 */
public class OnlineFriendCellController extends ListCell<String> {
    private SocketHelper socketClient = SocketHelper.getInstance();

    @FXML
    private Label lblFriendName;

    @FXML
    private Button btnAsk;

    public OnlineFriendCellController() {
        loadFXML();
        
        btnAsk.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String opponant = getItem();
                socketClient.getPrintStream().println("request###"+opponant+"###"+signInBase.username);
            }
        });
    }

    private void loadFXML() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/FxmlOnlineFriendCell.fxml"));
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
            lblFriendName.setText(item);
            setContentDisplay(ContentDisplay.GRAPHIC_ONLY);
        }
    }
}

class OnlineFriendCellFactory implements Callback<ListView<String>, ListCell<String>> {

    @Override
    public ListCell<String> call(ListView<String> param) {
        return new OnlineFriendCellController();
    }
}
