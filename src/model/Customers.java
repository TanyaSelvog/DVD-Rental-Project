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

    public Customers(int custID, String firstName, String lastName) {
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

    public String getLastNameCust(){
        return lastNameCust;
    }

    public void setLastNameCust(String lastNameCust){
        this.lastNameCust= lastNameCust;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
}
