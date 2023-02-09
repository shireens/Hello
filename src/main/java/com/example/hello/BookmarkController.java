package com.example.hello;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class BookmarkController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }


}