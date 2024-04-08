package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

@FXML
private Button moviesBtn;
@FXML
private Button customersBtn;





        public void onMoviesClick(ActionEvent actionEvent) throws Exception{

                Parent root = FXMLLoader.load(getClass().getResource("/views/movies.fxml"));
                Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
                stage.setTitle("Movies that Got Made");
                Scene scene = new Scene(root, 861, 619);
                stage.setScene(scene);
                stage.show();
        }

        public void onReportsClick(ActionEvent actionEvent) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/views/reports.fxml"));
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
                stage.setTitle("Movies that Got Made");
        Scene scene = new Scene(root, 861, 619);
                stage.setScene(scene);
                stage.show();
}
        public void onCustClick(ActionEvent actionEvent) throws Exception {
                Parent root = FXMLLoader.load(getClass().getResource("/views/customers.fxml"));
                Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
                stage.setTitle("Movies that Got Made");
                Scene scene = new Scene(root, 861, 619);
                stage.setScene(scene);
                stage.show();
        }
        @Override
        public void initialize(URL url, ResourceBundle resourceBundle) {

        }

}

