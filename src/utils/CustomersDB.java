package utils;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import model.Customers;
import model.Movies;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomersDB {

    public static ObservableList<Customers> getCustomerList() {
        ObservableList<Customers> customersList = FXCollections.observableArrayList();

        try {
            String sqlStatement = "SELECT * FROM customer";
            PreparedStatement ps = ConnectionJDBC.connect().prepareStatement(sqlStatement);

            ResultSet result = ps.executeQuery();
            while (result.next()) {

                int custID = result.getInt("customer_ID");
                String firstName = result.getString("first_name");
                String lastName = result.getString("last_name");

                Customers cust = new Customers(custID, firstName, lastName);
                customersList.add(cust);
            }
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
        return customersList;
    }
}
