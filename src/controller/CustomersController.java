package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class CustomersController implements Initializable {

    public TableColumn custID;
    public TableColumn firstName;
    public TableColumn lastName;
    @FXML
    private Button homeBtn;
    @FXML
    private Button searchBtn;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        custID.setCellValueFactory(new PropertyValueFactory<>("customerID"));
        firstName.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        lastName.setCellValueFactory(new PropertyValueFactory<>("lastName"));
    }


    public void onHomeClick(ActionEvent actionEvent) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/views/movies.fxml"));
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setTitle("Movies that Got Made");
        Scene scene = new Scene(root, 861, 619);
        stage.setScene(scene);
        stage.show();
    }
}
