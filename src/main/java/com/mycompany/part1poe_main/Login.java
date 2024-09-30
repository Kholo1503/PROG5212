/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.part1poe_main;

import java.util.regex.Pattern;

class Login {
    
    // Declaration of user details
    private String name;
    private String surname;
    private String Username;
    private String Password;
    
    // Check if the username is correctly formatted
    public boolean CheckUsername(String username) {
        // Username should contain "_" and be 5 or fewer characters
        if (username.contains("_") && username.length() <= 5) {
            System.out.println("Username has been captured.");
            return true;
        } else {
            System.out.println("Username has not been captured, please "
                    + "ensure that your username contains an underscore and is no more than 5 characters in length.");
            return false;
        }
    }

    // Check if the password meets the complexity requirements
    public boolean checkPasswordComplexity(String password) {
        // Regular expression patterns for validation
        Pattern check_num = Pattern.compile("[0123456789]");  // Ensure password contains a number
        Pattern check_specials = Pattern.compile("[*-`~!@$%&_'^]");  // Ensure password contains a special character
        Pattern check_Upper = Pattern.compile("[ABCDEFGHIJKLMNOPQRSTUVWXYZ]");  // Ensure password contains an uppercase letter
        
        // Check if the password meets all Criteria
        if (check_num.matcher(password).find() && 
            check_specials.matcher(password).find() && 
            check_Upper.matcher(password).find() && 
            password.length() >= 8) {
            
            System.out.println("Password successfully captured.");
            return true;
        } else {
            System.out.println("Password is not correctly formatted. Please ensure that the password contains at least 8 characters, a capital letter, a number, and a special character.");
            return false;
        }
    }

    // Register the user if the username and password are valid
    public String registerUser(String Username, String Password, String name, String surname) {
        this.name = name;
        this.surname = surname;
        
        // Check if the username is valid
        if (!CheckUsername(Username)) {
            return "Username incorrectly formatted.";
        } 
        // Check if the password meets complexity requirements
        else if (!checkPasswordComplexity(Password)) {
            return "The password does not meet the complexity requirements.";
        } else {
            // Store valid username and password
            this.Username = Username;
            this.Password = Password;
            return "The user has been registered!";
        }
    }

    // Verify login details
    public boolean loginUser(String username, String password) {
        // Check if the provided username and password match the registered details
        return this.Username.equals(username) && this.Password.equals(password);
    }

    // Return the login status message
    public String LoginStatus(String username, String password) {
        if (loginUser(username, password)) {
            return "Welcome! " + name + " " + surname + ", it's great to see you again.";
        } else {
            return "Username or password incorrect, please try again.";
        }
    }
}

