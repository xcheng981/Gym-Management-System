package edu.northeastern.mygym.course;

public class Reservation {
    private int reservationID;
    private String courseCode;
    private String courseName; // Adjust based on your schema
    private String userName;

    public Reservation(int reservationID, String courseCode, String courseName, String userName) {
        this.reservationID = reservationID;
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.userName = userName;
    }

    // Getter methods if needed

    @Override
    public String toString() {
        return String.format("ReservationID: %d, Course Code: %s, Course Name: %s, User Name: %s",
                reservationID, courseCode, courseName, userName);
    }
}

