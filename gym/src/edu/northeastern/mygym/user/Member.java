package edu.northeastern.mygym.user;

public class Member extends User {

    public Member(String userName, String name, String email, String password) {
        super(userName, name, email, password);
    }

    public Member(Profile profile) {
        super(profile);
    }
}