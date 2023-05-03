/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

/**
 *
 * @author Mina
 */
public class WatchVideoController implements Initializable{
    @FXML
    private MediaView videoPlayer;
    private String gameState;
    public static MediaPlayer mediaPlayer;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
    }
    
    public void setGameState(String gameState){
        this.gameState = gameState;
        displayVideo();
    }
    
    private void displayVideo() {
        if(gameState.equals("win")) {
            createMedia("/resources/win.mp4");
        } else if (gameState.equals("lose")) {
            createMedia("/resources/lose.mp4");
        }else if (gameState.equals("tie")) {
            createMedia("/resources/draw.mp4");
           
        }
    }

    private void createMedia(String videoPath) {
        Media media = new Media(getClass().getResource(videoPath).toExternalForm());
        mediaPlayer = new MediaPlayer(media);
        videoPlayer.setMediaPlayer(mediaPlayer);
        mediaPlayer.play();
        mediaPlayer.setCycleCount(MediaPlayer.INDEFINITE);
    }
    
}
