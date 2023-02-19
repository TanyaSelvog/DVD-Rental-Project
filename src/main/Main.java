package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import utils.ConnectionJDBC;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("../views/homepage.fxml"));
        primaryStage.setTitle("Film School Movies");
        primaryStage.setScene(new Scene(root, 800, 675));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
        ConnectionJDBC.connect();
        System.out.println("okay");
    }
}
