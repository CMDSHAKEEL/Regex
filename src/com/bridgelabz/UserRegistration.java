package com.bridgelabz;
// importing Scanner
import java.util.Scanner;

public class UserRegistration {

    //giving the pattern as per the Regex rule

    private static final String  NamePattern = "^[A-Z][a-zA-Z]{2,}$";
    Scanner scanner = new Scanner(System.in);

    // Creating the method  for first name

    public void FirstnameValidator()
    {
        System.out.println("Enter First Name");
        String input = scanner.next();
        if (input.matches(NamePattern)) {
            System.out.println("first name sucessfully entered");
        }
        else {
            System.out.println("**Invalid First name**try again**");
            FirstnameValidator();
        }
    }
        //creating main method

    public static void main(String[] args) {
        System.out.println("Welcome to user registration");
        UserRegistration user = new UserRegistration();

        // calling the method thorugh the object
        user.FirstnameValidator();
    }
}

