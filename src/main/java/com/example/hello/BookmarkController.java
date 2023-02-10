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
    private String searchType = ""; //Movies or Books

    @FXML
    private ChoiceBox<String> secondChoiceBox;
    private String searchBy = ""; //Genre, Actor eyc.

   /* @FXML
    protected void  onSearchButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }*/

    @FXML
    private TextField searchText;
    private String searchString = "";

    @FXML
    private void onSearchButtonClick(ActionEvent event) {

        searchString = searchText.getText();
        welcomeText.setTextFill(Color.WHITE);

        if(searchType.equals("Movies") || searchType.equals("")){ // first Pain

            if(searchBy.equals("Movie-Search by Genre") || searchBy.equals("")){
                welcomeText.setText("Movie-Search by Genre: " + searchString);
            }else if(secondChoiceBox.getValue().equals("Movie-Search by Actor")){
                welcomeText.setText("Movie-Search by Actor: " + searchString);
            }else{
                //Please choose Movie-Search by Genre or Movie-Search by Actor
            }

        }else if (searchType.equals("Books")){

            if(searchBy.equals("Book-Search by Genre") || searchBy.equals("")){
                welcomeText.setText("Book-Search by Genre: " + searchString);
            }else if(secondChoiceBox.getValue().equals("Book-Search by Author")){
                welcomeText.setText("Book-Search by Author: " + searchString);
            }else{
                //Please choose Book-Search by Genre or Book-Search by Author
            }
        }else {
            // Please select search criteria (Movies/Books) and ("Movie-Search by Genre",
            //                                                   "Movie-Search by Actor",
            //                                                   "Book-Search by Genre",
            //                                                   "Book-Search by Author").
        }
    }

    @FXML
    private void onChoiceClick(ActionEvent event){
        searchType = firstChoiceBox.getValue();
    }

    @FXML
    private void onSecondChoiceClick(ActionEvent event){
        searchBy = secondChoiceBox.getValue();
    }
    //String lineText = text.getText().substring(line.getStart(), line.getStart() + line.getLength());
    //String lineText = seachText.getText().substring(line.getStart(), line.getStart() + line.getLength());

}