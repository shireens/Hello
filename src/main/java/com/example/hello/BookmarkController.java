package com.example.hello;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

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
        welcomeText.setTextFill(Color.WHITE);
        if(firstChoiceBox.getValue().equals("Movies") || firstChoiceBox.getValue().equals("Movies")){ // first Pain
            if(secondChoiceBox.getValue().equals("Movie-Search by Genre")){
                welcomeText.setText("Movie-Search by Genre: " + searchText.getText() + "!!!!");
            }else {
                welcomeText.setText("Movie-Search by Other: " + searchText.getText() + "!!!!");
            }

        }else if (firstChoiceBox.getValue().equals("Books")){
            welcomeText.setText("Book search: " + searchText.getText() + "!!!!");
        }else {
            // Error check
        }
    }

    @FXML
    private void onChoiceClick(ActionEvent event){
        testText.setText("Selected item: " + firstChoiceBox.getValue() + "!!!!");
        testText.setTextFill(Color.RED);
    }

    @FXML
    private void onSecondChoiceClick(ActionEvent event){
        testText.setText("Selected item: " + secondChoiceBox.getValue() + "!!!!");
        testText.setTextFill(Color.BLUE);
    }
    //String lineText = text.getText().substring(line.getStart(), line.getStart() + line.getLength());
    //String lineText = seachText.getText().substring(line.getStart(), line.getStart() + line.getLength());

}