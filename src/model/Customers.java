package model;

public class Customers {
    private int customerID;
    private String firstNameCust;
    private String lastNameCust;


    public Customers(int customerID, String firstNameCust, String lastNameCust){
        this.customerID = customerID;
        this.firstNameCust = firstNameCust;
        this.lastNameCust = lastNameCust;
    }

    public int getCustomerID(){
        return customerID;
    }

    public void setCustomerID(int customerID){
        this.customerID = customerID;
    }

    public String getFirstNameCust(){
        return firstNameCust;
    }

    public void setFirstNameCust(String firstNameCust){
        this.firstNameCust = firstNameCust;
    }
}
