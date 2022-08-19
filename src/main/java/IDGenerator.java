package main.java;
public class IDGenerator {
    
    private static int userIDCounter = 0;
    private static int courseIDCounter = 0;
    private static int postIDCounter = 0;

    public static synchronized int createUserID(){
        return userIDCounter++;
    }   

    public static synchronized int createCourseID(){
        return courseIDCounter++;
    }   

    public static synchronized int createPostID(){
        return postIDCounter++;
    }   
}
