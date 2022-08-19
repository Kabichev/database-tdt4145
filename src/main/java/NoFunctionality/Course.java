package main.java;
public class Course {

    private int courseID;
    private String courseName;
 
    public Course() {
        this.courseID = IDGenerator.createCourseID();
    }
    
    public int getCourseID() {
        return this.courseID;
    }

    public String getCourseName() {
        return this.courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}
