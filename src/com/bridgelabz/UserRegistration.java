package com.bridgelabz;
// importing Scanner
import java.util.Scanner;

public class UserRegistration {

    //giving the pattern as per the Regex rule

    private static final String  NamePattern = "^[A-Z][a-zA-Z]{2,}$";

    // giving the pattern for mail in this pattern we can use special characters

    private static final String EmailPattern = "^[0-9a-zA-Z]+([.\\-+]?[a-zA-Z0-9]+)?\\@[0-9a-zA-Z]+.[a-zA-Z]{2,4}(.[a-zA-Z]{2,})*$";

    // giving the pattern for Phone NUmbers

    private static final String PhonenumberPattern ="^([\\+]?91)?[6-9]{1}[0-9]{9}$";

    // giving the pattern for Passwords

    private static final String PasswordPattern ="^.{8,}$";

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

    // creating method for mail

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

    //creating method for phone number

    public void phoneNumber(){
        System.out.println("Enter Phone Number");
        String input = scanner.next();
        if(input.matches(PhonenumberPattern)) {
            System.out.println("Phone number Entered sucessfully");
        }
        else{
            System.out.println("**Invalid Phone num**try again**");
        }
    }

    //creating method for password

    public void passwordValidator() {
        System.out.println("Enter the password:");
        String input = scanner.next();
        if (input.matches(PasswordPattern)) {
            System.out.println("password sucessfully entered");
        }
        else {
            System.out.println("**Invalid password**try again**");
            passwordValidator();
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
        user.phoneNumber();
        user.passwordValidator();
    }
}

