package model;

public class Customers {
    private int customerID;
    private String email;
    private String firstNameCust;
    private String lastNameCust;


    public Customers(int customerID, String email, String firstNameCust, String lastNameCust){
        this.customerID = customerID;
        this.email = email;
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
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
}
