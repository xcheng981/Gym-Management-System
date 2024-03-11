package edu.northeastern.mygym.user;

public class Admin extends User {

    public Admin(String userName, String name, String email, String password) {
        super(userName, name, email, password);
    }

    public Admin(Profile profile) {
        super(profile);
    }

}