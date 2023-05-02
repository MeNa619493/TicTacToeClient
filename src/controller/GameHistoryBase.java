package controller;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;

public  class GameHistoryBase extends GridPane {

    protected final ColumnConstraints columnConstraints;
    protected final ColumnConstraints columnConstraints0;
    protected final ColumnConstraints columnConstraints1;
    protected final RowConstraints rowConstraints;
    protected final RowConstraints rowConstraints0;
    protected final RowConstraints rowConstraints1;
    protected final RowConstraints rowConstraints2;
    protected final RowConstraints rowConstraints3;
    protected final RowConstraints rowConstraints4;
    protected final RowConstraints rowConstraints5;
    protected final RowConstraints rowConstraints6;
    protected final RowConstraints rowConstraints7;
    protected final RowConstraints rowConstraints8;
    protected final RowConstraints rowConstraints9;
    protected final RowConstraints rowConstraints10;
    protected final RowConstraints rowConstraints11;
    protected final FlowPane flowPane;
    protected final FlowPane flowPane0;
    protected final Label label;
    protected final Label label0;
    protected final Label fristUserLabel;
    protected final Line line;
    protected final Label label1;
    protected final Button watchGameFristUserButton;
    protected final FlowPane flowPane1;
    protected final Label label2;
    protected final Label label3;
    protected final Label secondUserLabel;
    protected final Button watchGameSecondUserButton;
    protected final Line line0;
    protected final FlowPane flowPane2;
    protected final Label label4;
    protected final Label label5;
    protected final Label thirdUserlabel;
    protected final Line line1;
    protected final FlowPane flowPane3;
    protected final Label label6;
    protected final Label label7;
    protected final Label yourFriendLabel;
    protected final Line line2;
    protected final FlowPane flowPane4;
    protected final Label label8;
    protected final Label label9;
    protected final Label ComputerLabel;
    protected final Line line3;
    protected final Button watchGameThirdUserButton;
    protected final Button watchGameyourfriendButton;
    protected final Button watchGamewithcompuerButton;
    protected final Button main;

