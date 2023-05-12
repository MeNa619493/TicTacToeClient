package controller;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import utilities.Navigation;

public class PushIpXmlClass extends AnchorPane {

    protected final Text text;
    protected final TextField tfEnterIp;
    protected final Button btnSendIp;
    Navigation nav = Navigation.getInstance();
    public static String ip;
    protected final Button btnHome;

    public PushIpXmlClass() {
        
        text = new Text();
        tfEnterIp = new TextField();
        btnSendIp = new Button();
        btnHome=new Button();

        setId("AnchorPane");
        setPrefHeight(400.0);
        setPrefWidth(600.0);

        text.setLayoutX(185.0);
        text.setLayoutY(98.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Enter Server IP");
        text.setFont(new Font(36.0));
        text.setStyle("-fx-text-fill: White;");
        text.setFill(javafx.scene.paint.Color.web("#0070fc"));

        tfEnterIp.setLayoutX(127.0);
        tfEnterIp.setLayoutY(176.0);
        tfEnterIp.setPrefHeight(48.0);
        tfEnterIp.setPrefWidth(345.0);
        tfEnterIp.setStyle("-fx-background-color: #323741; -fx-text-fill: White;");

        btnSendIp.setLayoutX(268.0);
        btnSendIp.setLayoutY(311.0);
        btnSendIp.setMnemonicParsing(false);
        btnSendIp.setText("Send");
        btnSendIp.setFont(new Font(18.0));
        
        btnHome.setLayoutX(31.0);
        btnHome.setLayoutY(24.0);
        btnHome.setMnemonicParsing(false);
        btnHome.setText("Home");
        btnHome.setFont(new Font(14.0));

        getChildren().add(text);
        getChildren().add(tfEnterIp);
        getChildren().add(btnSendIp);
        getChildren().add(btnHome);

        setStyle("-fx-background-image: url('file:./src/Photo/bg3.jpg');"
                + "-fx-background-size: cover;"
                + "-fx-background-position: center center;");
        btnSendIp.setId("myButton");

        btnHome.setId("myButton");

        btnSendIp.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                //
                ip = tfEnterIp.getText().trim();
                if (ip.isEmpty()) {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("ERROR");
                    alert.setHeaderText("Empty Field");
                    alert.setContentText("please Enter IP Number.");
                    alert.showAndWait();
                } else if (validate()) {
                    
                    try {
                        if (!InetAddress.getByName(ip).isReachable(5)) {
                            System.out.println("not reachable ip");
                            showUnvalidIpAlert();
                        } else {
                            System.out.println("Valid ip");
                            nav.navigatToScene(new SignBase());
                        }
                    } catch (UnknownHostException e) {
                        System.out.println("Fail when getting Server Address.");
                    } catch (IOException ex) {
                        Logger.getLogger(PushIpXmlClass.class.getName()).log(Level.SEVERE, null, ex);
                    }

                } else {
                    System.out.println("not Valid ip");
                    showUnvalidIpAlert();
                }
            }
        });

        
        btnHome.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                nav.navigatToScene(new mainBase());
            }
        });
        
        ip = tfEnterIp.getText();

    }

    private boolean validate() {
        String IPADDRESS_PATTERN
                = "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
                + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
                + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
                + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
        Pattern pattern = Pattern.compile(IPADDRESS_PATTERN);
        Matcher matcher = pattern.matcher(ip);
        return matcher.matches();
    }

    private void showUnvalidIpAlert() {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("ERROR");
        alert.setContentText("please Enter vaild IP Number.");
        alert.showAndWait();
    }
}
