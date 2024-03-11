package edu.northeastern.mygym.course;

import java.util.List;

public class CourseDirectory {
    private final List<Course> courses;

    public CourseDirectory(List<Course> courses) {
        this.courses = courses;
    }

    public List<Course> viewAllAvailableCourses() {
        return courses;
    }

    public Course findCourseById(String courseId) {
        for (Course course : courses) {
            if (course.getCourseId().equals(courseId)) {
                return course;
            }
        }
        return null;
    }

    public Course findCourseByName(String courseName) {
        for (Course course : courses) {
            if (course.getCourseName().equals(courseName)) {
                return course;
            }
        }
        return null;
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void removeCourse(String courseId) {
        courses.remove(findCourseById(courseId));
    }
}
