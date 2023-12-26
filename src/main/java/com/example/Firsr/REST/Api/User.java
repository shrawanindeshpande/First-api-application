package com.example.Firsr.REST.Api;
public class User {
    private String userName;
    private int age;
    private int userID;

    public User() {

    }

    public User(String userName, int age, int userID) {
        this.userName = userName;
        this.age = age;
        this.userID=userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }
}
