package com.example.hello;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

public class BookmarkController {
    @FXML
    private Label welcomeText;

    @FXML
    private Label testText;

    @FXML
    private ChoiceBox<String> firstChoiceBox;

    @FXML
    private ChoiceBox<String> secondChoiceBox;

   /* @FXML
    protected void  onSearchButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }*/

    @FXML

    private TextField searchText;

    @FXML
    private void onSearchButtonClick(ActionEvent event) {
        //searchText.getText();
        welcomeText.setText("Search text: " + searchText.getText() + "!!!!");
    }

    @FXML
    private void onChoiceClick(ActionEvent event){
        testText.setText("Selected item: " + firstChoiceBox.getValue() + "!!!!");
    }

    @FXML
    private void onSecondChoiceClick(ActionEvent event){
        testText.setText("Selected item: " + secondChoiceBox.getValue() + "!!!!");
    }
    //String lineText = text.getText().substring(line.getStart(), line.getStart() + line.getLength());
    //String lineText = seachText.getText().substring(line.getStart(), line.getStart() + line.getLength());

}