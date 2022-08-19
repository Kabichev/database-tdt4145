package main.resources;

import java.sql.*;


public class DBConnector{

    public static Connection connection;
    public DBConnector() {
    }    

    public static Connection connect() {
        String db_url = "jdbc:mysql://localhost:3306/dbproject";
        String user = "root";
        String password = "Aguafresh3";
        String driver = "com.mysql.cj.MysqlConnection";
        try {
            Class.forName(driver);
            
            }catch (Exception e)
            {
                throw new RuntimeException("Connection to driver: "+driver+" not achieved", e);
            }
            try{
                connection = DriverManager.getConnection(db_url, user, password);
            }catch (Exception e)
            {
                throw new RuntimeException("Unable to connect to DB_url: "+db_url, e);
            }
        return connection;
    }

    // public void checkUsernameAndPassword (String brukernavn, String password) {
    //     try {
    //         DBConnector.connect();

    //     }
    // catch (Exception e) {
    //     System.out.println("Feil i checkUsernameAndPassword klassen" + e);
    // }
    // }
    //         //Usikker på hvordan klassen under bør se ut
    // public void createPost (String Folder, String tag, String text) {
    //     try {
    //         DBConnector.connect();

    //     }
    // catch (Exception e) {
    //     System.out.println("Error in the createPost class: " + e);
    // }
    // }

    // public void commentPost (int postID, String text) {
    //     try {
    //         DBConnector.connect();

    //     }
    // catch (Exception e) {
    //     System.out.println("Error in the commentPost class: " + e);
    // }
    // }
}




//Henter sql spørringer i pandas
// jdbc driver class path