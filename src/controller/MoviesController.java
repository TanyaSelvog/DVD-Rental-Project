package controller;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import model.Movies;
import utils.MoviesDB;

import java.net.URL;
import java.util.ResourceBundle;

public class MoviesController implements Initializable {
    public TableView moviesTable;
    public TableColumn rating;
    public TableColumn titleColumn;
    public TableColumn yearColumn;
    public TextField searchTF;

    private ObservableList<Movies> moviesList = MoviesDB.getMovieList();
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
moviesTable.setItems(moviesList);
        rating.setCellValueFactory(new PropertyValueFactory<>("rating"));
        titleColumn.setCellValueFactory(new PropertyValueFactory<>("title"));
        yearColumn.setCellValueFactory(new PropertyValueFactory<>("movieYear"));
    }

    public void onClickClassics(ActionEvent actionEvent) {
        
    }

    public void onClickAction(ActionEvent actionEvent) {
    }

    public void onClickFamily(ActionEvent actionEvent) {
    }

    public void onClickComedy(ActionEvent actionEvent) {
    }

    public void onClickDrama(ActionEvent actionEvent) {
    }

    public void onSearchClick(ActionEvent actionEvent) {
    }

    public void onHomeClick(ActionEvent actionEvent) throws Exception{


        Parent root = FXMLLoader.load(getClass().getResource("/views/homepage.fxml"));
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setTitle("Movies That Got Made");
        Scene scene = new Scene(root, 861, 619);
        stage.setScene(scene);
        stage.show();
    }
}
