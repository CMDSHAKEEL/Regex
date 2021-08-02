package com.bridgelabz;
// importing Scanner
import java.util.Scanner;

public class UserRegistration {

    //giving the pattern as per the Regex rule

    private static final String  NamePattern = "^[A-Z][a-zA-Z]{2,}$";

    // giving the pattern for mail in this pattern we can use special characters

    private static final String EmailPattern = "^[0-9a-zA-Z]+([.\\-+]?[a-zA-Z0-9]+)?\\@[0-9a-zA-Z]+.[a-zA-Z]{2,4}(.[a-zA-Z]{2,})*$";

    Scanner scanner = new Scanner(System.in);

    // Creating the method  for first name

    public void firstnameValidator()
    {
        System.out.println("Enter First Name");
        String input = scanner.next();
        if (input.matches(NamePattern)) {
            System.out.println("first name sucessfully entered");
        }
        else {
            System.out.println("**Invalid First name**try again**");
            firstnameValidator();
        }
    }
     // ceration the method of Last name

    public void lastnameValidator() {
        System.out.println("Enter the last name:");
        String input = scanner.next();
        if (input.matches(NamePattern)) {
            System.out.println("last name sucessfully entered");
        } else {
            System.out.println("**Invalid last name**try again**");
            lastnameValidator();
        }
    }
    public void emailValidator() {
        System.out.println("Enter the email id :");
        String input = scanner.next();
        if (input.matches(EmailPattern)) {
            System.out.println("email id sucessfully entered");
        }
        else {
            System.out.println("**Invalid email id**try again**");
            emailValidator();
        }
    }

        //creating main method

    public static void main(String[] args) {
        System.out.println("Welcome to user registration");
        UserRegistration user = new UserRegistration();

        // calling the method thorugh the object

        user.firstnameValidator();
        user.lastnameValidator();
        user.emailValidator();
    }
}

