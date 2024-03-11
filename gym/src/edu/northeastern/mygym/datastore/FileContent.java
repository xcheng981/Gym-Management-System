package edu.northeastern.mygym.datastore;

import edu.northeastern.mygym.course.Course;
import edu.northeastern.mygym.course.Reservation;
import edu.northeastern.mygym.user.User;

import java.util.List;

public class FileContent {
    private List<User> users;
    private List<Course> courses;
    private List<Reservation> reservations;

    public FileContent(List<User> users, List<Course> courses, List<Reservation> reservations) {
        this.users = users;
        this.courses = courses;
        this.reservations = reservations;
    }

    public List<User> getUsers() {
        return users;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }
}
