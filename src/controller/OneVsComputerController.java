/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import static java.lang.Math.floor;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import static jdk.nashorn.internal.objects.NativeMath.random;
import utilities.MiniMax;
import utilities.Navigation;

/**
 *
 * @author Mina
 */
public class OneVsComputerController  implements Initializable{
    private Boolean isUserTurn = true;
    private boolean isWinner = false;
    private String winnerSymbol = null;
     
    String currentPlayer = "X";
    ArrayList<Button> btns;
    Button[][] board = new Button[3][3];
    ArrayList<Button> available = new ArrayList();
    
    @FXML
    private Button btn1;
    @FXML
    private Button btn2;
    @FXML
    private Button btn3;
    @FXML
    private Button btn4;
    @FXML
    private Button btn5;
    @FXML
    private Button btn6;
    @FXML
    private Button btn7;
    @FXML
    private Button btn8;
    @FXML
    private Button btn9;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        btns = new ArrayList<>(Arrays.asList(btn1, btn2, btn3,btn4, btn5, btn6,btn7, btn8, btn9));
        
        intalizeBorad();
        intalizeAvailablePlaces();
    }
    
    private ImageView createImageViewX(){
        Image imgX = new Image("file:./src/Photo/x.png");
        ImageView viewX = new ImageView(imgX);
        viewX.setFitHeight(80);
        viewX.setFitWidth(80);
        viewX.setPreserveRatio(true);
        return viewX;
    }
    
    private ImageView createImageViewO(){
        Image imgO = new Image("file:./src/Photo/o.png");
        ImageView viewO = new ImageView(imgO);
        viewO.setFitHeight(80);
        viewO.setFitWidth(80);
        viewO.setPreserveRatio(true);
        return viewO;
    }
    
    private void intalizeBorad(){
        int index = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = btns.get(index);
                index++;
            }
        }
    }
    
    private void intalizeAvailablePlaces(){
        for(Button button: btns){
            available.add(button);
        }
    }
    
    @FXML
    public void boardbuttonClicked(ActionEvent e){
        if(!isWinner){
            if(isUserTurn){
                Button buttonPressed = (Button) e.getSource();
                if(buttonPressed.getText().isEmpty()){ 
                    buttonPressed.setText(currentPlayer);
                    buttonPressed.setTextFill(Color.TRANSPARENT);
                    buttonPressed.setGraphic(createImageViewX());
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
    
    //easy
    private void computerTurn(){
        if(!isWinner){
            if(available.size() > 0){
                int index = (int)floor(random(available.size()-1));
                Button buttonChoosed = available.get(index);
                buttonChoosed.setText(currentPlayer);
                buttonChoosed.setTextFill(Color.TRANSPARENT);
                buttonChoosed.setGraphic(createImageViewO());    
                isUserTurn = true;
                currentPlayer = "X";
                buttonChoosed.setDisable(true);
                available.remove(buttonChoosed);
                checkWinner();
            }
        }
    }
    
    //hard
//    private void computerTurn(){
//        if(!isWinner){
//            if(available.size() > 0){
//                char[][] playBoard = new char[3][3];
//                for (int j = 0; j < 3; j++) {
//                    for (int i = 0; i < 3; i++) {
//                        if(board[j][i].getText().isEmpty()){
//                             playBoard[j][i] = ' ';
//                             continue;
//                        }
//                        playBoard[j][i] = (board[j][i].getText()).charAt(0);
//                    }
//                }
//                
//                int[] res = new int[2];
//                res = MiniMax.getBestMove(playBoard,9);
//                int index = res[0]*3+res[1];
//                Button buttonChoosed = btns.get(index);
//                buttonChoosed.setText(currentPlayer);
//                buttonChoosed.setTextFill(Color.TRANSPARENT);
//                buttonChoosed.setGraphic(createImageViewO());
//                isUserTurn = true;
//                currentPlayer = "X";
//                buttonChoosed.setDisable(true);
//                available.remove(buttonChoosed);
//                checkWinner();
//            }
//        }
//    }
    
    private Boolean equals(Button a,Button b,Button c) {
        if(!a.getText().isEmpty() 
                && a.getText().equals(b.getText()) 
                && b.getText().equals(c.getText())
                ){
            winnerSymbol = a.getText();
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
        
        if (!isWinner && available.isEmpty()){
            showResultVideo();
        }else if(isWinner){
            showResultVideo();
        } 
    }
    
    private void showResultVideo(){
        Navigation nav = new Navigation();
        if(winnerSymbol == null){
            nav.navigatToWatchVideo("tie");
        }else if(winnerSymbol.equals("O")){
            nav.navigatToWatchVideo("lose");
        }else if(winnerSymbol.equals("X")){
            nav.navigatToWatchVideo("win");
        }
    }
    
}
