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

public  class AviableFriend extends GridPane {

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
    protected final RowConstraints rowConstraints12;
    protected final RowConstraints rowConstraints13;
    protected final RowConstraints rowConstraints14;
    protected final FlowPane flowPane;
    protected final FlowPane flowPane0;
    protected final Label label;
    protected final Label label0;
    protected final Label FristUserLabe;
    protected final Line line;
    protected final Label label1;
    protected final Button AsktoplayFristUser;
    protected final FlowPane flowPane1;
    protected final Label label2;
    protected final Label label3;
    protected final Label seconduserLabel;
    protected final Button AsktoplaySecondUser;
    protected final Line line0;
    protected final FlowPane flowPane2;
    protected final Label label4;
    protected final Label label5;
    protected final Label thirdUserLabel;
    protected final Line line1;
    protected final FlowPane flowPane3;
    protected final Label label6;
    protected final Label label7;
    protected final Label fourthUserLabel;
    protected final Line line2;
    protected final FlowPane flowPane4;
    protected final Label label8;
    protected final Label label9;
    protected final Label fifthUserLabel;
    protected final Line line3;
    protected final Button AsktoplaythirdUser;
    protected final Button AsktoplayfourthUser;
    protected final Button AsktoplayfifthUser;
    protected final FlowPane flowPane5;
    protected final Label label10;
    protected final Label label11;
    protected final Label sixthUserLabel;
    protected final Line line4;
    protected final FlowPane flowPane6;
    protected final Label label12;
    protected final Label label13;
    protected final Label seventhUserLabel;
    protected final Button AsktoplayseventhUser;
    protected final Line line5;
    protected final Button button;

