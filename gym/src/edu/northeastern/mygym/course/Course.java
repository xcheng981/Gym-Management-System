package edu.northeastern.mygym.course;

import java.time.LocalDateTime;
import java.util.List;

public class Course {
    private String courseId;
    private String courseName;
    private List<LocalDateTime> schedules;
    private String description;
    private int capacity;

    public Course(String courseId, String courseName, List<LocalDateTime> schedules, String description, int capacity) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.schedules = schedules;
        this.description = description;
        this.capacity = capacity;
    }

    public String getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public List<LocalDateTime> getSchedules() {
        return schedules;
    }

    public String getDescription() {
        return description;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setSchedules(List<LocalDateTime> schedules) {
        this.schedules = schedules;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
