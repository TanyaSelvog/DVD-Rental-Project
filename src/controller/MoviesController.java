package controller;

import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class MoviesController implements Initializable {

    public TableColumn rating;
    public TableColumn titleColumn;
    public TableColumn yearColumn;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        rating.setCellValueFactory(new PropertyValueFactory<>("rating"));
        titleColumn.setCellValueFactory(new PropertyValueFactory<>("title"));
        yearColumn.setCellValueFactory(new PropertyValueFactory<>("movieYear"));
    }
}
