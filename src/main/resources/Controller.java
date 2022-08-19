package main.resources;

import main.java.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Controller {

    public static void main(String[] args) {

        // Denne sier at input fra System.in (terminalen) skal gå inn til reader-objektet
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        //Deklarerer disse her så de kan gis verdi inni try-catch block senere 
        String input = "";
        int intInput;

        // Så lenge input ikke er 0, fortsetter vi å spørre.
        while (0 != input.compareTo("0")) {
            System.out.println(
                "------------------------------------------------" 
                + "\nSkriv inn et heltall:"
                + "\n0: For å gå ut av programmet," 
                + "\n1: For å logge inn med brukernavn og passord,"
                + "\n2: For å lage en post," 
                + "\n3: For å kommentere på en post,"
                + "\n4: Finne alle poster som består av en string (søk),"
                + "\n5: Finne statestikk på brukere, hvor mange poster de har sett og laget."
            );

            // Prøver å lese brukerinput
            try {
                input = reader.readLine();
                intInput = Integer.parseInt(input);
            } catch (IOException IOE) {
                System.out.println("Noe gikk galt i innlesning av input." + IOE);
                break;
            } catch (NumberFormatException NFE) {
                System.out.println("Input må være tall." + NFE);
                break;
            }
            
            // Her går vi til ulik case, avhengig av hva brukerinputten var.
            // Innenfor hvert tilfelle kaller vi relevante funksjoner i main.java 
            // for å løse oppgaven.
            switch (intInput) {

            // 1: For å logge inn med brukernavn og passord
            case 1:
                // Henter brukernavn
                System.out.println("Skriv inn emailen din: ");
                try {
                    input = reader.readLine();
                } catch (Exception e) {
                    System.out.println("Noe gikk galt i innlesning av input.");
                    break;
                }
                String email = input;

                // Henter passord
                System.out.println("Skriv inn passordet ditt: ");
                try {
                    input = reader.readLine();
                } catch (Exception e) {
                    System.out.println("Noe gikk galt i innlesning av input.");
                    break;
                }
                String password = input;

                // Her kan vi gjøre så brukeren faktisk logger inn
                // Slik det er nå sjekker vi bare om brukernavn og passord-komboen finnes i db.
                if (Login.login(email, password) != -1) {
                    System.out.println("Brukeren ble funnet i databasen!");

                } else {
                    System.out.println("Bruker ikke funnet.");
                }
                ;
                break;

            // 2: For å lage en post
            case 2:
                System.out.println("Hvilken folder skal posten tilhøre?");

                System.out.println("Hvilken tag skal den ha?");
                break;

            case 3:
                System.out.println("Her skal noe skje om input er 3");
                break;

            case 4:
                System.out.println("Her skal noe skje om input er 4");
                break;

            case 5:
                System.out.println("Her skal noe skje om input er 5");
                break;

            default:
                if (intInput != 0) {
                    System.out.println("Handling er ikke laget for input: " + input);
                } else {
                    System.out.println("Går ut av programmet...");
                    try {
                        reader.close();
                    } catch (Exception e) {
                        System.out.println("Reader lukket seg ikke, men det er uproblematisk.");
                    }
                }
                break;
            }
        }
    }

}

// Notater, kommentarer:

// // metode som tar inn
// //ResultSet resultSet = executeQuery("SELECT * FROM Bruker");
// try {
// PreparedStatement preparedStatement = conn.prepareStatement("SELECT * FROM
// Bruker");
// ResultSet resultSet = preparedStatement.executeQuery();
// while(resultSet.next()) {
// System.out.println(resultSet.getString("epost"));
// System.out.println(resultSet.getString("navn"));
// System.out.println(resultSet.getInt("brukertype"));
// System.out.println(resultSet.getString("epost"));
// }
// } catch (Exception e) {
// System.out.println(e);
// }