    public AviableFriend() {

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
        rowConstraints12 = new RowConstraints();
        rowConstraints13 = new RowConstraints();
        rowConstraints14 = new RowConstraints();
        flowPane = new FlowPane();
        flowPane0 = new FlowPane();
        label = new Label();
        label0 = new Label();
        FristUserLabe = new Label();
        line = new Line();
        label1 = new Label();
        AsktoplayFristUser = new Button();
        flowPane1 = new FlowPane();
        label2 = new Label();
        label3 = new Label();
        seconduserLabel = new Label();
        AsktoplaySecondUser = new Button();
        line0 = new Line();
        flowPane2 = new FlowPane();
        label4 = new Label();
        label5 = new Label();
        thirdUserLabel = new Label();
        line1 = new Line();
        flowPane3 = new FlowPane();
        label6 = new Label();
        label7 = new Label();
        fourthUserLabel = new Label();
        line2 = new Line();
        flowPane4 = new FlowPane();
        label8 = new Label();
        label9 = new Label();
        fifthUserLabel = new Label();
        line3 = new Line();
        AsktoplaythirdUser = new Button();
        AsktoplayfourthUser = new Button();
        AsktoplayfifthUser = new Button();
        flowPane5 = new FlowPane();
        label10 = new Label();
        label11 = new Label();
        sixthUserLabel = new Label();
        line4 = new Line();
        flowPane6 = new FlowPane();
        label12 = new Label();
        label13 = new Label();
        seventhUserLabel = new Label();
        AsktoplayseventhUser = new Button();
        line5 = new Line();
        button = new Button();

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
        rowConstraints10.setPrefHeight(55.0);
        rowConstraints10.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints11.setMaxHeight(113.0);
        rowConstraints11.setMinHeight(10.0);
        rowConstraints11.setPrefHeight(0.0);
        rowConstraints11.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints12.setMaxHeight(113.0);
        rowConstraints12.setMinHeight(10.0);
        rowConstraints12.setPrefHeight(55.0);
        rowConstraints12.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints13.setMaxHeight(113.0);
        rowConstraints13.setMinHeight(10.0);
        rowConstraints13.setPrefHeight(0.0);
        rowConstraints13.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints14.setMaxHeight(113.0);
        rowConstraints14.setMinHeight(10.0);
        rowConstraints14.setPrefHeight(36.0);
        rowConstraints14.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

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

        FristUserLabe.getStyleClass().add("labelstyle");
        FristUserLabe.getStylesheets().add("/view/../Photo/label.css");
        FristUserLabe.setText("fristUSer");
        FristUserLabe.setFont(new Font("System Bold", 25.0));

        GridPane.setRowIndex(line, 2);
        line.setEndX(2000.0);
        line.setEndY(-3.3389225006103516);
        line.setStartX(-100.0);
        line.setStrokeMiterLimit(40.0);
        line.setStrokeWidth(3.0);

        label1.setAlignment(javafx.geometry.Pos.CENTER);
        label1.setContentDisplay(javafx.scene.control.ContentDisplay.BOTTOM);
        label1.setPrefHeight(36.0);
        label1.setPrefWidth(154.0);
        label1.setText("Online Friend");
        label1.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        label1.setTextFill(javafx.scene.paint.Color.valueOf("#dd0606"));
        label1.setFont(new Font("System Bold", 24.0));

        GridPane.setColumnIndex(AsktoplayFristUser, 2);
        GridPane.setRowIndex(AsktoplayFristUser, 1);
        AsktoplayFristUser.setAlignment(javafx.geometry.Pos.CENTER);
        AsktoplayFristUser.setCancelButton(true);
        AsktoplayFristUser.setMnemonicParsing(false);
        AsktoplayFristUser.setPrefHeight(31.0);
        AsktoplayFristUser.setPrefWidth(178.0);
        AsktoplayFristUser.getStyleClass().add("myButton");
        AsktoplayFristUser.getStylesheets().add("/view/../Photo/buttonStylemo.css");
        AsktoplayFristUser.setText("Ask To Play");
        AsktoplayFristUser.setTextAlignment(javafx.scene.text.TextAlignment.RIGHT);
        GridPane.setMargin(AsktoplayFristUser, new Insets(10.0));

        GridPane.setRowIndex(flowPane1, 3);
        flowPane1.setPrefHeight(55.0);
        flowPane1.setPrefWidth(369.0);

        label2.getStyleClass().add("labelstyle");
        label2.getStylesheets().add("/view/../Photo/label.css");
        label2.setText("  vs");
        label2.setFont(new Font("System Bold", 23.0));

        label3.setText("   ");

        seconduserLabel.getStyleClass().add("labelstyle");
        seconduserLabel.getStylesheets().add("/view/../Photo/label.css");
        seconduserLabel.setText("Seconduser");
        seconduserLabel.setFont(new Font("System Bold", 25.0));

        GridPane.setColumnIndex(AsktoplaySecondUser, 2);
        GridPane.setRowIndex(AsktoplaySecondUser, 3);
        GridPane.setValignment(AsktoplaySecondUser, javafx.geometry.VPos.CENTER);
        AsktoplaySecondUser.setAlignment(javafx.geometry.Pos.CENTER);
        AsktoplaySecondUser.setMnemonicParsing(false);
        AsktoplaySecondUser.setPrefHeight(31.0);
        AsktoplaySecondUser.setPrefWidth(178.0);
        AsktoplaySecondUser.getStyleClass().add("myButton");
        AsktoplaySecondUser.getStylesheets().add("/view/../Photo/buttonStylemo.css");
        AsktoplaySecondUser.setText("Ask To Play");
        GridPane.setMargin(AsktoplaySecondUser, new Insets(10.0));

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

        thirdUserLabel.getStyleClass().add("labelstyle");
        thirdUserLabel.getStylesheets().add("/view/../Photo/label.css");
        thirdUserLabel.setText("ThridUser");
        thirdUserLabel.setFont(new Font("System Bold", 24.0));

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

        fourthUserLabel.getStyleClass().add("labelstyle");
        fourthUserLabel.getStylesheets().add("/view/../Photo/label.css");
        fourthUserLabel.setText("FourthUser");
        fourthUserLabel.setFont(new Font("System Bold", 24.0));

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

        fifthUserLabel.getStyleClass().add("labelstyle");
        fifthUserLabel.getStylesheets().add("/view/../Photo/label.css");
        fifthUserLabel.setText("FifthUser");
        fifthUserLabel.setFont(new Font("System Bold", 24.0));

        GridPane.setRowIndex(line3, 10);
        line3.setEndX(2000.0);
        line3.setEndY(2.0323052406311035);
        line3.setStartX(-100.0);
        line3.setStrokeWidth(3.0);

        GridPane.setColumnIndex(AsktoplaythirdUser, 2);
        GridPane.setRowIndex(AsktoplaythirdUser, 5);
        AsktoplaythirdUser.setAlignment(javafx.geometry.Pos.CENTER);
        AsktoplaythirdUser.setMnemonicParsing(false);
        AsktoplaythirdUser.setPrefHeight(25.0);
        AsktoplaythirdUser.setPrefWidth(178.0);
        AsktoplaythirdUser.getStyleClass().add("myButton");
        AsktoplaythirdUser.getStylesheets().add("/view/../Photo/buttonStylemo.css");
        AsktoplaythirdUser.setText("Ask To Play");
        GridPane.setMargin(AsktoplaythirdUser, new Insets(10.0));

        GridPane.setColumnIndex(AsktoplayfourthUser, 2);
        GridPane.setRowIndex(AsktoplayfourthUser, 7);
        AsktoplayfourthUser.setAlignment(javafx.geometry.Pos.CENTER);
        AsktoplayfourthUser.setMnemonicParsing(false);
        AsktoplayfourthUser.setPrefHeight(25.0);
        AsktoplayfourthUser.setPrefWidth(178.0);
        AsktoplayfourthUser.getStyleClass().add("myButton");
        AsktoplayfourthUser.getStylesheets().add("/view/../Photo/buttonStylemo.css");
        AsktoplayfourthUser.setText("Ask To Play");
        GridPane.setMargin(AsktoplayfourthUser, new Insets(10.0));

        GridPane.setColumnIndex(AsktoplayfifthUser, 2);
        GridPane.setRowIndex(AsktoplayfifthUser, 9);
        AsktoplayfifthUser.setAlignment(javafx.geometry.Pos.CENTER);
        AsktoplayfifthUser.setMnemonicParsing(false);
        AsktoplayfifthUser.setPrefHeight(25.0);
        AsktoplayfifthUser.setPrefWidth(178.0);
        AsktoplayfifthUser.getStyleClass().add("myButton");
        AsktoplayfifthUser.getStylesheets().add("/view/../Photo/buttonStylemo.css");
        AsktoplayfifthUser.setText("Ask To Play");
        GridPane.setMargin(AsktoplayfifthUser, new Insets(10.0));

        GridPane.setRowIndex(flowPane5, 11);
        flowPane5.setPrefHeight(200.0);
        flowPane5.setPrefWidth(200.0);

        label10.getStyleClass().add("labelstyle");
        label10.getStylesheets().add("/view/../Photo/label.css");
        label10.setText("  vs");
        label10.setFont(new Font("System Bold", 23.0));

        label11.setText("   ");

        sixthUserLabel.getStyleClass().add("labelstyle");
        sixthUserLabel.getStylesheets().add("/view/../Photo/label.css");
        sixthUserLabel.setText("sixthUser");
        sixthUserLabel.setFont(new Font("System Bold", 24.0));

        GridPane.setRowIndex(line4, 12);
        line4.setEndX(2000.0);
        line4.setStartX(-100.0);
        line4.setStrokeWidth(3.0);

        GridPane.setRowIndex(flowPane6, 13);
        flowPane6.setPrefHeight(200.0);
        flowPane6.setPrefWidth(200.0);

        label12.getStyleClass().add("labelstyle");
        label12.getStylesheets().add("/view/../Photo/label.css");
        label12.setText("  vs");
        label12.setFont(new Font("System Bold", 23.0));

        label13.setText("   ");

        seventhUserLabel.getStyleClass().add("labelstyle");
        seventhUserLabel.getStylesheets().add("/view/../Photo/label.css");
        seventhUserLabel.setText("sixthUser");
        seventhUserLabel.setFont(new Font("System Bold", 24.0));

        GridPane.setColumnIndex(AsktoplayseventhUser, 2);
        GridPane.setRowIndex(AsktoplayseventhUser, 13);
        AsktoplayseventhUser.setAlignment(javafx.geometry.Pos.CENTER);
        AsktoplayseventhUser.setMnemonicParsing(false);
        AsktoplayseventhUser.setPrefHeight(31.0);
        AsktoplayseventhUser.setPrefWidth(178.0);
        AsktoplayseventhUser.getStyleClass().add("myButton");
        AsktoplayseventhUser.getStylesheets().add("/view/../Photo/buttonStylemo.css");
        AsktoplayseventhUser.setText("Ask To Play");
        GridPane.setMargin(AsktoplayseventhUser, new Insets(10.0));

        GridPane.setRowIndex(line5, 14);
        line5.setEndX(2000.0);
        line5.setStartX(-100.0);
        line5.setStrokeWidth(3.0);

        GridPane.setColumnIndex(button, 2);
        GridPane.setRowIndex(button, 11);
        button.setAlignment(javafx.geometry.Pos.CENTER);
        button.setMnemonicParsing(false);
        button.setPrefHeight(31.0);
        button.setPrefWidth(178.0);
        button.getStyleClass().add("myButton");
        button.getStylesheets().add("/view/../Photo/buttonStylemo.css");
        button.setText("Ask To Play");
        GridPane.setMargin(button, new Insets(10.0));

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
        getRowConstraints().add(rowConstraints12);
        getRowConstraints().add(rowConstraints13);
        getRowConstraints().add(rowConstraints14);
        flowPane0.getChildren().add(label);
        flowPane0.getChildren().add(label0);
        flowPane0.getChildren().add(FristUserLabe);
        flowPane.getChildren().add(flowPane0);
        getChildren().add(flowPane);
        getChildren().add(line);
        getChildren().add(label1);
        getChildren().add(AsktoplayFristUser);
        flowPane1.getChildren().add(label2);
        flowPane1.getChildren().add(label3);
        flowPane1.getChildren().add(seconduserLabel);
        getChildren().add(flowPane1);
        getChildren().add(AsktoplaySecondUser);
        getChildren().add(line0);
        flowPane2.getChildren().add(label4);
        flowPane2.getChildren().add(label5);
        flowPane2.getChildren().add(thirdUserLabel);
        getChildren().add(flowPane2);
        getChildren().add(line1);
        flowPane3.getChildren().add(label6);
        flowPane3.getChildren().add(label7);
        flowPane3.getChildren().add(fourthUserLabel);
        getChildren().add(flowPane3);
        getChildren().add(line2);
        flowPane4.getChildren().add(label8);
        flowPane4.getChildren().add(label9);
        flowPane4.getChildren().add(fifthUserLabel);
        getChildren().add(flowPane4);
        getChildren().add(line3);
        getChildren().add(AsktoplaythirdUser);
        getChildren().add(AsktoplayfourthUser);
        getChildren().add(AsktoplayfifthUser);
        flowPane5.getChildren().add(label10);
        flowPane5.getChildren().add(label11);
        flowPane5.getChildren().add(sixthUserLabel);
        getChildren().add(flowPane5);
        getChildren().add(line4);
        flowPane6.getChildren().add(label12);
        flowPane6.getChildren().add(label13);
        flowPane6.getChildren().add(seventhUserLabel);
        getChildren().add(flowPane6);
        getChildren().add(AsktoplayseventhUser);
        getChildren().add(line5);
        getChildren().add(button);
    }
}
