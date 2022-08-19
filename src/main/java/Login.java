package main.java;

import java.sql.Connection;
import java.sql.ResultSet;

import main.resources.*;

public final class Login {

    public static int login(String email, String password){
        // Returns user accessed from login

        //Make query
        String query = String.format(
            "SELECT userID FROM User_ WHERE Email = '%s' AND password_ = '%s'", email, password
            );
        System.out.println("Følgende query sendes til db: "+query);
        
        //Look for results in database
        int userID = -1;
        try{
            ResultSet resultSet = DBConnector.connect().prepareStatement(query).executeQuery();
            if(resultSet.next()){
                userID = resultSet.getInt("userID");
            }
        }catch (Exception e) {
                System.out.println(e);
                System.out.println("Feil skjedd i login, bruker ikke funnet...");
        }
        return userID;
    }
};
