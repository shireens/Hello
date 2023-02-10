package com.example.hello;
import com.example.hello.backend.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;

import java.util.Set;

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

    @FXML
    private TextField searchText;
    private String searchString = "";

    @FXML
    private ListView<String> myListView;
    private ObservableList<String> items = FXCollections.observableArrayList();

    @FXML
    private void initialize() {
        myListView.setItems(items);
    }

    @FXML
    private void onSearchButtonClick(ActionEvent event) {

        items.clear();
        searchString = searchText.getText();
        welcomeText.setTextFill(Color.WHITE);
        MovieSearch ms = new MovieSearch();
        BookSearch bs = new BookSearch();

        if(searchType.equals("Movies") || searchType.equals("")){ // first Pain

            if(searchBy.equals("Movie-Search by Title") || searchBy.equals("")){
                welcomeText.setText("Movie-Search by Title: " + searchString);

                Set<Movie> arr = ms.MovieByTitle(searchString);
                for(Movie m : arr){
                    items.add(m.getTitle());
                }
            }else if(secondChoiceBox.getValue().equals("Movie-Search by Actor")){
                welcomeText.setText("Movie-Search by Actor: " + searchString);
                Set<Movie> arr = ms.MovieByActor(searchString);
                for(Movie m : arr){
                    items.add(m.getTitle());
                }

            }else{
                //Please choose Movie-Search by Genre or Movie-Search by Actor
            }

        }else if (searchType.equals("Books")){

            if(searchBy.equals("Book-Search by Title") || searchBy.equals("")){
                welcomeText.setText("Book-Search by Title: " + searchString);

                Set<Book> arr = bs.searchBookName(searchString);
                for(Book b : arr){
                    items.add(b.getTitle());
                }
            }else if(searchBy.equals("Book-Search by Genre")){
                welcomeText.setText("Book-Search by Genre: " + searchString);

                Set<Book> arr = bs.SearchBookGenre(searchString);
                for(Book b : arr){
                    items.add(b.getTitle());
                }
            }else if (searchBy.equals("Book-Search by Author")){
                welcomeText.setText("Book-Search by Author: " + searchString);

                Set<Book> arr = bs.searchBookAuthor(searchString);
                for(Book b : arr){
                    items.add(b.getTitle());
                }
            }else{
                //Please choose Book-Search by Title/Author/Genre
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