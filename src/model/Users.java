package model;

public class Users {
    private String userName;
    private int userID;

    public Users (String userName, int userID){
        this.userName = userName;
        this.userID = userID;
    }

    public String getUserName(){
        return userName;}

    public void setUserName(String userName){
        this.userName = userName;
    }

    public int getUserID(){
        return userID;
    }

    public void setUserID(int userID){
        this.userID = userID;
    }
}
