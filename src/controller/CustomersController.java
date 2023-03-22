package controller;

import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class CustomersController implements Initializable {

    public TableColumn custID;
    public TableColumn firstName;
    public TableColumn lastName;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        custID.setCellValueFactory(new PropertyValueFactory<>("customerID"));
        firstName.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        lastName.setCellValueFactory(new PropertyValueFactory<>("lastName"));
    }


}
