package edu.northeastern.mygym.user;

public class User {
    private final Profile profile;

    public User(String userName, String name, String email, String password) {
        this.profile = new Profile(userName, name, email, password);
    }

    public User(Profile profile) {
        this.profile = profile;
    }

    public Profile getProfile() {
        return profile;
    }

    public String getUserName() {
        return profile.getUserName();
    }

    public String getName() {
        return profile.getName();
    }

    public String getEmail() {
        return profile.getEmail();
    }

    public String getPassword() {
        return profile.getPassword();
    }

    public void setUserName(String userName) {
        this.profile.setUserName(userName);
    }

    public void setName(String name) {
        this.profile.setName(name);
    }

    public void setEmail(String email) {
        this.profile.setEmail(email);
    }

    public void setPassword(String password) {
        this.profile.setPassword(password);
    }

    public boolean login(String password) {
        return getPassword().equals(password);
    }
}