    public GameHistoryBase() {

        columnConstraints = new ColumnConstraints();
        columnConstraints0 = new ColumnConstraints();
        columnConstraints1 = new ColumnConstraints();
        rowConstraints = new RowConstraints();
        rowConstraints0 = new RowConstraints();
        rowConstraints1 = new RowConstraints();
        rowConstraints2 = new RowConstraints();
        rowConstraints3 = new RowConstraints();
        rowConstraints4 = new RowConstraints();
        rowConstraints5 = new RowConstraints();
        rowConstraints6 = new RowConstraints();
        rowConstraints7 = new RowConstraints();
        rowConstraints8 = new RowConstraints();
        rowConstraints9 = new RowConstraints();
        rowConstraints10 = new RowConstraints();
        rowConstraints11 = new RowConstraints();
        flowPane = new FlowPane();
        flowPane0 = new FlowPane();
        label = new Label();
        label0 = new Label();
        fristUserLabel = new Label();
        line = new Line();
        label1 = new Label();
        watchGameFristUserButton = new Button();
        flowPane1 = new FlowPane();
        label2 = new Label();
        label3 = new Label();
        secondUserLabel = new Label();
        watchGameSecondUserButton = new Button();
        line0 = new Line();
        flowPane2 = new FlowPane();
        label4 = new Label();
        label5 = new Label();
        thirdUserlabel = new Label();
        line1 = new Line();
        flowPane3 = new FlowPane();
        label6 = new Label();
        label7 = new Label();
        yourFriendLabel = new Label();
        line2 = new Line();
        flowPane4 = new FlowPane();
        label8 = new Label();
        label9 = new Label();
        ComputerLabel = new Label();
        line3 = new Line();
        watchGameThirdUserButton = new Button();
        watchGameyourfriendButton = new Button();
        watchGamewithcompuerButton = new Button();
        main = new Button();

        setAlignment(javafx.geometry.Pos.CENTER);
        getStylesheets().add("/view/../Photo/paneCss.css");

        columnConstraints.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints.setMaxWidth(Double.MAX_VALUE);
        columnConstraints.setMinWidth(10.0);
        columnConstraints.setPrefWidth(203.0);

        columnConstraints0.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints0.setMaxWidth(Double.MAX_VALUE);
        columnConstraints0.setMinWidth(10.0);
        columnConstraints0.setPrefWidth(203.0);

        columnConstraints1.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints1.setMaxWidth(Double.MAX_VALUE);
        columnConstraints1.setMinWidth(10.0);

        rowConstraints.setMaxHeight(78.0);
        rowConstraints.setMinHeight(10.0);
        rowConstraints.setPrefHeight(55.0);
        rowConstraints.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints0.setMaxHeight(74.0);
        rowConstraints0.setMinHeight(0.0);
        rowConstraints0.setPrefHeight(55.0);
        rowConstraints0.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints1.setMaxHeight(65.0);
        rowConstraints1.setMinHeight(0.0);
        rowConstraints1.setPrefHeight(0.0);
        rowConstraints1.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints2.setMaxHeight(85.0);
        rowConstraints2.setMinHeight(10.0);
        rowConstraints2.setPrefHeight(55.0);
        rowConstraints2.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints3.setMaxHeight(92.0);
        rowConstraints3.setMinHeight(0.0);
        rowConstraints3.setPrefHeight(0.0);
        rowConstraints3.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints4.setMaxHeight(110.0);
        rowConstraints4.setMinHeight(10.0);
        rowConstraints4.setPrefHeight(55.0);
        rowConstraints4.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints5.setMaxHeight(113.0);
        rowConstraints5.setMinHeight(2.0);
        rowConstraints5.setPrefHeight(0.0);
        rowConstraints5.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints6.setMaxHeight(227.0);
        rowConstraints6.setMinHeight(10.0);
        rowConstraints6.setPrefHeight(55.0);
        rowConstraints6.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints7.setMaxHeight(227.0);
        rowConstraints7.setMinHeight(7.0);
        rowConstraints7.setPrefHeight(0.0);
        rowConstraints7.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints8.setMaxHeight(227.0);
        rowConstraints8.setMinHeight(10.0);
        rowConstraints8.setPrefHeight(55.0);
        rowConstraints8.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints9.setMaxHeight(227.0);
        rowConstraints9.setMinHeight(0.0);
        rowConstraints9.setPrefHeight(0.0);
        rowConstraints9.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints10.setMaxHeight(113.0);
        rowConstraints10.setMinHeight(10.0);
        rowConstraints10.setPrefHeight(46.0);
        rowConstraints10.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints11.setMaxHeight(113.0);
        rowConstraints11.setMinHeight(10.0);
        rowConstraints11.setPrefHeight(46.0);
        rowConstraints11.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        GridPane.setRowIndex(flowPane, 1);
        flowPane.setPrefHeight(200.0);
        flowPane.setPrefWidth(200.0);

        flowPane0.setPrefHeight(36.0);
        flowPane0.setPrefWidth(161.0);

        label.setAlignment(javafx.geometry.Pos.CENTER);
        label.getStyleClass().add("labelstyle");
        label.getStylesheets().add("/view/../Photo/label.css");
        label.setText("  vs");
        label.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        label.setFont(new Font("System Bold", 23.0));

        label0.setText("   ");

        fristUserLabel.getStyleClass().add("labelstyle");
        fristUserLabel.getStylesheets().add("/view/../Photo/label.css");
        fristUserLabel.setText("fristUSer");
        fristUserLabel.setFont(new Font("System Bold", 25.0));

        GridPane.setRowIndex(line, 2);
        line.setEndX(2000.0);
        line.setEndY(-3.3389225006103516);
        line.setStartX(-100.0);
        line.setStrokeMiterLimit(40.0);
        line.setStrokeWidth(3.0);

        label1.setAlignment(javafx.geometry.Pos.CENTER);
        label1.setPrefHeight(36.0);
        label1.setPrefWidth(154.0);
        label1.setText("History");
        label1.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        label1.setTextFill(javafx.scene.paint.Color.valueOf("#dd0606"));
        label1.setFont(new Font("System Bold", 33.0));

        GridPane.setColumnIndex(watchGameFristUserButton, 2);
        GridPane.setRowIndex(watchGameFristUserButton, 1);
        watchGameFristUserButton.setAlignment(javafx.geometry.Pos.CENTER);
        watchGameFristUserButton.setCancelButton(true);
        watchGameFristUserButton.setId("myButton");
        watchGameFristUserButton.setMnemonicParsing(false);
        watchGameFristUserButton.setPrefHeight(39.0);
        watchGameFristUserButton.setPrefWidth(181.0);
        watchGameFristUserButton.getStyleClass().add("myButton");
        watchGameFristUserButton.getStylesheets().add("/view/../Photo/buttonStyle.css");
        watchGameFristUserButton.setText("Watch  The Game");
        watchGameFristUserButton.setTextAlignment(javafx.scene.text.TextAlignment.RIGHT);
        watchGameFristUserButton.setFont(new Font("System Bold", 15.0));

        GridPane.setRowIndex(flowPane1, 3);
        flowPane1.setPrefHeight(55.0);
        flowPane1.setPrefWidth(369.0);

        label2.getStyleClass().add("labelstyle");
        label2.getStylesheets().add("/view/../Photo/label.css");
        label2.setText("  vs");
        label2.setFont(new Font("System Bold", 23.0));

        label3.setText("   ");

        secondUserLabel.getStyleClass().add("labelstyle");
        secondUserLabel.getStylesheets().add("/view/../Photo/label.css");
        secondUserLabel.setText("Seconduser");
        secondUserLabel.setFont(new Font("System Bold", 25.0));

        GridPane.setColumnIndex(watchGameSecondUserButton, 2);
        GridPane.setRowIndex(watchGameSecondUserButton, 3);
        watchGameSecondUserButton.setAlignment(javafx.geometry.Pos.CENTER);
        watchGameSecondUserButton.setId("myButton");
        watchGameSecondUserButton.setMnemonicParsing(false);
        watchGameSecondUserButton.setPrefHeight(25.0);
        watchGameSecondUserButton.setPrefWidth(181.0);
        watchGameSecondUserButton.getStyleClass().add("myButton");
        watchGameSecondUserButton.getStylesheets().add("/view/../Photo/buttonStyle.css");
        watchGameSecondUserButton.setText("Watch The Game");
        watchGameSecondUserButton.setFont(new Font("System Bold", 15.0));

        GridPane.setRowIndex(line0, 4);
        line0.setEndX(2000.0);
        line0.setEndY(-0.12100553512573242);
        line0.setStartX(-100.0);
        line0.setStrokeWidth(3.0);
        GridPane.setMargin(line0, new Insets(0.0));

        GridPane.setRowIndex(flowPane2, 5);
        flowPane2.setPrefHeight(43.0);
        flowPane2.setPrefWidth(200.0);

        label4.getStyleClass().add("labelstyle");
        label4.getStylesheets().add("/view/../Photo/label.css");
        label4.setText("  vs");
        label4.setFont(new Font("System Bold", 23.0));

        label5.setText("   ");

        thirdUserlabel.getStyleClass().add("labelstyle");
        thirdUserlabel.getStylesheets().add("/view/../Photo/label.css");
        thirdUserlabel.setText("ThridUser");
        thirdUserlabel.setFont(new Font("System Bold", 24.0));

        GridPane.setRowIndex(line1, 6);
        line1.setEndX(2000.0);
        line1.setEndY(0.3591485023498535);
        line1.setStartX(-100.0);
        line1.setStrokeWidth(3.0);

        GridPane.setRowIndex(flowPane3, 7);
        flowPane3.setPrefHeight(200.0);
        flowPane3.setPrefWidth(200.0);

        label6.getStyleClass().add("labelstyle");
        label6.getStylesheets().add("/view/../Photo/label.css");
        label6.setText("  vs");
        label6.setFont(new Font("System Bold", 23.0));

        label7.setText("   ");

        yourFriendLabel.getStyleClass().add("labelstyle");
        yourFriendLabel.getStylesheets().add("/view/../Photo/label.css");
        yourFriendLabel.setText("yourFriend");
        yourFriendLabel.setFont(new Font("System Bold", 24.0));

        GridPane.setRowIndex(line2, 8);
        line2.setEndX(2000.0);
        line2.setEndY(-1.3049535751342773);
        line2.setStartX(-100.0);
        line2.setStrokeWidth(3.0);

        GridPane.setRowIndex(flowPane4, 9);
        flowPane4.setPrefHeight(200.0);
        flowPane4.setPrefWidth(200.0);

        label8.getStyleClass().add("labelstyle");
        label8.getStylesheets().add("/view/../Photo/label.css");
        label8.setText("  vs");
        label8.setFont(new Font("System Bold", 23.0));

        label9.setText("   ");

        ComputerLabel.getStyleClass().add("labelstyle");
        ComputerLabel.getStylesheets().add("/view/../Photo/label.css");
        ComputerLabel.setText("Computer");
        ComputerLabel.setFont(new Font("System Bold", 24.0));

        GridPane.setRowIndex(line3, 10);
        line3.setEndX(2000.0);
        line3.setEndY(2.0323052406311035);
        line3.setStartX(-100.0);
        line3.setStrokeWidth(3.0);

        GridPane.setColumnIndex(watchGameThirdUserButton, 2);
        GridPane.setRowIndex(watchGameThirdUserButton, 5);
        watchGameThirdUserButton.setAlignment(javafx.geometry.Pos.CENTER);
        watchGameThirdUserButton.setId("myButton");
        watchGameThirdUserButton.setMnemonicParsing(false);
        watchGameThirdUserButton.setPrefHeight(25.0);
        watchGameThirdUserButton.setPrefWidth(181.0);
        watchGameThirdUserButton.getStyleClass().add("myButton");
        watchGameThirdUserButton.getStylesheets().add("/view/../Photo/buttonStyle.css");
        watchGameThirdUserButton.setText("Watch The Game");
        watchGameThirdUserButton.setFont(new Font("System Bold", 15.0));

        GridPane.setColumnIndex(watchGameyourfriendButton, 2);
        GridPane.setRowIndex(watchGameyourfriendButton, 7);
        watchGameyourfriendButton.setAlignment(javafx.geometry.Pos.CENTER);
        watchGameyourfriendButton.setId("myButton");
        watchGameyourfriendButton.setMnemonicParsing(false);
        watchGameyourfriendButton.setPrefHeight(25.0);
        watchGameyourfriendButton.setPrefWidth(181.0);
        watchGameyourfriendButton.getStylesheets().add("/view/../Photo/buttonStyle.css");
        watchGameyourfriendButton.setText("Watch The Game");
        watchGameyourfriendButton.setFont(new Font("System Bold", 15.0));

        GridPane.setColumnIndex(watchGamewithcompuerButton, 2);
        GridPane.setRowIndex(watchGamewithcompuerButton, 9);
        watchGamewithcompuerButton.setAlignment(javafx.geometry.Pos.CENTER);
        watchGamewithcompuerButton.setId("myButton");
        watchGamewithcompuerButton.setMnemonicParsing(false);
        watchGamewithcompuerButton.setPrefHeight(25.0);
        watchGamewithcompuerButton.setPrefWidth(181.0);
        watchGamewithcompuerButton.getStylesheets().add("/view/../Photo/buttonStyle.css");
        watchGamewithcompuerButton.setText("Watch The Game");
        watchGamewithcompuerButton.setFont(new Font("System Bold", 15.0));

        GridPane.setColumnIndex(main, 2);
        GridPane.setRowIndex(main, 11);
        main.setId("myButton");
        main.setMnemonicParsing(false);
        main.getStylesheets().add("/view/../Photo/buttonStyle.css");
        main.setText("Main");
        GridPane.setMargin(main, new Insets(30.0, 10.0, 20.0, 100.0));
        main.setFont(new Font("Mongolian Baiti", 19.0));

        getColumnConstraints().add(columnConstraints);
        getColumnConstraints().add(columnConstraints0);
        getColumnConstraints().add(columnConstraints1);
        getRowConstraints().add(rowConstraints);
        getRowConstraints().add(rowConstraints0);
        getRowConstraints().add(rowConstraints1);
        getRowConstraints().add(rowConstraints2);
        getRowConstraints().add(rowConstraints3);
        getRowConstraints().add(rowConstraints4);
        getRowConstraints().add(rowConstraints5);
        getRowConstraints().add(rowConstraints6);
        getRowConstraints().add(rowConstraints7);
        getRowConstraints().add(rowConstraints8);
        getRowConstraints().add(rowConstraints9);
        getRowConstraints().add(rowConstraints10);
        getRowConstraints().add(rowConstraints11);
        flowPane0.getChildren().add(label);
        flowPane0.getChildren().add(label0);
        flowPane0.getChildren().add(fristUserLabel);
        flowPane.getChildren().add(flowPane0);
        getChildren().add(flowPane);
        getChildren().add(line);
        getChildren().add(label1);
        getChildren().add(watchGameFristUserButton);
        flowPane1.getChildren().add(label2);
        flowPane1.getChildren().add(label3);
        flowPane1.getChildren().add(secondUserLabel);
        getChildren().add(flowPane1);
        getChildren().add(watchGameSecondUserButton);
        getChildren().add(line0);
        flowPane2.getChildren().add(label4);
        flowPane2.getChildren().add(label5);
        flowPane2.getChildren().add(thirdUserlabel);
        getChildren().add(flowPane2);
        getChildren().add(line1);
        flowPane3.getChildren().add(label6);
        flowPane3.getChildren().add(label7);
        flowPane3.getChildren().add(yourFriendLabel);
        getChildren().add(flowPane3);
        getChildren().add(line2);
        flowPane4.getChildren().add(label8);
        flowPane4.getChildren().add(label9);
        flowPane4.getChildren().add(ComputerLabel);
        getChildren().add(flowPane4);
        getChildren().add(line3);
        getChildren().add(watchGameThirdUserButton);
        getChildren().add(watchGameyourfriendButton);
        getChildren().add(watchGamewithcompuerButton);
        getChildren().add(main);

    }
}
