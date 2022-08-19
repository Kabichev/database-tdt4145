package main.java;
import java.util.List;
// import java.util.stream.Collectors;

public final class User {

    private final int userID;
    private String email; 
    private String password;
    private String type;
    private List<Course> courses;
    

    public User(int userID, String email, String password, String type, List<Course> courses) {
        if(userID == null){
            this.userID = IDGenerator.createUserID();
        }else{
            this.userID = userID;
        }
        this.email = email;
        this.password = password;
        this.type = type;
        this.courses = courses;
    }

    public int getUserID() {
        return this.userID;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Course> getCourses() {
        return this.courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public void addCourse(Course course) {
        if(!courses.contains(course)){
            this.courses.add(course);
        }
    }

    public void removeCourse(Course course){
        if(courses.contains(course)){
            this.courses.remove(course);
        }
        // this.courses = courses
        //     .stream()
        //     .filter(c -> c != course)
        //     .collect(Collectors.toList());
    }
    
}
