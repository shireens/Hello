package com.example.hello;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ChoiceBox;

public class BookmarkController {
    @FXML
    private Label welcomeText;



    @FXML
    protected void  onSearchButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

}